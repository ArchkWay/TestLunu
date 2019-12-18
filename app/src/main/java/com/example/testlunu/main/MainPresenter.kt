package com.example.testlunu.main

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import com.example.testlunu.BaseApp
import com.example.testlunu.db.CitySaved
import com.example.testlunu.main.MainContract.*
import com.example.testlunu.net.acu.cityinfo.CityWrapper
import com.example.testlunu.net.acu.weather.WeatherWrapper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainPresenter @Inject constructor(context: Context) : Presenter {
    private var view: View? = null
    @Inject
    lateinit var model: Model
    lateinit var listok: List<CitySaved>

    init {
        BaseApp[context].injector?.inject(this)
    }

    override fun checkAndAddIfNot(mvpView: View?, fragmentActivity: FragmentActivity, owner: LifecycleOwner) {
        this.view = mvpView

        model.getDBCities(fragmentActivity, owner)
        GlobalScope.launch {
            listok = emptyList()
//            getCity(view, "Москва")
//            getCity(view, "Санкт Петербург")
            while (listok.size == 0) {
                val lis = model.getDBCiti()
                if(lis != null) listok = lis
                if(listok != null){
                    view?.setCities(listok)
                }
            }

        }

    }

    override fun attachCity(mvpView: View?, nameCity: String?) {
        this.view = mvpView
        if (nameCity != null) {
            view?.setCity(model.getCityFromNet(nameCity))
        } else view?.errorToast()

    }

    override fun addItemToDb(mvpView: View?, citySaved: CitySaved) {
        model.addInDb(citySaved)
    }


    override fun detachView() {
        view = null
    }

    override fun getCity(mvp: View?, nameCity: String?) {
        this.view = mvp
        if (nameCity != null) model.getCityKey(nameCity).subscribe { getCityData(it, nameCity) }
    }

    private fun getCityData(cityList: List<CityWrapper>, name: String) {
        model.getCityData(cityList.firstOrNull()?.key ?: "0")
            .subscribe { reconstructObjects(it, name) }
    }

    private fun reconstructObjects(it: WeatherWrapper, nameCity: String) {
        val citySaved = CitySaved(0, nameCity,
            "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMinimum()?.getValue()} - " +
                    "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMaximum()?.getValue()}",
            it.getDailyForecasts().firstOrNull()?.getDay()?.getIconPhrase()
                ?: "нет данных",
            it.getDailyForecasts().firstOrNull()?.getDay()?.getWind()?.getSpeed()?.getUnit()
                ?: "нет данных")
        view?.setCity(citySaved)
        model.addInDb(citySaved)
    }

}
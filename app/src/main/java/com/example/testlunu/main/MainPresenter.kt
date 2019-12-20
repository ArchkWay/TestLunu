package com.example.testlunu.main

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import com.example.testlunu.BaseApp
import com.example.testlunu.db.CitySaved
import com.example.testlunu.main.MainContract.*
import com.example.testlunu.net.acu.cityinfo.CityWrapper
import com.example.testlunu.net.acu.weather.decompiled.WeatherWrapper
import javax.inject.Inject

class MainPresenter @Inject constructor(context: Context) : Presenter, DirectConnector {
    private var view: View? = null
    @Inject
    lateinit var model: Model

    init {
        BaseApp[context].injector?.inject(this)
        (model as MainModel).listener = this
    }

    override fun checkAndAddIfNot(mvpView: View?,fragmentActivity: FragmentActivity, owner: LifecycleOwner) {
        this.view = mvpView
        model.getDBCities(fragmentActivity, owner)
    }

    override fun attachCity(mvpView: View?, nameCity: String?) {
        this.view = mvpView
        if (nameCity != null) view?.setCity(model.getCityFromNet(nameCity))
        else view?.errorToast()

    }

    override fun addItemToDb(mvpView: View?, citySaved: CitySaved) {
        model.addInDb(citySaved)
    }


    override fun detachView() {
        view = null
    }

    override fun getCity(mvp: View?, nameCity: String?) {
        this.view = mvp
        if (nameCity != null){
            model.getCityKey(nameCity).subscribe {
                getCityData(it, (it.firstOrNull()?.localizedName) ?: nameCity)}
        }
    }

    private fun getCityData(cityList: List<CityWrapper>, name: String) {
        model.getCityData(cityList.firstOrNull()?.key ?: "0").subscribe {
            reconstructObjects(it, name) }
    }

    private fun reconstructObjects(it: WeatherWrapper, nameCity: String) {
        val citySaved = CitySaved(
            0, nameCity,
            "${it.dailyForecasts?.firstOrNull()?.temperature?.minimum?.value} - " +
                    "${it.dailyForecasts?.firstOrNull()?.temperature?.maximum?.value}",
            it.dailyForecasts?.firstOrNull()?.day?.iconPhrase
                ?: "нет данных",
            it.dailyForecasts?.firstOrNull()?.day?.wind?.getSpeed()?.unit
                ?: "нет данных"
        )
        if(!citySaved.temperature.contains("null")) view?.setCity(citySaved)
        else view?.errorToast()
    }

    override fun sendIntoPresenter(list: List<CitySaved>?) {
        if(list.isNullOrEmpty()){
            getCity(view, "Москва")
            getCity(view, "Санкт Петербург")
        }
        else view?.setCities(list)
    }
}
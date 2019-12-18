package com.example.testlunu.main

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Region
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.testlunu.BaseApp
import com.example.testlunu.db.CitySaved
import com.example.testlunu.db.CityViewModel
import com.example.testlunu.net.Api
import com.example.testlunu.net.RetrofitProvider
import com.example.testlunu.net.acu.cityinfo.*
import com.example.testlunu.net.acu.weather.WeatherWrapper
import com.example.testlunu.net.apiKey
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainModel @Inject constructor(context: Context) : MainContract.Model {
    @Inject lateinit var provider: RetrofitProvider
    private var api: Api
    private lateinit var cityViewModel: CityViewModel
    lateinit var activity: FragmentActivity
    lateinit var lifeCycleOwner: LifecycleOwner
    var list: List<CitySaved>? = listOf()

    init {
        BaseApp[context].injector?.inject(this)
        api = provider.api
    }


    override fun getDBCities(fragmentActivity: FragmentActivity, owner: LifecycleOwner): List<CitySaved>? {
        activity = fragmentActivity
        lifeCycleOwner = owner
        cityViewModel = ViewModelProviders.of(fragmentActivity).get(CityViewModel::class.java)
        var list: List<CitySaved>? = listOf()
        cityViewModel.allCities.observe(lifeCycleOwner, Observer<List<CitySaved>> {
                t: List<CitySaved>? ->
             list = t
        cityViewModel.allCities.removeObservers(owner)
        })
        return list
    }

    override fun getDBCiti(): List<CitySaved>? {
        var listr: List<CitySaved>? = listOf()

        GlobalScope.launch {
            while (list.isNullOrEmpty()){
                listr = list
            }
        }
        return listr
    }

    @SuppressLint("CheckResult")
    override fun getCityFromNet(name: String): CitySaved? {
        var citySaved: CitySaved? = null
        api.getCityKey(apiKey, name, "ru-RU", false).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe {
                val localizedName = it?.firstOrNull()?.localizedName
                if (localizedName != null) {
                    api.getWeather(it.firstOrNull()?.key ?: "1", apiKey, "ru-RU",
                        details = false,
                        metric = true)
                        .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                        .subscribe {
                            citySaved = CitySaved(0, localizedName,
                                    "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMinimum()?.getValue()} - " +
                                            "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMaximum()?.getValue()}",
                                    it.getDailyForecasts().firstOrNull()?.getDay()?.getIconPhrase()
                                        ?: "нет данных",
                                    it.getDailyForecasts().firstOrNull()?.getDay()?.getWind()?.getSpeed()?.getUnit()
                                        ?: "нет данных"

                                )
                        }
                }
            }
        return citySaved
    }

    override fun addInDb(citySaved: CitySaved?) {
        cityViewModel.allCities.observe(lifeCycleOwner, Observer<List<CitySaved>> {
            cities ->
            if (!cities.contains(citySaved) && citySaved != null) {
                cityViewModel.insert(citySaved)
            }
            cityViewModel.allCities.removeObservers(lifeCycleOwner)
        })
    }

    override fun getCityKey(name: String): Observable<List<CityWrapper>> {
        val error = mutableListOf<CityWrapper>()
        error += CityWrapper("0","0","0","0","0","0","0", Region(1,1,1,1), Country(), AdministrativeArea(),
            TimeZone(), GeoPosition(), true, listOf(SupplementalAdminArea()), listOf("0"), Details() )
        return api.getCityKey(apiKey, name, "ru-RU", false).onErrorReturnItem(error).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }

    override fun getCityData(key: String): Observable<WeatherWrapper> {
        return  api.getWeather(key, apiKey, "ru-RU", false, true)
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }
}
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
import com.example.testlunu.net.acu.weather.decompiled.Headline
import com.example.testlunu.net.acu.weather.decompiled.WeatherWrapper
import com.example.testlunu.net.apiKey
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainModel @Inject constructor(context: Context) : MainContract.Model {
    @Inject
    lateinit var provider: RetrofitProvider
    private var api: Api
    private lateinit var cityViewModel: CityViewModel
    private lateinit var activity: FragmentActivity
    private lateinit var lifeCycleOwner: LifecycleOwner
    var list: List<CitySaved>?  = null
    lateinit var listener: DirectConnector


    init {
        BaseApp[context].injector?.inject(this)
        api = provider.api
    }


    override fun getDBCities(fragmentActivity: FragmentActivity, owner: LifecycleOwner){
        activity = fragmentActivity
        lifeCycleOwner = owner
        cityViewModel = ViewModelProviders.of(fragmentActivity).get(CityViewModel::class.java)
        cityViewModel.allCities.observe(lifeCycleOwner, Observer<List<CitySaved>> { cities ->
                listener.sendIntoPresenter(cities)
            cityViewModel.allCities.removeObservers(lifeCycleOwner)
            })
    }

    override fun getDBCiti(): List<CitySaved>? {
        return list
    }


    @SuppressLint("CheckResult")
    override fun getCityFromNet(name: String): CitySaved? {
        var citySaved: CitySaved? = null
        api.getCityKey(apiKey, name, "ru-RU", false).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe { it ->
                val localizedName = it?.firstOrNull()?.localizedName
                if (localizedName != null) {
                    api.getWeather(
                        it.firstOrNull()?.key ?: "1", apiKey, "ru-RU",
                        details = false,
                        metric = true
                    )
                        .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                        .subscribe {
                            citySaved = CitySaved(
                                0, localizedName,
                                "${it.dailyForecasts?.firstOrNull()?.temperature?.minimum?.value} - " +
                                        "${it.dailyForecasts?.firstOrNull()?.temperature?.maximum?.value}",
                                it.dailyForecasts?.firstOrNull()?.day?.iconPhrase
                                    ?: "нет данных",
                                it.dailyForecasts?.firstOrNull()?.day?.wind?.getSpeed()?.unit
                                    ?: "нет данных"
                            )
                        }
                }
            }
        return citySaved
    }

    override fun addInDb(citySaved: CitySaved?) {
        cityViewModel.allCities.observe(lifeCycleOwner, Observer<List<CitySaved>> { cities ->
            if (!cities.any { it.name == citySaved?.name } && citySaved != null && !citySaved.temperature.contains("null")) {
                cityViewModel.insert(citySaved)
            }
            cityViewModel.allCities.removeObservers(lifeCycleOwner)
        })
    }

    override fun getCityKey(name: String): Observable<List<CityWrapper>> {
        val error = mutableListOf<CityWrapper>()
        error += CityWrapper(
            "0", "0", "0", "0", "0", "0", "0", Region(1, 1, 1, 1), Country("0", "0", "0"), AdministrativeArea( "0", "0", "0", 0, "0", "0", "0"),
            TimeZone( "0", "0", 0, false, "0"), GeoPosition(0.1f,0.1f, Elevation(Metric(0, "0",0),
                Imperial(0, "0",0))), true, listOf(SupplementalAdminArea(0, "0", "0")), listOf("0"), null
        )
        return api.getCityKey(apiKey, name, "ru-RU", false).onErrorReturnItem(error)
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }

    override fun getCityData(key: String): Observable<WeatherWrapper> {
        return api.getWeather(key, apiKey, "ru-RU", details = false, metric = true).onErrorReturnItem(
            WeatherWrapper(
                Headline(),
                listOf()
            )
        )
            .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }
}
interface DirectConnector {
    fun sendIntoPresenter(list: List<CitySaved>?)
}
package com.example.testlunu.main

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import com.example.testlunu.db.CitySaved
import com.example.testlunu.net.acu.cityinfo.CityWrapper
import com.example.testlunu.net.acu.weather.WeatherWrapper
import io.reactivex.Observable
import java.util.*

interface MainContract {
    interface View {
        fun setCities(listCities: List<CitySaved?>?)
        fun setCity(citySaved: CitySaved?)
        fun setCitiesFromDB(citySaved: CitySaved?)
        fun errorToast()
    }

    interface Presenter : MainContractPresenter<View?>

    interface Model {
        fun getDBCities(fragmentActivity: FragmentActivity, owner: LifecycleOwner): List<CitySaved>?
        fun getDBCiti(): List<CitySaved>?
        fun getCityFromNet (name: String): CitySaved?
        fun addInDb (citySaved: CitySaved?)

        fun getCityKey(name: String): Observable<List<CityWrapper>>
        fun getCityData(key: String): Observable <WeatherWrapper>
    }
}
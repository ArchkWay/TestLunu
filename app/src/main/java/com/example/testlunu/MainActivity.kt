package com.example.testlunu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpleroomkt.CityAdapter
import com.example.testlunu.db.CitySaved
import com.example.testlunu.net.Api
import com.example.testlunu.net.CityData
import com.example.testlunu.net.RetrofitProvider
import com.example.testlunu.net.acu.cityinfo.CityWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),  CityAdapter.TouchEvent{
    override fun onClick(item: CitySaved) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject lateinit var provider: RetrofitProvider
    lateinit var cityAdapter:CityAdapter

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseApp[this].injector?.inject(this)
        val api: Api = provider.api
        cityAdapter = CityAdapter(this, this)
        rvMain.adapter = cityAdapter
        rvMain.layoutManager = LinearLayoutManager(this)
        api.getCity(apikey, "Москва", "ru-RU", false ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe {
            api.getWeather(it.firstOrNull()?.key ?: "1", apikey,"ru-RU", false, true).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe {
                cityAdapter.setItems(CitySaved("Москва", "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMinimum()?.getValue()} - " +
                        "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMaximum()?.getValue()}" ))
            }
        }
    }
}

val apikey = "aIy0wHPCv5H8GaqRq1DRiUfyWJPjIagk"

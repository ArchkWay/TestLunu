package com.example.testlunu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpleroomkt.CityAdapter
import com.example.simpleroomkt.CityViewModel
import com.example.testlunu.db.CitySaved
import com.example.testlunu.net.Api
import com.example.testlunu.net.RetrofitProvider
import com.example.testlunu.net.apikey
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),  CityAdapter.TouchEvent{

    override fun onClick(item: CitySaved) {
        val descriptionFragment = DescriptionFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, descriptionFragment)
        descriptionFragment.setData(item)
    }

    @Inject lateinit var provider: RetrofitProvider
    lateinit var cityAdapter:CityAdapter
    lateinit var api: Api
    private lateinit var cityViewModel: CityViewModel

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseApp[this].injector?.inject(this)
        cityViewModel = ViewModelProvider.AndroidViewModelFactory(application).create(CityViewModel::class.java)
        api = provider.api
        cityAdapter = CityAdapter(this, this)
        rvMain.adapter = cityAdapter
        rvMain.layoutManager = LinearLayoutManager(this)
        addCity("Москва")
        addCity("Санкт Петербург")
        btnAdd.setOnClickListener{
            addCity(etCity.text.toString())
        }
    }


    @SuppressLint("CheckResult")
    fun addCity(cityName: String){
        api.getCity(apikey, cityName, "ru-RU", false ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe {
            val cityName = it?.firstOrNull()?.localizedName
            if(cityName != null) {
                api.getWeather(it.firstOrNull()?.key ?: "1", apikey, "ru-RU", false, true)
                    .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        val city = CitySaved(
                            0,
                            cityName,
                            "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMinimum()?.getValue()} - " +
                                    "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMaximum()?.getValue()}",
                            it.getDailyForecasts().firstOrNull()?.getDay()?.getTotalLiquid()?.getUnit() ?: getString(R.string.no_data),
                            it.getDailyForecasts().firstOrNull()?.getDay()?.getWind()?.getSpeed()?.getUnit() ?: getString(R.string.no_data)
                        )
                        cityAdapter.addItem(city)
                    }
            }
            else Toast.makeText(this, "Incorrect", LENGTH_SHORT).show()
        }
    }
}


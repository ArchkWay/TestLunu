package com.example.testlunu

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testlunu.db.CityParcel
import com.example.testlunu.db.CitySaved
import com.example.testlunu.db.CityViewModel
import com.example.testlunu.net.Api
import com.example.testlunu.net.RetrofitProvider
import com.example.testlunu.net.apikey
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), CityAdapter.TouchEvent {


    @Inject
    lateinit var provider: RetrofitProvider
    lateinit var cityAdapter: CityAdapter
    lateinit var api: Api
    private lateinit var cityViewModel: CityViewModel
    private var first = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseApp[this].injector?.inject(this)
        cityViewModel =
            ViewModelProvider.AndroidViewModelFactory(application).create(CityViewModel::class.java)
        api = provider.api
        cityAdapter = CityAdapter(this, this)
        rvMain.adapter = cityAdapter
        rvMain.layoutManager = LinearLayoutManager(this)
        checkEmptyOrNot()
        btnAdd.setOnClickListener {
            addCity(etCity.text.toString())
        }
    }

    private fun checkEmptyOrNot() {
        cityViewModel.allCities.observe(this, Observer { cities ->
            if (!first) {
                if (cities.isEmpty()) {
                    addCity("Москва")
                    addCity("Санкт Петербург")
                } else {
                    cities.forEach { cityAdapter.addItem(it) }
                    first = true
                }
            }
        })
    }


    @SuppressLint("CheckResult")
    fun addCity(cityName: String) {
        api.getCity(apikey, cityName, "ru-RU", false).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribe {
            val localizedName = it?.firstOrNull()?.localizedName
            if (localizedName != null) {
                api.getWeather(it.firstOrNull()?.key ?: "1", apikey, "ru-RU", false, true)
                    .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        val city = CitySaved(
                            0,
                            localizedName,
                            "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMinimum()?.getValue()} - " +
                                    "${it.getDailyForecasts().firstOrNull()?.getTemperature()?.getMaximum()?.getValue()}",
                            it.getDailyForecasts().firstOrNull()?.getDay()?.getIconPhrase()
                                ?: getString(R.string.no_data),
                            it.getDailyForecasts().firstOrNull()?.getDay()?.getWind()?.getSpeed()?.getUnit()
                                ?: getString(R.string.no_data)
                        )
                        cityAdapter.addItem(city)

                        cityViewModel.allCities.observe(this, Observer { cities ->
                            if (!cities.contains(city)) {
                                cityViewModel.insert(city)
                            }
                        })
                    }
            } else Toast.makeText(this, "Incorrect", LENGTH_SHORT).show()
        }
    }

    override fun onClick(item: CitySaved) {
        val intent = Intent(this, DescriptionActivity().javaClass)
        intent.putExtra(
            "city_save",
            CityParcel(item.name, item.temperature, item.humidity, item.windSpeed)
        )
        startActivity(intent)
    }

    override fun onHold(item: CitySaved) {
        cityViewModel.delete(item)
    }
}


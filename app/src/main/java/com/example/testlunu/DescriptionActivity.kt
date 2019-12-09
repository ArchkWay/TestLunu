package com.example.testlunu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testlunu.db.CityParcel
import kotlinx.android.synthetic.main.description_info.*


class DescriptionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_info)
        val item = intent.getParcelableExtra<CityParcel>("city_save")

        tvCityNameInfo.text = item.name
        tvHumidity.text = item.humidity
        tvWindSpeed.text = item.windSpeed
        tvTemperature.text = item.temperature
    }
}

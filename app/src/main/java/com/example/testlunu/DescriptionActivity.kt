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
        with(item) {
            tvCityNameInfo.text = name
            tvHumidity.text = getString(R.string.humidity).plus(" $humidity")
            tvWindSpeed.text = getString(R.string.wind_speed).plus(" $windSpeed")
            tvTemperature.text = getString(R.string.wind_speed).plus(" $temperature")
        }
    }
}

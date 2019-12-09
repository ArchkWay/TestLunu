package com.example.testlunu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testlunu.db.CitySaved
import kotlinx.android.synthetic.main.description_info.*

class DescriptionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View = inflater.inflate(R.layout.description_info, container, false)


    fun setData(data: CitySaved){
        tvCityNameInfo.text = data.name
        tvHumidity.text = data.humidity
        tvWindSpeed.text = data.windSpeed
        tvTemperature.text = data.temperature
    }
}
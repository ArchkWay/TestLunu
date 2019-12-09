package com.example.testlunu

import com.example.testlunu.net.CityData

interface MainContract {
    interface View {
        fun setCities(list: List<CityData>)
        fun setCitiesFromDB(list: List<CityData>)
    }
}
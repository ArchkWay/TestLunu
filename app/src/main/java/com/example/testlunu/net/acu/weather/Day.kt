package com.example.testlunu.net.acu.weather

import com.example.testlunu.net.acu.weather.decompiled.Ice
import com.example.testlunu.net.acu.weather.decompiled.Rain
import com.example.testlunu.net.acu.weather.decompiled.Snow
import com.example.testlunu.net.acu.weather.decompiled.WindGust

data class Day(
        val icon: Int?,
        val iconPhrase: String?,
        val hasPrecipitation: Boolean?,
        val shortPhrase: String?,
        val longPhrase: String?,
        val precipitationProbability: Int?,
        val thunderstormProbability: Int?,
        val rainProbability: Int?,
        val snowProbability: Int?,
        val iceProbability: Int?,
        val wind: Wind?,
        val windGust: WindGust?,
        val totalLiquid: TotalLiquid?,
        val rain: Rain?,
        val snow: Snow?,
        val ice: Ice?,
        val hoursOfPrecipitation: Int?,
        val hoursOfRain: Int?,
        val hoursOfSnow: Int?,
        val hoursOfIce: Int?,
        val cloudCover: Int?
    )


package com.example.testlunu.net.acu.weather

import com.example.testlunu.net.acu.weather.decompiled.Moon
import com.example.testlunu.net.acu.weather.decompiled.Night
import com.example.testlunu.net.acu.weather.decompiled.RealFeelTemperature
import com.example.testlunu.net.acu.weather.decompiled.RealFeelTemperatureShade
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DailyForecast (

    @SerializedName("Date")
    @Expose
    var date: String?,
    @SerializedName("EpochDate")
    @Expose
    var epochDate: Int?,
    @SerializedName("Sun")
    @Expose
    var sun: Sun?,
    @SerializedName("Moon")
    @Expose
    var moon: Moon?,
    @SerializedName("Temperature")
    @Expose
    var temperature: Temperature?,
    @SerializedName("RealFeelTemperature")
    @Expose
    var realFeelTemperature: RealFeelTemperature?,
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    var realFeelTemperatureShade: RealFeelTemperatureShade?,
    @SerializedName("HoursOfSun")
    @Expose
    var hoursOfSun: Float?,
    @SerializedName("DegreeDaySummary")
    @Expose
    var degreeDaySummary: DegreeDaySummary?,
    @SerializedName("AirAndPollen")
    @Expose
    var airAndPollen: List<AirAndPollen>?,
    @SerializedName("Day")
    @Expose
    var day: Day?,
    @SerializedName("Night")
    @Expose
    var night: Night?,
    @SerializedName("Sources")
    @Expose
    var sources: List<String>?,
    @SerializedName("MobileLink")
    @Expose
    var mobileLink: String?,
    @SerializedName("Link")
    @Expose
    var link: String?
)
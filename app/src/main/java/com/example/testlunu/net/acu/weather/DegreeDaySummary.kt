package com.example.testlunu.net.acu.weather

import com.example.testlunu.net.acu.weather.decompiled.Heating
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DegreeDaySummary (
    @SerializedName("Heating")
    @Expose
    var heating: Heating?,
    @SerializedName("Cooling")
    @Expose
    var cooling: Cooling?
)
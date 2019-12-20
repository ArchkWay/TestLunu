package com.example.testlunu.net.acu.weather

import com.example.testlunu.net.acu.weather.decompiled.Maximum
import com.example.testlunu.net.acu.weather.decompiled.Minimum
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Temperature {

    @SerializedName("Minimum")
    @Expose
    var minimum: Minimum? = null
    @SerializedName("Maximum")
    @Expose
    var maximum: Maximum? = null
}
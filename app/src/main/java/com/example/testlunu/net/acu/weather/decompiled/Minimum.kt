package com.example.testlunu.net.acu.weather.decompiled

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Minimum {

    @SerializedName("Value")
    @Expose
    var value: Float? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}
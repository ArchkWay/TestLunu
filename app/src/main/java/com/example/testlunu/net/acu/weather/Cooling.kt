package com.example.testlunu.net.acu.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cooling (
    @SerializedName("Value")
    @Expose
    var value: Int?,
    @SerializedName("Unit")
    @Expose
    var unit: String?,
    @SerializedName("UnitType")
    @Expose
    var unitType: Int?
)
package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Imperial(
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
package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GeoPosition (
    @SerializedName("Latitude")
    @Expose
    var latitude: Float?,
    @SerializedName("Longitude")
    @Expose
    var longitude: Float?,
    @SerializedName("Elevation")
    @Expose
    var elevation: Elevation?
)
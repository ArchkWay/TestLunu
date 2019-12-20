package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Elevation (
    @SerializedName("Metric")
    @Expose
    var metric: Metric?,
    @SerializedName("Imperial")
    @Expose
    var imperial: Imperial?
)
package com.example.testlunu.net.acu.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Sun (
    @SerializedName("Rise")
    @Expose
    var rise: String?,
    @SerializedName("EpochRise")
    @Expose
    var epochRise: Int?,
    @SerializedName("Set")
    @Expose
    var set: String?,
    @SerializedName("EpochSet")
    @Expose
    var epochSet: Int?
)
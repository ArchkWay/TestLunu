package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TimeZone (
    @SerializedName("Code")
    @Expose
    var code: String?,
    @SerializedName("Name")
    @Expose
    var name: String?,
    @SerializedName("GmtOffset")
    @Expose
    var gmtOffset: Int?,
    @SerializedName("IsDaylightSaving")
    @Expose
    var isDaylightSaving: Boolean?,
    @SerializedName("NextOffsetChange")
    @Expose
    var nextOffsetChange: Any?
)
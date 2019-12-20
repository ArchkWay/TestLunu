package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Region (
    @SerializedName("ID")
    @Expose
    var iD: String?,
    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String?,
    @SerializedName("EnglishName")
    @Expose
    var englishName: String?
    )
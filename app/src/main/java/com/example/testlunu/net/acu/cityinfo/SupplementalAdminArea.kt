package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SupplementalAdminArea (
    @SerializedName("Level")
    @Expose
    var level: Int?,
    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String?,
    @SerializedName("EnglishName")
    @Expose
    var englishName: String?
)
package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AdministrativeArea (
    @SerializedName("ID")
    @Expose
    var iD: String?,
    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String?,
    @SerializedName("EnglishName")
    @Expose
    var englishName: String?,
    @SerializedName("Level")
    @Expose
    var level: Int?,
    @SerializedName("LocalizedType")
    @Expose
    var localizedType: String?,
    @SerializedName("EnglishType")
    @Expose
    var englishType: String?,
    @SerializedName("CountryID")
    @Expose
    var countryID: String?
)
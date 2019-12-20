package com.example.testlunu.net.acu.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AirAndPollen (
    @SerializedName("Name")
    @Expose
    var name: String?,
    @SerializedName("Value")
    @Expose
    var value: Int?,
    @SerializedName("Category")
    @Expose
    var category: String?,
    @SerializedName("CategoryValue")
    @Expose
    var categoryValue: Int?,
    @SerializedName("Type")
    @Expose
    var type: String?
)
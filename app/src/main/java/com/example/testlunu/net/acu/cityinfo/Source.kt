package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Source (
    @SerializedName("DataType")
    @Expose
    var dataType: String?,
    @SerializedName("Source")
    @Expose
    var source: String?,
    @SerializedName("SourceId")
    @Expose
    var sourceId: Int?
    )
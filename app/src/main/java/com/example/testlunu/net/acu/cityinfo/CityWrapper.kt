package com.example.testlunu.net.acu.cityinfo

import android.graphics.Region

import com.google.gson.annotations.SerializedName

data class CityWrapper (

    @SerializedName("Version")
    val version: String,
    @SerializedName("Key")
    val key: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Rank")
    val rank: String,
    @SerializedName("LocalizedName")
    val localizedName: String,
    @SerializedName("EnglishName")
    val englishName: String,
    @SerializedName("PrimaryPostalCode")
    val primaryPostalCode: String,
    @SerializedName("Region")
    val region: Region,
    @SerializedName("Country")
    val country: Country,
    @SerializedName("AdministrativeArea")
    val administrativeArea: AdministrativeArea,
    @SerializedName("TimeZone")
    val timeZone: TimeZone,
    @SerializedName("GeoPosition")
    val geoPosition: GeoPosition,
    @SerializedName("IsAlias")
    val isAlias: Boolean,
    @SerializedName("SupplementalAdminAreas")
    val supplementalAdminAreas: List<SupplementalAdminArea>,
    @SerializedName("DataSets")
    val dataSets: List<String>,
    @SerializedName("Details")
    val details: Details)


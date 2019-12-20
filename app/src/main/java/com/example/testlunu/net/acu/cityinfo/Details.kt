package com.example.testlunu.net.acu.cityinfo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Details (
    @SerializedName("Key")
    @Expose
    var key: String?,
    @SerializedName("StationCode")
    @Expose
    var stationCode: String?,
    @SerializedName("StationGmtOffset")
    @Expose
    var stationGmtOffset: Int?,
    @SerializedName("BandMap")
    @Expose
    var bandMap: String?,
    @SerializedName("Climo")
    @Expose
    var climo: String?,
    @SerializedName("LocalRadar")
    @Expose
    var localRadar: String?,
    @SerializedName("MediaRegion")
    @Expose
    var mediaRegion: Any?,
    @SerializedName("Metar")
    @Expose
    var metar: String?,
    @SerializedName("NXMetro")
    @Expose
    var nXMetro: String?,
    @SerializedName("NXState")
    @Expose
    var nXState: String?,
    @SerializedName("Population")
    @Expose
    var population: Int?,
    @SerializedName("PrimaryWarningCountyCode")
    @Expose
    var primaryWarningCountyCode: String?,
    @SerializedName("PrimaryWarningZoneCode")
    @Expose
    var primaryWarningZoneCode: String?,
    @SerializedName("Satellite")
    @Expose
    var satellite: String?,
    @SerializedName("Synoptic")
    @Expose
    var synoptic: String?,
    @SerializedName("MarineStation")
    @Expose
    var marineStation: String?,
    @SerializedName("MarineStationGMTOffset")
    @Expose
    var marineStationGMTOffset: Any?,
    @SerializedName("VideoCode")
    @Expose
    var videoCode: String?,
    @SerializedName("LocationStem")
    @Expose
    var locationStem: String?,
    @SerializedName("PartnerID")
    @Expose
    var partnerID: Any?,
    @SerializedName("Sources")
    @Expose
    var sources: List<Source>?,
    @SerializedName("CanonicalPostalCode")
    @Expose
    var canonicalPostalCode: String?,
    @SerializedName("CanonicalLocationKey")
    @Expose
    var canonicalLocationKey: String?
)
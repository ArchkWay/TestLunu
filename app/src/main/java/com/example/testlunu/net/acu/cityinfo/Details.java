package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Details {

    @SerializedName("Key")
    @Expose
    public String key;
    @SerializedName("StationCode")
    @Expose
    public String stationCode;
    @SerializedName("StationGmtOffset")
    @Expose
    public Integer stationGmtOffset;
    @SerializedName("BandMap")
    @Expose
    public String bandMap;
    @SerializedName("Climo")
    @Expose
    public String climo;
    @SerializedName("LocalRadar")
    @Expose
    public String localRadar;
    @SerializedName("MediaRegion")
    @Expose
    public Object mediaRegion;
    @SerializedName("Metar")
    @Expose
    public String metar;
    @SerializedName("NXMetro")
    @Expose
    public String nXMetro;
    @SerializedName("NXState")
    @Expose
    public String nXState;
    @SerializedName("Population")
    @Expose
    public Integer population;
    @SerializedName("PrimaryWarningCountyCode")
    @Expose
    public String primaryWarningCountyCode;
    @SerializedName("PrimaryWarningZoneCode")
    @Expose
    public String primaryWarningZoneCode;
    @SerializedName("Satellite")
    @Expose
    public String satellite;
    @SerializedName("Synoptic")
    @Expose
    public String synoptic;
    @SerializedName("MarineStation")
    @Expose
    public String marineStation;
    @SerializedName("MarineStationGMTOffset")
    @Expose
    public Object marineStationGMTOffset;
    @SerializedName("VideoCode")
    @Expose
    public String videoCode;
    @SerializedName("LocationStem")
    @Expose
    public String locationStem;
    @SerializedName("PartnerID")
    @Expose
    public Object partnerID;
    @SerializedName("Sources")
    @Expose
    public List<Source> sources = null;
    @SerializedName("CanonicalPostalCode")
    @Expose
    public String canonicalPostalCode;
    @SerializedName("CanonicalLocationKey")
    @Expose
    public String canonicalLocationKey;

}
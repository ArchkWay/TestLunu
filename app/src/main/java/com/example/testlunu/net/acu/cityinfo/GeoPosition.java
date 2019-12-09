package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoPosition {

    @SerializedName("Latitude")
    @Expose
    public Float latitude;
    @SerializedName("Longitude")
    @Expose
    public Float longitude;
    @SerializedName("Elevation")
    @Expose
    public Elevation elevation;

}
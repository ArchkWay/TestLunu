package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Elevation {

    @SerializedName("Metric")
    @Expose
    public Metric metric;
    @SerializedName("Imperial")
    @Expose
    public Imperial imperial;

}
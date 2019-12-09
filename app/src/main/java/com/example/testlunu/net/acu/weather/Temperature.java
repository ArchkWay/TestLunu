package com.example.testlunu.net.acu.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Temperature {
    public Minimum getMinimum() {
        return minimum;
    }

    public Maximum getMaximum() {
        return maximum;
    }

    @SerializedName("Minimum")
    @Expose
    public Minimum minimum;
    @SerializedName("Maximum")
    @Expose
    public Maximum maximum;

}
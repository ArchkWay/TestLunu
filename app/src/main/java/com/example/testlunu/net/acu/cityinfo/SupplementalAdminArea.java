package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupplementalAdminArea {

    @SerializedName("Level")
    @Expose
    public Integer level;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;

}
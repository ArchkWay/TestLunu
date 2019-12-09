package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeZone {

    @SerializedName("Code")
    @Expose
    public String code;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("GmtOffset")
    @Expose
    public Integer gmtOffset;
    @SerializedName("IsDaylightSaving")
    @Expose
    public Boolean isDaylightSaving;
    @SerializedName("NextOffsetChange")
    @Expose
    public Object nextOffsetChange;

}
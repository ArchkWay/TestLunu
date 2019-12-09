package com.example.testlunu.net.acu.cityinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("DataType")
    @Expose
    public String dataType;
    @SerializedName("Source")
    @Expose
    public String source;
    @SerializedName("SourceId")
    @Expose
    public Integer sourceId;

}
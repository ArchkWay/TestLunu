package com.example.testlunu.net.acu.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speed {
    public Float getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public Integer getUnitType() {
        return unitType;
    }

    @SerializedName("Value")
    @Expose
    public Float value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}
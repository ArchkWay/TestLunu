package com.example.testlunu.net.acu.weather;

import com.example.testlunu.net.acu.weather.decompiled.Direction;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {
    public Speed getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }

    @SerializedName("Speed")
    @Expose
    public Speed speed;
    @SerializedName("Direction")
    @Expose
    public Direction direction;

}
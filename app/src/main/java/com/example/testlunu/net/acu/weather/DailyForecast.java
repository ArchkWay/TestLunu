package com.example.testlunu.net.acu.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyForecast {
    public String getDate() {
        return date;
    }

    public Integer getEpochDate() {
        return epochDate;
    }

    public Sun getSun() {
        return sun;
    }

    public Moon getMoon() {
        return moon;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    public Float getHoursOfSun() {
        return hoursOfSun;
    }

    public DegreeDaySummary getDegreeDaySummary() {
        return degreeDaySummary;
    }

    public List<AirAndPollen> getAirAndPollen() {
        return airAndPollen;
    }

    public Day getDay() {
        return day;
    }

    public Night getNight() {
        return night;
    }

    public List<String> getSources() {
        return sources;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public String getLink() {
        return link;
    }

    @SerializedName("Date")
    @Expose
    public String date;
    @SerializedName("EpochDate")
    @Expose
    public Integer epochDate;
    @SerializedName("Sun")
    @Expose
    public Sun sun;
    @SerializedName("Moon")
    @Expose
    public Moon moon;
    @SerializedName("Temperature")
    @Expose
    public Temperature temperature;
    @SerializedName("RealFeelTemperature")
    @Expose
    public RealFeelTemperature realFeelTemperature;
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    public RealFeelTemperatureShade realFeelTemperatureShade;
    @SerializedName("HoursOfSun")
    @Expose
    public Float hoursOfSun;
    @SerializedName("DegreeDaySummary")
    @Expose
    public DegreeDaySummary degreeDaySummary;
    @SerializedName("AirAndPollen")
    @Expose
    public List<AirAndPollen> airAndPollen = null;
    @SerializedName("Day")
    @Expose
    public Day day;
    @SerializedName("Night")
    @Expose
    public Night night;
    @SerializedName("Sources")
    @Expose
    public List<String> sources = null;
    @SerializedName("MobileLink")
    @Expose
    public String mobileLink;
    @SerializedName("Link")
    @Expose
    public String link;

}


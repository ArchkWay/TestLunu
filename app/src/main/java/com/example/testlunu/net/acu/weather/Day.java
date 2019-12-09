package com.example.testlunu.net.acu.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {
    public Integer getIcon() {
        return icon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    public String getShortPhrase() {
        return shortPhrase;
    }

    public String getLongPhrase() {
        return longPhrase;
    }

    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    public Integer getThunderstormProbability() {
        return thunderstormProbability;
    }

    public Integer getRainProbability() {
        return rainProbability;
    }

    public Integer getSnowProbability() {
        return snowProbability;
    }

    public Integer getIceProbability() {
        return iceProbability;
    }

    public Wind getWind() {
        return wind;
    }

    public WindGust getWindGust() {
        return windGust;
    }

    public TotalLiquid getTotalLiquid() {
        return totalLiquid;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Ice getIce() {
        return ice;
    }

    public Integer getHoursOfPrecipitation() {
        return hoursOfPrecipitation;
    }

    public Integer getHoursOfRain() {
        return hoursOfRain;
    }

    public Integer getHoursOfSnow() {
        return hoursOfSnow;
    }

    public Integer getHoursOfIce() {
        return hoursOfIce;
    }

    public Integer getCloudCover() {
        return cloudCover;
    }

    @SerializedName("Icon")
        @Expose
        public Integer icon;
        @SerializedName("IconPhrase")
        @Expose
        public String iconPhrase;
        @SerializedName("HasPrecipitation")
        @Expose
        public Boolean hasPrecipitation;
        @SerializedName("ShortPhrase")
        @Expose
        public String shortPhrase;
        @SerializedName("LongPhrase")
        @Expose
        public String longPhrase;
        @SerializedName("PrecipitationProbability")
        @Expose
        public Integer precipitationProbability;
        @SerializedName("ThunderstormProbability")
        @Expose
        public Integer thunderstormProbability;
        @SerializedName("RainProbability")
        @Expose
        public Integer rainProbability;
        @SerializedName("SnowProbability")
        @Expose
        public Integer snowProbability;
        @SerializedName("IceProbability")
        @Expose
        public Integer iceProbability;
        @SerializedName("Wind")
        @Expose
        public Wind wind;
        @SerializedName("WindGust")
        @Expose
        public WindGust windGust;
        @SerializedName("TotalLiquid")
        @Expose
        public TotalLiquid totalLiquid;
        @SerializedName("Rain")
        @Expose
        public Rain rain;
        @SerializedName("Snow")
        @Expose
        public Snow snow;
        @SerializedName("Ice")
        @Expose
        public Ice ice;
        @SerializedName("HoursOfPrecipitation")
        @Expose
        public Integer hoursOfPrecipitation;
        @SerializedName("HoursOfRain")
        @Expose
        public Integer hoursOfRain;
        @SerializedName("HoursOfSnow")
        @Expose
        public Integer hoursOfSnow;
        @SerializedName("HoursOfIce")
        @Expose
        public Integer hoursOfIce;
        @SerializedName("CloudCover")
        @Expose
        public Integer cloudCover;

    }
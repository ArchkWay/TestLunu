package com.example.testlunu.net.acu.weather;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherWrapper {

    @SerializedName("Headline")
    @Expose
    public Headline headline;

    public Headline getHeadline() {
        return headline;
    }

    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    @SerializedName("DailyForecasts")
    @Expose
    public List<DailyForecast> dailyForecasts = null;

}

class AirAndPollen {

    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Category")
    @Expose
    public String category;
    @SerializedName("CategoryValue")
    @Expose
    public Integer categoryValue;
    @SerializedName("Type")
    @Expose
    public String type;

}

class Cooling {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}


class Day {

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

class DegreeDaySummary {

    @SerializedName("Heating")
    @Expose
    public Heating heating;
    @SerializedName("Cooling")
    @Expose
    public Cooling cooling;

}

class Direction {

    @SerializedName("Degrees")
    @Expose
    public Integer degrees;
    @SerializedName("Localized")
    @Expose
    public String localized;
    @SerializedName("English")
    @Expose
    public String english;

}

class Direction_ {

    @SerializedName("Degrees")
    @Expose
    public Integer degrees;
    @SerializedName("Localized")
    @Expose
    public String localized;
    @SerializedName("English")
    @Expose
    public String english;

}

class Direction__ {

    @SerializedName("Degrees")
    @Expose
    public Integer degrees;
    @SerializedName("Localized")
    @Expose
    public String localized;
    @SerializedName("English")
    @Expose
    public String english;

}

class Direction___ {

    @SerializedName("Degrees")
    @Expose
    public Integer degrees;
    @SerializedName("Localized")
    @Expose
    public String localized;
    @SerializedName("English")
    @Expose
    public String english;

}



class Headline {

    @SerializedName("EffectiveDate")
    @Expose
    public String effectiveDate;
    @SerializedName("EffectiveEpochDate")
    @Expose
    public Integer effectiveEpochDate;
    @SerializedName("Severity")
    @Expose
    public Integer severity;
    @SerializedName("Text")
    @Expose
    public String text;
    @SerializedName("Category")
    @Expose
    public String category;
    @SerializedName("EndDate")
    @Expose
    public String endDate;
    @SerializedName("EndEpochDate")
    @Expose
    public Integer endEpochDate;
    @SerializedName("MobileLink")
    @Expose
    public String mobileLink;
    @SerializedName("Link")
    @Expose
    public String link;

}

class Heating {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Ice {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Ice_ {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}



class Maximum_ {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Maximum__ {

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



class Minimum_ {

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

class Minimum__ {

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

class Moon {

    @SerializedName("Rise")
    @Expose
    public String rise;
    @SerializedName("EpochRise")
    @Expose
    public Integer epochRise;
    @SerializedName("Set")
    @Expose
    public String set;
    @SerializedName("EpochSet")
    @Expose
    public Integer epochSet;
    @SerializedName("Phase")
    @Expose
    public String phase;
    @SerializedName("Age")
    @Expose
    public Integer age;

}

class Night {

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
    public Wind_ wind;
    @SerializedName("WindGust")
    @Expose
    public WindGust_ windGust;
    @SerializedName("TotalLiquid")
    @Expose
    public TotalLiquid_ totalLiquid;
    @SerializedName("Rain")
    @Expose
    public Rain_ rain;
    @SerializedName("Snow")
    @Expose
    public Snow_ snow;
    @SerializedName("Ice")
    @Expose
    public Ice_ ice;
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

class Rain {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Rain_ {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class RealFeelTemperature {

    @SerializedName("Minimum")
    @Expose
    public Minimum_ minimum;
    @SerializedName("Maximum")
    @Expose
    public Maximum_ maximum;

}

class RealFeelTemperatureShade {

    @SerializedName("Minimum")
    @Expose
    public Minimum__ minimum;
    @SerializedName("Maximum")
    @Expose
    public Maximum__ maximum;

}

class Snow {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Snow_ {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Speed {

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

class Speed_ {

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

class Speed__ {

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

class Speed___ {

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

class Sun {

    @SerializedName("Rise")
    @Expose
    public String rise;
    @SerializedName("EpochRise")
    @Expose
    public Integer epochRise;
    @SerializedName("Set")
    @Expose
    public String set;
    @SerializedName("EpochSet")
    @Expose
    public Integer epochSet;

}



class TotalLiquid {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class TotalLiquid_ {

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}

class Wind {

    @SerializedName("Speed")
    @Expose
    public Speed speed;
    @SerializedName("Direction")
    @Expose
    public Direction direction;

}

class WindGust {

    @SerializedName("Speed")
    @Expose
    public Speed_ speed;
    @SerializedName("Direction")
    @Expose
    public Direction_ direction;

}

class WindGust_ {

    @SerializedName("Speed")
    @Expose
    public Speed___ speed;
    @SerializedName("Direction")
    @Expose
    public Direction___ direction;

}

class Wind_ {

    @SerializedName("Speed")
    @Expose
    public Speed__ speed;
    @SerializedName("Direction")
    @Expose
    public Direction__ direction;

}

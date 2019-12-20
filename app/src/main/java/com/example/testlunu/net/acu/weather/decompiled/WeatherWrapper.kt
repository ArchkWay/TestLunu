package com.example.testlunu.net.acu.weather.decompiled

import com.example.testlunu.net.acu.weather.DailyForecast
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WeatherWrapper (
    @SerializedName("Headline")
    @Expose
    var headline: Headline?,

    @SerializedName("DailyForecasts")
    @Expose
    var dailyForecasts: List<DailyForecast>?
)





internal class Direction {
    @SerializedName("Degrees")
    @Expose
    var degrees: Int? = null
    @SerializedName("Localized")
    @Expose
    var localized: String? = null
    @SerializedName("English")
    @Expose
    var english: String? = null
}

class Direction_ {
    @SerializedName("Degrees")
    @Expose
    var degrees: Int? = null
    @SerializedName("Localized")
    @Expose
    var localized: String? = null
    @SerializedName("English")
    @Expose
    var english: String? = null
}




class Headline {
    @SerializedName("EffectiveDate")
    @Expose
    var effectiveDate: String? = null
    @SerializedName("EffectiveEpochDate")
    @Expose
    var effectiveEpochDate: Int? = null
    @SerializedName("Severity")
    @Expose
    var severity: Int? = null
    @SerializedName("Text")
    @Expose
    var text: String? = null
    @SerializedName("Category")
    @Expose
    var category: String? = null
    @SerializedName("EndDate")
    @Expose
    var endDate: String? = null
    @SerializedName("EndEpochDate")
    @Expose
    var endEpochDate: Int? = null
    @SerializedName("MobileLink")
    @Expose
    var mobileLink: String? = null
    @SerializedName("Link")
    @Expose
    var link: String? = null
}

class Heating {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class Ice {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class Ice_ {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}



class Maximum__ {
    @SerializedName("Value")
    @Expose
    var value: Float? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}





class Moon {
    @SerializedName("Rise")
    @Expose
    var rise: String? = null
    @SerializedName("EpochRise")
    @Expose
    var epochRise: Int? = null
    @SerializedName("Set")
    @Expose
    var set: String? = null
    @SerializedName("EpochSet")
    @Expose
    var epochSet: Int? = null
    @SerializedName("Phase")
    @Expose
    var phase: String? = null
    @SerializedName("Age")
    @Expose
    var age: Int? = null
}

class Night {
    @SerializedName("Icon")
    @Expose
    var icon: Int? = null
    @SerializedName("IconPhrase")
    @Expose
    var iconPhrase: String? = null
    @SerializedName("HasPrecipitation")
    @Expose
    var hasPrecipitation: Boolean? = null
    @SerializedName("ShortPhrase")
    @Expose
    var shortPhrase: String? = null
    @SerializedName("LongPhrase")
    @Expose
    var longPhrase: String? = null
    @SerializedName("PrecipitationProbability")
    @Expose
    var precipitationProbability: Int? = null
    @SerializedName("ThunderstormProbability")
    @Expose
    var thunderstormProbability: Int? = null
    @SerializedName("RainProbability")
    @Expose
    var rainProbability: Int? = null
    @SerializedName("SnowProbability")
    @Expose
    var snowProbability: Int? = null
    @SerializedName("IceProbability")
    @Expose
    var iceProbability: Int? = null
    @SerializedName("Wind")
    @Expose
    var wind: Wind_? = null
    @SerializedName("WindGust")
    @Expose
    var windGust: WindGust_? = null
    @SerializedName("TotalLiquid")
    @Expose
    var totalLiquid: TotalLiquid_? = null
    @SerializedName("Rain")
    @Expose
    var rain: Rain_? = null
    @SerializedName("Snow")
    @Expose
    var snow: Snow_? = null
    @SerializedName("Ice")
    @Expose
    var ice: Ice_? = null
    @SerializedName("HoursOfPrecipitation")
    @Expose
    var hoursOfPrecipitation: Int? = null
    @SerializedName("HoursOfRain")
    @Expose
    var hoursOfRain: Int? = null
    @SerializedName("HoursOfSnow")
    @Expose
    var hoursOfSnow: Int? = null
    @SerializedName("HoursOfIce")
    @Expose
    var hoursOfIce: Int? = null
    @SerializedName("CloudCover")
    @Expose
    var cloudCover: Int? = null
}

class Rain {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class Rain_ {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class RealFeelTemperature {
    @SerializedName("Minimum")
    @Expose
    var minimum: Minimum_? = null
    @SerializedName("Maximum")
    @Expose
    var maximum: Maximum_? = null
}

class RealFeelTemperatureShade {
    @SerializedName("Minimum")
    @Expose
    var minimum: Minimum__? = null
    @SerializedName("Maximum")
    @Expose
    var maximum: Maximum__? = null
}

class Snow {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class Snow_ {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}




class TotalLiquid_ {
    @SerializedName("Value")
    @Expose
    var value: Int? = null
    @SerializedName("Unit")
    @Expose
    var unit: String? = null
    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null
}

class WindGust {
    @SerializedName("Speed")
    @Expose
    var speed: Speed_? = null
    @SerializedName("Direction")
    @Expose
    var direction: Direction_? = null
}

class WindGust_ {
    @SerializedName("Speed")
    @Expose
    var speed: Speed___? = null
    @SerializedName("Direction")
    @Expose
    var direction: Direction___? = null
}

class Wind_ {
    @SerializedName("Speed")
    @Expose
    var speed: Speed__? = null
    @SerializedName("Direction")
    @Expose
    var direction: Direction__? = null
}
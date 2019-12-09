package com.example.testlunu.net

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CityData (
    var coord: Coord,
    var weather: List<Weather>,
    var base: String,
    var main: Main,
    var visibility: Int,
    var wind: Wind,
    var rain: Rain,
    var clouds: Clouds,
    var dt: Int,
    var sys: Sys,
    var timezone: Int,
    var id: Int,
    var name: String,
    var cod: Int
)

class Clouds {

    @SerializedName("all")
    @Expose
    var all: Int? = null

}

class Coord {

    @SerializedName("lon")
    @Expose
    var lon: Float? = null
    @SerializedName("lat")
    @Expose
    var lat: Float? = null

}

class Main {

    @SerializedName("temp")
    @Expose
    var temp: Float? = null
    @SerializedName("pressure")
    @Expose
    var pressure: Int? = null
    @SerializedName("humidity")
    @Expose
    var humidity: Int? = null
    @SerializedName("temp_min")
    @Expose
    var tempMin: Float? = null
    @SerializedName("temp_max")
    @Expose
    var tempMax: Float? = null

}

class Rain {

    @SerializedName("1h")
    @Expose
    var _1h: Float? = null

}

 class Sys {

    @SerializedName("type")
    @Expose
    var type: Int? = null
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("sunrise")
    @Expose
    var sunrise: Int? = null
    @SerializedName("sunset")
    @Expose
    var sunset: Int? = null

}

class Weather {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("main")
    @Expose
    var main: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null

}

class Wind {

    @SerializedName("speed")
    @Expose
    var speed: Int? = null
    @SerializedName("deg")
    @Expose
    var deg: Int? = null
}

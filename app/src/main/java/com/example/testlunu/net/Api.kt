package com.example.testlunu.net

import com.example.testlunu.net.acu.cityinfo.CityWrapper
import com.example.testlunu.net.acu.weather.WeatherWrapper
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
        @GET("locations/v1/cities/search")
    fun getCity(@Query("apikey") apikey: String,  @Query("q") q: String, @Query("language") language:String,
                @Query("details") details:Boolean ): Observable<List<CityWrapper>>


    @GET("forecasts/v1/daily/1day/{locationKey}")
    fun getWeather(@Path ("locationKey") locationKey:String, @Query("apikey") apikey: String, @Query("language") language:String, @Query("details") details:Boolean, @Query("metric") metric:Boolean  ): Observable<WeatherWrapper>

}

val apikey = "YOXTejBu4Qr5mVcqwN1fwJkaHK9jIA4T"

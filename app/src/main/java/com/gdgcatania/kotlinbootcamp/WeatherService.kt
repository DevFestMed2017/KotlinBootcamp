package com.gdgcatania.kotlinbootcamp

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Retrofit interface used for getting the data from the openweathermap API
 *
 * Kotlin project for the #DevFestMed bootcamp
 * Created by carlo on 19/11/2017.
 */

interface WeatherService
{
    //TODO services call: current Wheater by cityName
    @GET("weather")
    fun getWheaterByCityName(@Query("q") query: String)
    //TODO services call: current Wheater by cityId
    @GET("weather")
    fun getWheaterByCityId(@Query("id") id: String)
    //TODO services call: current Wheater by coordinate
    @GET("weather")
    fun getWheaterByCityGeoPosition(@Query("lat") lat: String, @Query("lng") lng: String)

}
package com.gdgcatania.kotlinbootcamp

import org.json.JSONObject
import retrofit2.Call
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
    //TODO change return type with the correct Data object

    /**
     * Current wheater for one location by city name
     *
     * param: query - the string for searching the locality
     */
    @GET("weather")
    fun getWeatherByCityName(@Query("q") query: String): Call<Any>

    /**
     * Current wheater for one location by City id
     *
     * param: id - the id of the city
     */

    @GET("weather")
    fun getWeatherByCityId(@Query("id") id: Long): Call<Any>

    /**
     * Current wheater for one location defined by coordinates
     *
     * param: lat - latitude of the request wheater
     * param: lng - longitude of the request wheater
     */
    @GET("weather")
    fun getWeatherByCityGeoPosition(@Query("lat") lat: Double, @Query("lng") lng: Double): Call<Any>

    /**
     * Current wheater for an area defined by the bounding box, the bounding box can be obtained
     * using the Utility method getBoundingBox
     *
     * param: boundingBox - latitude of the request wheater
     */

    @GET("box/city")
    fun getWeatherByBoundingBox(@Query("bbox") boundingBox: String): Call<Any>

    /**
     * Current wheater for a circular area defined by latitude, longitude and expeted number of cities
     *
     * param: lat - latitude of the request wheater
     * param: lng - longitude of the request wheater
     * param: cnt - number of cities around the point that should be returned
     */

    @GET("find")
    fun getWeatherInCircle(@Query("lat") lat: Double, @Query("lng") lng: Double, @Query("cnt") cnt: Int): Call<Any>

}

/**
 * Utility method used for parsing the bounding box for the @see getWeatherByBoundingBox method
 */
fun getBoundingBox(lat1: Double, lng1: Double, lat2: Double, lng2: Double, zoom: Double) = "$lat1,$lng1,$lat2,$lng2,$zoom"
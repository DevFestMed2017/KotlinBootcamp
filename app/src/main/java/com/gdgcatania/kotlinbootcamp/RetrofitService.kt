package com.gdgcatania.kotlinbootcamp

import retrofit2.Retrofit

/**
 * Retrofit Service builder used for getting enabling the use of the WheaterService
 *
 * Kotlin project for the #DevFestMed bootcamp
 * Created by carlo on 19/11/2017.
 */

class RetrofitService {
    val openWeatherUrl = "api.openweathermap.org/data/2.5/"

    /**
     * return a @see WheaterService instance
     */
    fun createWeatherService(): WeatherService {
        val retrofit = Retrofit.Builder()
                .baseUrl(openWeatherUrl)
                .build()

        return retrofit.create(WeatherService::class.java)
    }
}
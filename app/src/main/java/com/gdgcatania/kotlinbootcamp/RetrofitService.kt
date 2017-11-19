package com.gdgcatania.kotlinbootcamp

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit Service builder used for getting enabling the use of the WheaterService
 *
 * Kotlin project for the #DevFestMed bootcamp
 * Created by carlo on 19/11/2017.
 */

class RetrofitService {

    /**
     * return a @see WheaterService instance
     */
    fun createWeatherService(): WeatherService {

        // interceptor for custom request (add API_KEY and Custom settings as query)

        val interceptor = object : Interceptor{
            override fun intercept(chain: Interceptor.Chain?): Response? {
                val request = chain?.request();
                val url = request?.url()?.newBuilder()
                        ?.addQueryParameter("APPID", BuildConfig.API_KEY)
                        ?.addQueryParameter("lang", "it")
                        ?.addQueryParameter("unit", "metric")
                        ?.build()
                return chain?.proceed(request?.newBuilder()?.url(url)?.build())
            }
        }

        // building OkHttpClient and add to retrofit builder

        val weatherClient = OkHttpClient.Builder().addNetworkInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.ENDPOINT_URL)
                .client(weatherClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit.create(WeatherService::class.java)
    }
}
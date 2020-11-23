package com.example.logic.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object SWNetWork {
    private val weatherService = ServiceCreater.create(WeatherService::class.java)
    suspend fun getDW(lng: String, lat: String) =
        weatherService.getDailyWeather(lng, lat).await()

    suspend fun getRW(lng: String, lat: String) =
        weatherService.getRealtimeWeather(lng, lat).await()

    private val Service = ServiceCreater.create(PlaceService::class.java)
    suspend fun searchP(query: String) = Service.searchPlaces(query).await()

    private suspend fun <T> Call<T>.await(): T {
        return suspendCoroutine { continuation ->
            enqueue(object : Callback<T> {
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()
                    if (body != null) {
                        continuation.resume(body)
                    } else {
                        continuation.resumeWithException(RuntimeException("response.body=null"))
                    }
                }

                override fun onFailure(call: Call<T>, t: Throwable) {
                    continuation.resumeWithException(t)
                }

            })
        }

    }
}
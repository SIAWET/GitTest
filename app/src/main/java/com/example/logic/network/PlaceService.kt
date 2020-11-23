package com.example.logic.network

import com.example.SWApplication
import com.example.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SWApplication.Token}&lang=zh_CN")
    fun searchPlaces(
        @Query("query") query: String
    ): Call<PlaceResponse>
}
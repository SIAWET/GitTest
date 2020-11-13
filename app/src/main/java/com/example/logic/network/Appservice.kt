package com.example.logic.network

import com.bejson.pojo.ColloerBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Appservice {
    @GET("v2.5/{Token}/121.6544,25.1552/realtime.json")
    fun getData(
        @Path("Token") Token: String,
        ): Call<ColloerBean>
}
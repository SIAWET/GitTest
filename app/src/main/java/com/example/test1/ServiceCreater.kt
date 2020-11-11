package com.example.test1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreater {
    private const val baseurl = "https://api.caiyunapp.com/v2.5/"
    private val rtf = Retrofit.Builder()
        .baseUrl(baseurl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = rtf.create(serviceClass)
}
package com.example.test1

import okhttp3.OkHttpClient
import okhttp3.Request

object Httttps {
    fun sendHttpRequest(address: String, callback: okhttp3.Callback) {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(address)
            .build()
        client.newCall(request).enqueue(callback)
    }
}
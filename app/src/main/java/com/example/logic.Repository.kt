package com.example

import androidx.lifecycle.liveData
import com.example.logic.network.Place
import com.example.logic.network.SWNetWork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import java.lang.Exception
import java.lang.RuntimeException


object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SWNetWork.searchP(query)
            val s = "asd"

            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("placeResponse.status =${placeResponse.status} ,!= ok"))
            }
        } catch (e: Exception) {
            Result.failure<Place>(e)
        }
        emit(result)
    }
}
package com.example.ui.place

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.logic.Repository
import com.example.logic.model.Place

class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()
    val placeLiveData =
        Transformations.switchMap(searchLiveData) { query ->
            Repository.searchPlaces(query)
        }

    override fun onCleared() {
        super.onCleared()

    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}
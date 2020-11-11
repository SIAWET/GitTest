package com.example.test1

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("status") val status: String,
    @SerializedName("query") val query: String,
    @SerializedName("places") val places: List<Place>
)

data class Place(
    @SerializedName("name") val name: String,
    @SerializedName("location") val location: Location,
    @SerializedName("formatted_address") val formatted_address: String
)

data class Location(@SerializedName("lat") val lat: Float, @SerializedName("lng") val lng: Float) {

}

data class Weather2(
    @SerializedName("status") val status: String,
    @SerializedName("query") val query: String
)
/*
data class Weather(@SerializedName("daily_forecast") val forecast:List<Forecast>){}

data class Forecast(val date:String,@SerializedName("cond") val more:More,@SerializedName("tmp") val temperature:Temperature){}

data class Temperature (val max:String,val min:String) {}

data class More (@SerializedName("txt_d") val info:String){}*/
package com.example.weather

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
//http://api.apixu.com/v1/current.json?key=ae129e848cf74559a8d95151191201&q=Tomsk
    @GET("current.json?key=ae129e848cf74559a8d95151191201")
    fun getW(@Query("q") categoryId: String): Call<Model>

}
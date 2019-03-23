package com.example.weather

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    //http://api.apixu.com/v1/current.json?key=ae129e848cf74559a8d95151191201&q=Tomsk
    @GET("current.json")
    fun getW(
        @Query("key") key: String,
        @Query("q") categoryId: String
    ): Observable<Model.Result>

    companion object {
        fun create(): Service {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create()
                )
                .addConverterFactory(
                    GsonConverterFactory.create()
                )
                .baseUrl("http://api.apixu.com/v1/")
                .build()

            return retrofit.create(Service::class.java)
        }
    }
}
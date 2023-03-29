package com.example.horoscopo.data.network

import com.example.horoscopo.data.network.model.HoroscopeResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface HoroscopeApi {
    @POST(".")
    suspend fun getHoroscope(
        @Query("sign") sign: String,
        @Query("day") day:String
    ):Response<HoroscopeResponse>

}
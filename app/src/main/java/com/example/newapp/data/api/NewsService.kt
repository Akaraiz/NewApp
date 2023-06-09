package com.example.newapp.data.api

import com.example.newapp.utils.Constants.Companion.API_KEY
import retrofit2.http.Query
import retrofit2.http.GET

interface NewsService {


    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    )

    suspend fun getHeadlines(
        @Query("county") countryCode: String = "ru",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    )
}
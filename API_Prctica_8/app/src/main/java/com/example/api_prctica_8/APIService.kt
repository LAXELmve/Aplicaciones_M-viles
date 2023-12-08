package com.example.api_prctica_8

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getElementsByCategory(@Url url: String) :Response<ApiResponse>
}
package com.marvel.data.service.api

import com.marvel.data.service.response.charactersResponse.MarvelDataResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApiProvider {

    @GET("characters")
    fun getCharacters(
        @Query("ts") timestamp: String,
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String
    ): Call<MarvelDataResponse>
}

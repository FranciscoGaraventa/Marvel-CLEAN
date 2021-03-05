package com.marvel.data.service.builder

import retrofit2.Retrofit
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory

class MarvelRequestBuilder {

    private val httpClient: OkHttpClient = OkHttpClient.Builder().build()
    private val builder = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    companion object {
        private const val BASE_URL = "http://gateway.marvel.com/v1/public/"
    }

    fun <T> buildService(serviceClass: Class<T>): T =
        builder.client(httpClient).build().create(serviceClass)
}

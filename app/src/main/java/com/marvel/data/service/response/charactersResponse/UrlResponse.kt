package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class UrlResponse(
    @SerializedName("type") val urlType: String,
    @SerializedName("url") val imageUrl: String,
)


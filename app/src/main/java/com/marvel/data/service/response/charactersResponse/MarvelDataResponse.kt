package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class MarvelDataResponse(
    @SerializedName("data") val data: MarvelResponse
)

package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class MarvelResponse(
    @SerializedName("results") val results: MutableList<ModelResponse>
)

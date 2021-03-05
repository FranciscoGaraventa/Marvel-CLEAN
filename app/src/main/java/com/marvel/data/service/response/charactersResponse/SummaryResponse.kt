package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class SummaryResponse(
    @SerializedName("resourceURI") val url: String,
    @SerializedName("name") val name: String
)

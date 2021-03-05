package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class SeriesSummaryResponse(
    @SerializedName("resourceURI") val seriesItemUrl: String,
    @SerializedName("name") val seriesItemName: String
)

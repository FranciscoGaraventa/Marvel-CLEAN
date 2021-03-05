package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class SeriesResponse(
    @SerializedName("available") val availableSeries: String,
    @SerializedName("returned") val returnedSeries: String,
    @SerializedName("collectionURI") val collectionPath: String,
    @SerializedName("items") val items: MutableList<SummaryResponse>
)

package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class EventsResponse(
    @SerializedName("available") val availableEvents: String,
    @SerializedName("returned") val returnedEvents: String,
    @SerializedName("collectionURI") val collectionPath: String,
    @SerializedName("items") val items: MutableList<SummaryResponse>
)

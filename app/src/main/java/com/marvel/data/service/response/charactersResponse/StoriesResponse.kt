package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class StoriesResponse(
    @SerializedName("available") val availableStories: String,
    @SerializedName("returned") val returnedStories: String,
    @SerializedName("collectionURI") val collectionPath: String,
    @SerializedName("items") val items: MutableList<StorySummaryResponse>
)

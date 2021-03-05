package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class ComicResponse(
    @SerializedName("available") val availableComics: String,
    @SerializedName("returned") val returnedComics: String,
    @SerializedName("collectionURI") val collectionPath: String,
    @SerializedName("items") val items: MutableList<SummaryResponse>
)

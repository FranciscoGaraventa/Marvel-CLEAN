package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class StorySummaryResponse(
    @SerializedName("resourceURI") val storyUrl: String,
    @SerializedName("name") val storyName: String,
    @SerializedName("type") val storyType: String
)

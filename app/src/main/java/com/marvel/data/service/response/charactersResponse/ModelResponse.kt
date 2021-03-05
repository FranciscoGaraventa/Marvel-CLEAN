package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class ModelResponse(
    @SerializedName("id") val characterId: String,
    @SerializedName("name") val characterName: String,
    @SerializedName("description") val characterDescription: String,
    @SerializedName("modified") val recentModification: String,
    @SerializedName("thumbnail") val characterImg: ImageResponse,
    @SerializedName("resourceURI") val canonicalUrl: String,
    @SerializedName("comics") val comicFeatureCharacter: ComicResponse,
    @SerializedName("series") val characterSeriesAppearance: SeriesResponse,
    @SerializedName("stories") val characterStoriesAppearance: StoriesResponse,
    @SerializedName("events") val characterEventsAppearance: EventsResponse,
    @SerializedName("urls") val publicWebUrlsResource: MutableList<UrlResponse>
)

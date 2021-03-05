package com.marvel.data.service.response.charactersResponse

import com.google.gson.annotations.SerializedName

data class ImageResponse(
    @SerializedName("path") val imagePath: String,
    @SerializedName("extension") val imageExtension: String
)

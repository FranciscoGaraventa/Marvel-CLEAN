package com.marvel.data.utils

import com.marvel.data.service.response.charactersResponse.ImageResponse
import com.marvel.data.service.response.charactersResponse.StorySummaryResponse
import com.marvel.data.service.response.charactersResponse.SummaryResponse
import com.marvel.data.service.response.charactersResponse.UrlResponse
import com.marvel.domain.entity.ImageDescription
import com.marvel.domain.entity.StoriesSummaryDescription
import com.marvel.domain.entity.SummaryDescription
import com.marvel.domain.entity.UrlDescription

fun UrlResponse.transformToUrlDescription(): UrlDescription =
    UrlDescription(this.urlType, this.imageUrl)

fun ImageResponse.transformToImageDescription(): ImageDescription =
    ImageDescription(this.imagePath,this.imageExtension)

fun SummaryResponse.transformToSummaryDescription(): SummaryDescription =
    SummaryDescription(this.name,this.url)

fun StorySummaryResponse.transformToStorySummaryDescription(): StoriesSummaryDescription =
    StoriesSummaryDescription(this.storyUrl,this.storyName,this.storyType)


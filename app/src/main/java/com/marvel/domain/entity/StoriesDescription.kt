package com.marvel.domain.entity

data class StoriesDescription(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: List<StoriesSummaryDescription>
)

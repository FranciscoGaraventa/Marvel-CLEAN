package com.marvel.domain.entity

data class SeriesDescription(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: List<SummaryDescription>
)

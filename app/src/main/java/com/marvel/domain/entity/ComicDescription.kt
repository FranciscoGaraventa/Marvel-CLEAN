package com.marvel.domain.entity

data class ComicDescription(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: MutableList<SummaryDescription>
)

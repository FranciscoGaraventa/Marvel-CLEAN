package com.marvel.domain.entity

data class EventsDescription(
    val available: Int,
    val returned: Int,
    val collectionURI: String,
    val items: List<SummaryDescription>
)

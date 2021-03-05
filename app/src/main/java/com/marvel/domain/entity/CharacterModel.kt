package com.marvel.domain.entity

data class CharacterModel(
    val id: Int,
    val name: String,
    val description: String,
    val modified: String,
    val resourceURI: String,
    val urls: List<UrlDescription>,
    val image: ImageDescription,
    val comics: ComicDescription,
    val stories: StoriesDescription,
    val events: EventsDescription,
    val series: SeriesDescription
)

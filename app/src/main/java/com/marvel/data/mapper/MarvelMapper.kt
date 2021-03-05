package com.marvel.data.mapper

import com.marvel.domain.entity.UrlDescription
import com.marvel.domain.entity.CharacterModel
import com.marvel.domain.entity.ComicDescription
import com.marvel.domain.entity.EventsDescription
import com.marvel.domain.entity.SeriesDescription
import com.marvel.domain.entity.StoriesDescription
import com.marvel.domain.entity.SummaryDescription
import com.marvel.data.utils.transformToUrlDescription
import com.marvel.data.utils.transformToImageDescription
import com.marvel.domain.entity.StoriesSummaryDescription
import com.marvel.data.utils.transformToSummaryDescription
import com.marvel.data.utils.transformToStorySummaryDescription
import com.marvel.data.service.response.charactersResponse.UrlResponse
import com.marvel.data.service.response.charactersResponse.ComicResponse
import com.marvel.data.service.response.charactersResponse.ModelResponse
import com.marvel.data.service.response.charactersResponse.EventsResponse
import com.marvel.data.service.response.charactersResponse.SeriesResponse
import com.marvel.data.service.response.charactersResponse.StoriesResponse

object MarvelMapper {

    private fun transformUrls(urls: MutableList<UrlResponse>): MutableList<UrlDescription> {
        val urlList: MutableList<UrlDescription> = mutableListOf()
        urls.forEach {
            urlList.add(it.transformToUrlDescription())
        }
        return urlList
    }

    private fun transformComic(comic: ComicResponse): ComicDescription {
        val itemList: MutableList<SummaryDescription> = mutableListOf()
        comic.items.forEach {
            itemList.add(it.transformToSummaryDescription())
        }
        return ComicDescription(
            comic.availableComics.toInt(),
            comic.returnedComics.toInt(),
            comic.collectionPath,
            itemList
        )
    }

    private fun transformStories(stories: StoriesResponse): StoriesDescription {
        val itemList: MutableList<StoriesSummaryDescription> = mutableListOf()
        stories.items.forEach {
            itemList.add(it.transformToStorySummaryDescription())
        }
        return StoriesDescription(
            stories.availableStories.toInt(),
            stories.returnedStories.toInt(),
            stories.collectionPath,
            itemList
        )
    }

    private fun transformEvents(events: EventsResponse): EventsDescription {
        val itemList: MutableList<SummaryDescription> = mutableListOf()
        events.items.forEach {
            itemList.add(it.transformToSummaryDescription())
        }
        return EventsDescription(
            events.availableEvents.toInt(),
            events.returnedEvents.toInt(),
            events.collectionPath,
            itemList
        )
    }

    private fun transformSeries(series: SeriesResponse): SeriesDescription {
        val itemList: MutableList<SummaryDescription> = mutableListOf()
        series.items.forEach {
            itemList.add(it.transformToSummaryDescription())
        }
        return SeriesDescription(
            series.availableSeries.toInt(),
            series.returnedSeries.toInt(),
            series.collectionPath,
            itemList
        )
    }

    fun transformList(list: List<ModelResponse>): MutableList<CharacterModel> {
        val characterModelList: MutableList<CharacterModel> = mutableListOf()
        list.forEach {
            characterModelList.add(
                CharacterModel(
                    it.characterId.toInt(),
                    it.characterName,
                    it.characterDescription,
                    it.recentModification,
                    it.canonicalUrl,
                    transformUrls(it.publicWebUrlsResource),
                    it.characterImg.transformToImageDescription(),
                    transformComic(it.comicFeatureCharacter),
                    transformStories(it.characterStoriesAppearance),
                    transformEvents(it.characterEventsAppearance),
                    transformSeries(it.characterSeriesAppearance)
                )
            )
        }
        return characterModelList
    }
}

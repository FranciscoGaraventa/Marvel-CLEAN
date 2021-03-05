package com.marvel.data.service

import com.marvel.marvelapp.BuildConfig
import com.marvel.data.mapper.MarvelMapper
import io.reactivex.rxjava3.core.Observable
import com.marvel.domain.service.MarvelService
import com.marvel.domain.entity.CharacterModel
import com.marvel.data.service.api.MarvelApiProvider
import com.marvel.data.service.builder.MarvelRequestBuilder

class MarvelServiceImpl(private val api: MarvelRequestBuilder, private val mapper: MarvelMapper) :
    MarvelService {

    override fun getCharacters(): Observable<MutableList<CharacterModel>> {
        return Observable.create { subscriber ->
            val callResponse = api.buildService(MarvelApiProvider::class.java)
                .getCharacters(TIMESTAMP, BuildConfig.API_KEY, BuildConfig.HASH)
            val response = callResponse.execute()
            if (response.isSuccessful) {
                response.body()?.data?.results?.let { subscriber.onNext(mapper.transformList(it)) }
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }

    companion object {
        private const val TIMESTAMP = "1"
    }

}

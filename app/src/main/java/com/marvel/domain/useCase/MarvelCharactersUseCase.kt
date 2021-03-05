package com.marvel.domain.useCase

import io.reactivex.rxjava3.core.Observable
import com.marvel.domain.entity.CharacterModel
import com.marvel.data.service.MarvelServiceImpl

interface MarvelCharactersUseCase {
    fun getCharacters(): Observable<MutableList<CharacterModel>>
}

class MarvelCharactersUseCaseImpl(private val serviceImpl: MarvelServiceImpl) :
    MarvelCharactersUseCase {
    override fun getCharacters(): Observable<MutableList<CharacterModel>> =
        serviceImpl.getCharacters()
}

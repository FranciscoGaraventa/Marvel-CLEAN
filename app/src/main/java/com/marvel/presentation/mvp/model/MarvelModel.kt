package com.marvel.presentation.mvp.model

import io.reactivex.rxjava3.core.Observable
import com.marvel.domain.entity.CharacterModel
import com.marvel.domain.useCase.MarvelCharactersUseCase
import com.marvel.presentation.mvp.contract.MarvelContract

class MarvelModel(private val marvelCharactersUseCase: MarvelCharactersUseCase) :
    MarvelContract.Model {
    override fun getCharacters(): Observable<MutableList<CharacterModel>> =
        marvelCharactersUseCase.getCharacters()
}

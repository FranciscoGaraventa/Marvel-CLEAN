package com.marvel.domain.service

import io.reactivex.rxjava3.core.Observable
import com.marvel.domain.entity.CharacterModel

interface MarvelService {
    fun getCharacters(): Observable<MutableList<CharacterModel>>
}

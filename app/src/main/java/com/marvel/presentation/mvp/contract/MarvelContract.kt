package com.marvel.presentation.mvp.contract

import io.reactivex.rxjava3.core.Observable
import com.marvel.domain.entity.CharacterModel

class MarvelContract {

    interface Presenter {
        fun getCharacters()
    }

    interface View {
    }

    interface Model {
        fun getCharacters(): Observable<MutableList<CharacterModel>>
    }
}

package com.marvel.presentation.mvp.presenter

import com.marvel.presentation.mvp.contract.MarvelContract

class MarvelPresenter(
    private val model: MarvelContract.Model,
    private val view: MarvelContract.View
) : MarvelContract.Presenter {
}

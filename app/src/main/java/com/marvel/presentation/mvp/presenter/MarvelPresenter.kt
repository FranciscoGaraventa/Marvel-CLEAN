package com.marvel.presentation.mvp.presenter

import android.util.Log
import io.reactivex.rxjava3.schedulers.Schedulers
import com.marvel.presentation.mvp.contract.MarvelContract
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers

class MarvelPresenter(
    private val model: MarvelContract.Model,
    private val view: MarvelContract.View
) : MarvelContract.Presenter {

    override fun getCharacters() {
        model.getCharacters()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { data ->
                Log.i("data", data.toString())
            }
    }
}

package com.marvel.presentation.mvp.view

import com.marvel.presentation.activity.MarvelActivity
import com.marvel.presentation.mvp.view.base.ActivityView
import com.marvel.presentation.mvp.contract.MarvelContract
import com.marvel.marvelapp.databinding.ActivityMainBinding

class MarvelView(activity: MarvelActivity, private val binding: ActivityMainBinding) :
    ActivityView(activity), MarvelContract.View {

}

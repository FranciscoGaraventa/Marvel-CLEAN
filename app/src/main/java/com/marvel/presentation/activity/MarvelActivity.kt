package com.marvel.presentation.activity

import android.os.Bundle
import com.marvel.data.mapper.MarvelMapper
import androidx.appcompat.app.AppCompatActivity
import com.marvel.data.service.MarvelServiceImpl
import com.marvel.presentation.mvp.view.MarvelView
import com.marvel.presentation.mvp.model.MarvelModel
import com.marvel.presentation.mvp.contract.MarvelContract
import com.marvel.marvelapp.databinding.ActivityMainBinding
import com.marvel.data.service.builder.MarvelRequestBuilder
import com.marvel.presentation.mvp.presenter.MarvelPresenter
import com.marvel.domain.useCase.MarvelCharactersUseCaseImpl

class MarvelActivity : AppCompatActivity() {

    private lateinit var presenter: MarvelContract.Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MarvelPresenter(
            MarvelModel(
                MarvelCharactersUseCaseImpl(
                    MarvelServiceImpl(
                        MarvelRequestBuilder(),
                        MarvelMapper
                    )
                )
            ), MarvelView(this, binding)
        )
        presenter.getCharacters()
    }

}

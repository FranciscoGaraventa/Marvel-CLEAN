package com.marvel.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marvel.presentation.mvp.view.MarvelView
import com.marvel.presentation.mvp.model.MarvelModel
import com.marvel.presentation.mvp.contract.MarvelContract
import com.marvel.marvelapp.databinding.ActivityMainBinding
import com.marvel.presentation.mvp.presenter.MarvelPresenter

class MarvelActivity : AppCompatActivity() {

    private lateinit var presenter: MarvelContract.Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MarvelPresenter(MarvelModel(), MarvelView(this, binding))
    }

}

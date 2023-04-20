package com.pokedex.newpokedex.app.view

import com.pokedex.newpokedex.app.viewModel.listing.listingProviderViewModel
import com.pokedex.newpokedex.commons.view.BaseActivity
import com.pokedex.newpokedex.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel by lazy { listingProviderViewModel(this) }

    override fun setBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initView() {
        binding.button.setOnClickListener {
            viewModel.getListPokemon()
        }
    }
}
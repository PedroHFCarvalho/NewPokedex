package com.pokedex.newpokedex.app.view

import android.widget.Toast
import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.app.viewModel.listing.ListingEvent
import com.pokedex.newpokedex.app.viewModel.listing.ListingInterpret
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
        viewModel.interpret(ListingInterpret.GetList)
        setObserver()
    }

    private fun setObserver() {
        viewModel.event.observe(this) {
            when (it) {
                is ListingEvent.ResponseList -> {
                    setContentRecycleView(it.pokeList)
                }

                is ListingEvent.ResponseError -> {
                    Toast.makeText(this, it.msgError, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun setContentRecycleView(pokeList: PokeList?) {
        with(binding.recyclerView) {
            pokeList?.results?.let {
                this.adapter = AdapterList(it)
            }

        }
    }
}
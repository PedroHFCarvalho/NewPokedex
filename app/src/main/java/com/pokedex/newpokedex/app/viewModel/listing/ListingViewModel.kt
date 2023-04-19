package com.pokedex.newpokedex.app.viewModel.listing

import android.util.Log
import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.commons.viewModel.BaseViewModel
import kotlinx.coroutines.launch

class ListingViewModel(private val useCase: ListingUseCase) : BaseViewModel() {
    fun getListPokemon() {
        launch {
            val x = useCase.getListPokemon()
            when  {
                x.isSuccess -> {
                    x.onSuccess {
                        Log.d("POKELIST", it.toString())
                    }
                }
                x.isFailure->{
                    x.onFailure {
                        Log.d("POKELIST", it.message.toString())
                    }
                }
            }


        }
    }
}
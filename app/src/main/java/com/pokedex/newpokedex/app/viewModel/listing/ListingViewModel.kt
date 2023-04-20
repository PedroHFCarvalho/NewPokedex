package com.pokedex.newpokedex.app.viewModel.listing

import android.util.Log
import com.pokedex.newpokedex.commons.viewModel.BaseViewModel
import kotlinx.coroutines.launch

class ListingViewModel(private val useCase: ListingUseCase) : BaseViewModel() {
    fun getListPokemon() {
        launch {
            val x = useCase.getListPokemon()
            if (x.isSuccessful) {
                Log.d("POKELIST", x.body().toString())
            } else {
                Log.d("POKELIST", x.errorBody().toString())
            }
        }
    }
}
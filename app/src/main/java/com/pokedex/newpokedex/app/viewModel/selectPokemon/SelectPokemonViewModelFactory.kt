package com.pokedex.newpokedex.app.viewModel.selectPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class SelectPokemonViewModelFactory(private val useCase: SelectPokemonUseCase) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SelectPokemonViewModel::class.java)) {
            return SelectPokemonViewModel(useCase) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}
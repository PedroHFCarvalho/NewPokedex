package com.pokedex.newpokedex.app.viewModel.selectPokemon

import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.app.repository.selectPokemon.SelectPokemonRepositoryImpl
import retrofit2.Response

class SelectPokemonUseCase(private val repository: SelectPokemonRepositoryImpl) {
    suspend fun getListPokemon(): Response<PokeList> {
        return repository.getListPokemon()
    }
}
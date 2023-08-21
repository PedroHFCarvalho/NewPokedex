package com.pokedex.newpokedex.app.repository.selectPokemon

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response

class SelectPokemonRepositoryImpl(private val api: SelectPokemonApi) : SelectPokemonRepository {
    override suspend fun getListPokemon(): Response<PokeList> {
        return api.getListPokemon()
    }
}
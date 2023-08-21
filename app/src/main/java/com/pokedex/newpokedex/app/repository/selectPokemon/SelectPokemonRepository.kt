package com.pokedex.newpokedex.app.repository.selectPokemon

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response

interface SelectPokemonRepository {
    suspend fun getListPokemon(): Response<PokeList>
}
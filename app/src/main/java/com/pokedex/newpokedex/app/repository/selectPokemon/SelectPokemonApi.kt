package com.pokedex.newpokedex.app.repository.selectPokemon

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response
import retrofit2.http.GET

interface SelectPokemonApi {
    @GET("pokemon")
    suspend fun getListPokemon(): Response<PokeList>
}
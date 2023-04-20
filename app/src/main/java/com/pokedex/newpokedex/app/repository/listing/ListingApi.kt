package com.pokedex.newpokedex.app.repository.listing

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response
import retrofit2.http.GET

interface ListingApi {
    @GET("pokemon")
    suspend fun getListPokemon(): Response<PokeList>
}
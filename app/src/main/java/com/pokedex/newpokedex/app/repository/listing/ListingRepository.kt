package com.pokedex.newpokedex.app.repository.listing

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response

interface ListingRepository {
    suspend fun getListPokemon(): Response<PokeList>
}
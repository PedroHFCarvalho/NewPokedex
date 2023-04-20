package com.pokedex.newpokedex.app.repository.listing

import com.pokedex.newpokedex.app.model.PokeList
import retrofit2.Response

class ListingRepositoryImpl(private val api: ListingApi) : ListingRepository {
    override suspend fun getListPokemon(): Response<PokeList> {
        return api.getListPokemon()
    }
}
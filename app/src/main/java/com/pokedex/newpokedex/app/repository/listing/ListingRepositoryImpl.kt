package com.pokedex.newpokedex.app.repository.listing

import com.pokedex.newpokedex.app.model.PokeList

class ListingRepositoryImpl(private val api: ListingApi) : ListingRepository {
    override suspend fun getListPokemon(): Result<PokeList> {
        return api.getListPokemon()
    }

}
package com.pokedex.newpokedex.app.viewModel.listing

import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.app.repository.listing.ListingRepositoryImpl
import retrofit2.Response

class ListingUseCase(private val repository: ListingRepositoryImpl) {
    suspend fun getListPokemon(): Response<PokeList> {
        return repository.getListPokemon()
    }
}
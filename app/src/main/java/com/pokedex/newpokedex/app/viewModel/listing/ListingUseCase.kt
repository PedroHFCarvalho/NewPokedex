package com.pokedex.newpokedex.app.viewModel.listing

import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.app.repository.listing.ListingRepositoryImpl

class ListingUseCase(private val repository: ListingRepositoryImpl) {
    suspend fun getListPokemon(): Result<PokeList> {
        return repository.getListPokemon()
    }
}
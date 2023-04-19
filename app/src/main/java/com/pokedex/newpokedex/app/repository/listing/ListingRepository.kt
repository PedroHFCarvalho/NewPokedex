package com.pokedex.newpokedex.app.repository.listing

import com.pokedex.newpokedex.app.model.PokeList

interface ListingRepository {
    suspend fun getListPokemon(): Result<PokeList>
}
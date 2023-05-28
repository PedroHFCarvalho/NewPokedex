package com.pokedex.newpokedex.app.viewModel.listing

import com.pokedex.newpokedex.app.model.PokeList

open class ListingEvent {
    data class ResponseList(
        val pokeList : PokeList?
    ): ListingEvent()
    data class ResponseError(
        val msgError : String?
    ): ListingEvent()
}
package com.pokedex.newpokedex.app.viewModel.selectPokemon

import com.pokedex.newpokedex.app.model.PokeList

open class SelectPokemonEvent {
    data class GetPokemonList(
        val pokeList: PokeList
    ) : SelectPokemonEvent()

    data class GetErrorPokemonList(
        val error: String
    ) : SelectPokemonEvent()
}
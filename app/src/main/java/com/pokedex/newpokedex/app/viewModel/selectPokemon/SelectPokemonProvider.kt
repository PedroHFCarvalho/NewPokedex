package com.pokedex.newpokedex.app.viewModel.selectPokemon

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.pokedex.newpokedex.app.repository.selectPokemon.SelectPokemonApi
import com.pokedex.newpokedex.app.repository.selectPokemon.SelectPokemonRepositoryImpl
import com.pokedex.newpokedex.commons.repository.RetrofitInstance

fun listingProviderViewModel(activity: Fragment): SelectPokemonViewModel =
    ViewModelProvider(
        activity,
        SelectPokemonViewModelFactory(listingUseCase())
    )[SelectPokemonViewModel::class.java]

fun listingUseCase() =
    SelectPokemonUseCase(SelectPokemonRepositoryImpl(RetrofitInstance.retrofit.create(SelectPokemonApi::class.java)))


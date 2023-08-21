package com.pokedex.newpokedex.app.viewModel.selectPokemon

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pokedex.newpokedex.app.interpret.SelectPokemonInterpret
import com.pokedex.newpokedex.commons.viewModel.BaseViewModel
import com.pokedex.newpokedex.commons.viewModel.SingleLiveData
import kotlinx.coroutines.launch

class SelectPokemonViewModel(private val useCase: SelectPokemonUseCase) : BaseViewModel() {

    private val event: MutableLiveData<SelectPokemonEvent> = SingleLiveData()
    private val state: MutableLiveData<SelectPokemonState> = SingleLiveData()

    val viewEvent: MutableLiveData<SelectPokemonEvent> = event
    val viewState: MutableLiveData<SelectPokemonState> = state

    fun interpret(interpret: SelectPokemonInterpret) {
        when (interpret) {
            is SelectPokemonInterpret.GetPokemonList -> getListPokemon()
        }
    }

    fun getListPokemon() {
        state.postValue(SelectPokemonState.ShowLoading)
        viewModelScope.launch {
            try {
                val result = useCase.getListPokemon()

                if (result.isSuccessful) {
                    Log.d("POKELIST", result.body().toString())
                } else {
                    Log.d("POKELIST", result.errorBody().toString())
                }

            } catch (e: Exception) {

            }

            state.postValue(SelectPokemonState.EndLoading)
        }
    }
}
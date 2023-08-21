package com.pokedex.newpokedex.app.viewModel.selectPokemon

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pokedex.newpokedex.app.interpret.SelectPokemonInterpret
import com.pokedex.newpokedex.app.model.PokeList
import com.pokedex.newpokedex.commons.viewModel.BaseViewModel
import com.pokedex.newpokedex.commons.viewModel.SingleLiveData
import kotlinx.coroutines.launch
import retrofit2.Response

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
            val result = useCase.getListPokemon()
            afterResultApi(result)
            state.postValue(SelectPokemonState.EndLoading)
        }
    }

    private fun afterResultApi(result: Response<PokeList>) {
        when (result.isSuccessful) {
            true -> result.body()?.let {
                event.postValue(SelectPokemonEvent.GetPokemonList(it))
            }
            false -> result.errorBody()?.let {
                event.postValue(SelectPokemonEvent.GetErrorPokemonList(it.toString()))
            }
        }
    }
}
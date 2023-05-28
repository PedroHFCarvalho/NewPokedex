package com.pokedex.newpokedex.app.viewModel.listing

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.pokedex.newpokedex.commons.viewModel.BaseViewModel
import kotlinx.coroutines.launch

class ListingViewModel(private val useCase: ListingUseCase) : BaseViewModel() {

    private var _event = MutableLiveData<ListingEvent>()
    var event: LiveData<ListingEvent> = _event

    fun interpret(interpret: ListingInterpret) {
        when (interpret) {
            is ListingInterpret.GetList -> getListPokemon()
        }

    }

    private fun getListPokemon() {
        viewModelScope.launch {
            try {
                useCase.getListPokemon().apply {
                    when (this.isSuccessful) {
                        true -> {
                            _event.postValue(ListingEvent.ResponseList(this.body()))
                        }

                        false -> {
                            _event.postValue(ListingEvent.ResponseError(this.errorBody()?.string()))
                        }
                    }
                }
            } catch (e: Exception) {
                _event.postValue(ListingEvent.ResponseError(e.message.toString()))

            }


        }
    }
}
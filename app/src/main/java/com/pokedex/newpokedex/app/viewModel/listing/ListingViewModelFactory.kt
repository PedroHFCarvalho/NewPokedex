package com.pokedex.newpokedex.app.viewModel.listing

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras


class ListingViewModelFactory(private val useCase: ListingUseCase) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if (modelClass.isAssignableFrom(ListingViewModel::class.java)) {
            return ListingViewModel(useCase) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}
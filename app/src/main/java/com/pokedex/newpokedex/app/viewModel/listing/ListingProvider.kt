package com.pokedex.newpokedex.app.viewModel.listing

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.pokedex.newpokedex.app.repository.listing.ListingApi
import com.pokedex.newpokedex.app.repository.listing.ListingRepositoryImpl
import com.pokedex.newpokedex.commons.repository.RetrofitInstance

val api: ListingApi = RetrofitInstance.retrofit.create(ListingApi::class.java)

fun listingProviderViewModel(activity: AppCompatActivity): ListingViewModel =
    ViewModelProvider(activity,ListingViewModelFactory(listingUseCase()))[ListingViewModel::class.java]

fun listingUseCase() = ListingUseCase(ListingRepositoryImpl(api))


package com.pokedex.newpokedex.commons.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://pokeapi.co/docs/v2/"

object RetrofitInstance {
    val retrofit: Retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}
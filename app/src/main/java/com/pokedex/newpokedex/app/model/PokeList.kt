package com.pokedex.newpokedex.app.model

import com.google.gson.annotations.SerializedName


data class PokeList(
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<PokeView>
)

data class PokeView(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
)

package com.pokedex.newpokedex.app.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokeList(
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<PokeView>
) : Parcelable

@Parcelize
data class PokeView(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
) : Parcelable

package com.pokedex.newpokedex.app.view.selectPokemon.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pokedex.newpokedex.app.model.PokeView
import com.pokedex.newpokedex.databinding.ItemViewPokemonCardBinding

class AdapterList : RecyclerView.Adapter<AdapterList.PokemonCardViewHolder>() {

    private var pokemonList: MutableList<PokeView> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonCardViewHolder {
        val binding =
            ItemViewPokemonCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        return PokemonCardViewHolder(binding)
    }

    override fun getItemCount() = pokemonList.size

    override fun onBindViewHolder(holder: PokemonCardViewHolder, position: Int) {
        holder.bind(pokemonList[position])
    }

    inner class PokemonCardViewHolder(private val binding: ItemViewPokemonCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pokeView: PokeView) {
            binding.textList.text = pokeView.name
        }

    }

    fun addList(newPokemonList: List<PokeView>) {
        val oldSize = itemCount
        pokemonList.addAll(newPokemonList)
        notifyItemRangeInserted(oldSize, itemCount)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(newPokemonList: List<PokeView>) {
        pokemonList = newPokemonList.toMutableList()
        notifyDataSetChanged()
    }
}
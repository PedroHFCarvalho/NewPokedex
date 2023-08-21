package com.pokedex.newpokedex.app.view.selectPokemon

import android.view.View
import android.view.ViewGroup
import com.pokedex.newpokedex.app.viewModel.selectPokemon.listingProviderViewModel
import com.pokedex.newpokedex.commons.view.BaseFragment
import com.pokedex.newpokedex.databinding.FragmentSelectPokemonBinding

class SelectPokemonFragment : BaseFragment() {

    private lateinit var binding: FragmentSelectPokemonBinding

    private val viewModel by lazy { listingProviderViewModel(this) }

    override fun setBinding(container: ViewGroup?): View {
        binding = FragmentSelectPokemonBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun initView() {
        viewModel.getListPokemon()
    }


}
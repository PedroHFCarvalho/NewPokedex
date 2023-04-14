package com.pokedex.newpokedex.app.view

import android.view.View
import android.view.ViewGroup
import com.pokedex.newpokedex.commons.view.BaseFragment
import com.pokedex.newpokedex.databinding.ActivityMainBinding

class Fragment : BaseFragment() {

    private lateinit var binding: ActivityMainBinding

    override fun setBinding(container: ViewGroup?): View {
        binding = ActivityMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun initView() {
        TODO("Not yet implemented")
    }
}
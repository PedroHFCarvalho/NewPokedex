package com.pokedex.newpokedex.app.view

import com.pokedex.newpokedex.commons.view.BaseActivity
import com.pokedex.newpokedex.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun setBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
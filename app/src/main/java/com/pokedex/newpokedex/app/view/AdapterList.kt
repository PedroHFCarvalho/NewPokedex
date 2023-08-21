package com.pokedex.newpokedex.app.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pokedex.newpokedex.R
import com.pokedex.newpokedex.app.model.PokeView

class AdapterList(private var itemList: List<PokeView>) :
    RecyclerView.Adapter<AdapterList.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemText: TextView = view.findViewById(R.id.text_list)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(p0.context).inflate(R.layout.view_list_pokemon, p0, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        val item = itemList[p1]
        p0.itemText.text = item.name
    }
}
package com.example.api_prctica_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ElementAdapter(private val images:List<String>): RecyclerView.Adapter<ElementViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ElementViewHolder(layoutInflater.inflate(R.layout.item_element, parent, false))
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {
        val item: String = images[position]
        holder.bind(item)
    }
}
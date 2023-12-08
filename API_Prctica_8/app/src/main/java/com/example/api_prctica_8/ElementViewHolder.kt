package com.example.api_prctica_8

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.api_prctica_8.databinding.ItemElementBinding
import com.squareup.picasso.Picasso

class ElementViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemElementBinding.bind(view)

    fun bind(image: String) {
        Picasso.get().load(image).into(binding.ivElement)
    }
}
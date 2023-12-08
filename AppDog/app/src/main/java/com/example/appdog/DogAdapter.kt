package com.example.appdog

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter (val image:List<String>):RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dod,parent,false))
    }

    override fun getItemCount(): Int = image.size


   override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val imageUrl: String = image[position]
        holder.bind(imageUrl)
    }

}
package com.example.appdog

import android.media.Image
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.appdog.databinding.ItemDodBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {
 private val binding = ItemDodBinding.bind(view)
 fun bind(image:String){
    Picasso.get().load(image).into(binding.ivDog)
 }

}
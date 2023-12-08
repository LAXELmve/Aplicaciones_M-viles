package com.example.harrypotterwiki.model.spell

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterwiki.databinding.SpellListBinding

class SpellAdapter (private val spells: List<Spell>) :
    RecyclerView.Adapter<SpellAdapter.SpellViewHolder>() {

    inner class SpellViewHolder(private val binding: SpellListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(spell: Spell) {
            binding.nameTextView.text = "Spell name: ${spell.name}"
            binding.descriptionText.text ="Description: ${spell.description}"

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellViewHolder {
        val binding = SpellListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SpellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpellViewHolder, position: Int) {
        val spell = spells[position]
        holder.bind(spell)

    }

    override fun getItemCount() = spells.size
}

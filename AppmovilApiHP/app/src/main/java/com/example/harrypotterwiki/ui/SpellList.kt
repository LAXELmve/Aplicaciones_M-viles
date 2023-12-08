package com.example.harrypotterwiki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterwiki.R
import com.example.harrypotterwiki.model.spell.SpellAdapter
import com.example.harrypotterwiki.model.spell.SpellListViewModel


class SpellList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spell_list)

        val spellList = findViewById<RecyclerView>(R.id.spellRecycler)
        spellList.layoutManager = LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this)[SpellListViewModel::class.java]
        viewModel.getSpellList()
        viewModel.spells.observe(this) { speels ->
            val adapter = SpellAdapter(speels)
            spellList.adapter = adapter
        }
    }
}
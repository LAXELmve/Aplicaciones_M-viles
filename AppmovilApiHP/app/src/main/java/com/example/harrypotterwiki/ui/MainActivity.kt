package com.example.harrypotterwiki.ui

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.harrypotterwiki.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        binding.button.setOnClickListener {
            val intent = Intent(this,StudentList::class.java)
            startActivity(intent)
        }
        binding.buttonStaff.setOnClickListener {
            val intent = Intent(this,StaffList::class.java)
            startActivity(intent)
        }
        binding.buttonSpell.setOnClickListener {
            val intent = Intent(this,SpellList::class.java)
            startActivity(intent)
        }
    }
}
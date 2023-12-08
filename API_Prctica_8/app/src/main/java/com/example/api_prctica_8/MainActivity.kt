package com.example.api_prctica_8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.api_prctica_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun perros(view: View) {
        val intent = Intent(this, PrincipalActivity::class.java)
        intent.putExtra("dir", "shibes?count=30&urls=true&httpsUrls=true")
        intent.putExtra("type", "Shibas")
        startActivity(intent)
    }

    fun gatos(view: View) {
        val intent = Intent(this, PrincipalActivity::class.java)
        intent.putExtra("dir", "cats?count=30&urls=true&httpsUrls=true")
        intent.putExtra("type", "Gatos")
        startActivity(intent)
    }

    fun pajaros(view: View) {
        val intent = Intent(this, PrincipalActivity::class.java)
        intent.putExtra("dir", "birds?count=30&urls=true&httpsUrls=true")
        intent.putExtra("type", "Aves")
        startActivity(intent)
    }
}
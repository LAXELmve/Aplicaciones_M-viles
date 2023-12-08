package com.example.api_prctica_8

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.api_prctica_8.databinding.ActivityPrincipalBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding
    private lateinit var adapter: ElementAdapter
    private val elementImages = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        val titularB = intent.getStringExtra("type")
        val actionBar = supportActionBar
        actionBar?.title = titularB
        actionBar?.setDisplayHomeAsUpEnabled(true)
        if (titularB.equals("Shibas")) {
            val colorDrawable = ColorDrawable(ContextCompat.getColor(this, R.color.primario))
            actionBar?.setBackgroundDrawable(colorDrawable)
        }
        if (titularB.equals("Gatos")) {
            val colorDrawable = ColorDrawable(ContextCompat.getColor(this, R.color.secundario))
            actionBar?.setBackgroundDrawable(colorDrawable)
        }
        if (titularB.equals("Aves")) {
            val colorDrawable = ColorDrawable(ContextCompat.getColor(this, R.color.terciario))
            actionBar?.setBackgroundDrawable(colorDrawable)
        }
        actionBar?.show()

        buscarResultados()
    }

    private fun initRecyclerView() {
        adapter = ElementAdapter(elementImages)
        binding.rvElements.layoutManager = LinearLayoutManager(this)
        binding.rvElements.adapter = adapter
    }

    private fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://shibe.online/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buscarResultados(){
        CoroutineScope(Dispatchers.IO).launch {
            val ruta = intent.getStringExtra("dir")!!
            Log.d("Vista",ruta)
            val call = getRetrofit().create(APIService::class.java).getElementsByCategory(ruta)
            val elements = call.body()
            runOnUiThread {
                if(call.isSuccessful){
                    Log.d("Vista","Acceso exitoso.")
                    val images: List<String> = elements ?: emptyList()
                    elementImages.clear()
                    elementImages.addAll(images)
                    adapter.notifyDataSetChanged()
                }else{
                    showError()
                }
            }

        }
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_LONG).show()
    }

}
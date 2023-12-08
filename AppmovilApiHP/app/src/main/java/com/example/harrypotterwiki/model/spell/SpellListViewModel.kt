package com.example.harrypotterwiki.model.spell

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harrypotterwiki.api.ApiService
import com.example.harrypotterwiki.settings.BASE_URL
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SpellListViewModel : ViewModel() {

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val hogwartsApi: ApiService = retrofit.create(ApiService::class.java)

    // Define la propiedad spells
    private val _spells = MutableLiveData<List<Spell>>()
    val spells: LiveData<List<Spell>> = _spells

    fun getSpellList(){
        hogwartsApi.getSpells().enqueue(object : Callback<List<Spell>> {
            override fun onResponse(call: Call<List<Spell>>, response: Response<List<Spell>>) {
                if (response.isSuccessful) {
                    _spells.value = response.body()
                } else {
                    Log.e("API error", "Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Spell>>, t: Throwable) {
                Log.e("API error", "Error: ${t.message}")
            }
        })
    }
}
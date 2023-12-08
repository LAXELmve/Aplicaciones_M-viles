package com.example.harrypotterwiki.model.staff

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

class StaffListViewModel() : ViewModel() {


    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val hogwartsApi: ApiService = retrofit.create(ApiService::class.java)

    // Define la propiedad staffs
    private val _staffs = MutableLiveData<List<Staff>>()
    val staffs: LiveData<List<Staff>> = _staffs

    fun getStaffList(){
        hogwartsApi.getStaffs().enqueue(object : Callback<List<Staff>> {
            override fun onResponse(call: Call<List<Staff>>, response: Response<List<Staff>>) {
                if (response.isSuccessful) {
                    _staffs.value = response.body()
                } else {
                    Log.e("API error", "Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Staff>>, t: Throwable) {
                Log.e("API error", "Error: ${t.message}")
            }
        })
    }
}

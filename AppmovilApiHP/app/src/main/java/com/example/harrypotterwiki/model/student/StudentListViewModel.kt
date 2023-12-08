package com.example.harrypotterwiki.model.student

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

class StudentListViewModel() : ViewModel() {


    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val hogwartsApi: ApiService= retrofit.create(ApiService::class.java)

    // Define la propiedad students
    private val _students = MutableLiveData<List<Student>>()
    val students: LiveData<List<Student>> = _students

    fun getStudentList(){
        hogwartsApi.getStudents().enqueue(object : Callback<List<Student>> {
            override fun onResponse(call: Call<List<Student>>, response: Response<List<Student>>) {
                if (response.isSuccessful) {
                    _students.value = response.body()
                } else {
                    Log.e("API error", "Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Student>>, t: Throwable) {
                Log.e("API error", "Error: ${t.message}")
            }
        })
    }
}

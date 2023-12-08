package com.example.harrypotterwiki.api


import com.example.harrypotterwiki.model.spell.Spell
import com.example.harrypotterwiki.model.staff.Staff
import com.example.harrypotterwiki.model.student.Student
import com.example.harrypotterwiki.settings.SPELL
import com.example.harrypotterwiki.settings.STAFF
import com.example.harrypotterwiki.settings.STUDENTS

import retrofit2.Call

import retrofit2.http.GET


interface ApiService {

    @GET(STUDENTS)
    fun getStudents(): Call<List<Student>>

    @GET(STAFF)
    fun getStaffs(): Call<List<Staff>>

    @GET(SPELL)
    fun getSpells(): Call<List<Spell>>



}
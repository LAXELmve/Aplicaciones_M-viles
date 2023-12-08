package com.example.harrypotterwiki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterwiki.R
import com.example.harrypotterwiki.model.staff.StaffAdapter
import com.example.harrypotterwiki.model.staff.StaffListViewModel

class StaffList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_list)

        val staffList = findViewById<RecyclerView>(R.id.staffRecycler)
        staffList.layoutManager = LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this)[StaffListViewModel::class.java]
        viewModel.getStaffList()
        viewModel.staffs.observe(this) { staffs ->
            val adapter = StaffAdapter(staffs)
            staffList.adapter = adapter
        }
    }
}
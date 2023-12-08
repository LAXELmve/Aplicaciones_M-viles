package com.example.harrypotterwiki.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterwiki.R
import com.example.harrypotterwiki.model.student.StudentAdapter
import com.example.harrypotterwiki.model.student.StudentListViewModel


class StudentList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val studentList = findViewById<RecyclerView>(R.id.studentListRecyclerView)
        studentList.layoutManager = LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this)[StudentListViewModel::class.java]
        viewModel.getStudentList()
        viewModel.students.observe(this) { students ->
            val adapter = StudentAdapter(students)
            studentList.adapter = adapter
        }
    }
}


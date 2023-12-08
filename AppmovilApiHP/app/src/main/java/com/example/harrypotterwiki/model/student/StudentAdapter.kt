package com.example.harrypotterwiki.model.student

import android.view.LayoutInflater

import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.harrypotterwiki.R

import com.example.harrypotterwiki.databinding.StudentListBinding


class StudentAdapter(private val students: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    inner class StudentViewHolder(private val binding: StudentListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.nameTextView.text = student.name
            binding.birthText.text = student.dateOfBirth
            Glide.with(binding.imageView.context).load(student.image).placeholder(R.drawable.cardsnitch).into(binding.imageView)
            binding.nameTextView.text = student.name
            binding.birthText.text = "Birth: ${student.dateOfBirth}"
            binding.genderText.text = "Gender: ${student.gender}"
            binding.houseText.text = "House: ${student.house}"
            binding.patronusText.text = "Patronous: ${student.patronus}"
            binding.actorText.text = "Actor: ${student.actor}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val binding = StudentListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.bind(student)

    }

    override fun getItemCount() = students.size
}

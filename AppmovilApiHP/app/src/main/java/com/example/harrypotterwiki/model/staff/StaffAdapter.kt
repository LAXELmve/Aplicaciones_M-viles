package com.example.harrypotterwiki.model.staff

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.harrypotterwiki.R
import com.example.harrypotterwiki.databinding.StaffListBinding

class StaffAdapter (private val staffs: List<Staff>) :
    RecyclerView.Adapter<StaffAdapter.StaffViewHolder>() {

    inner class StaffViewHolder(private val binding: StaffListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(staff: Staff) {
            binding.nameTextView.text = staff.name
            binding.birthText.text = staff.dateOfBirth
            Glide.with(binding.imageView.context).load(staff.image).placeholder(R.drawable.cardsnitch).into(binding.imageView)
            binding.nameTextView.text = staff.name
            binding.birthText.text = "Birth: ${staff.dateOfBirth}"
            binding.genderText.text = "Gender: ${staff.gender}"
            binding.houseText.text = "House: ${staff.house}"
            binding.patronusText.text = "Patronous: ${staff.patronus}"
            binding.actorText.text = "Actor: ${staff.actor}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaffViewHolder {
        val binding = StaffListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StaffViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StaffViewHolder, position: Int) {
        val staff = staffs[position]
        holder.bind(staff)

    }

    override fun getItemCount() = staffs.size
}

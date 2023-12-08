package com.example.appdog

import com.google.gson.annotations.SerializedName

data class DogResponse (
    @SerializedName("status") var status: String,
    @SerializedName("message") var imagenes: List<String>
)

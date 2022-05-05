package com.example.rupyzassignment.Model

import com.google.gson.annotations.SerializedName

data class ContentResponse(
    @SerializedName("data")
    val data: ArrayList<DataX>,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String
)
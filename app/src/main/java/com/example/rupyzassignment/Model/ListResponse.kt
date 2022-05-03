package com.example.rupyzassignment.Model

data class ListResponse(
    val data: ArrayList<Data>,
    val error: Boolean,
    val message: String
)
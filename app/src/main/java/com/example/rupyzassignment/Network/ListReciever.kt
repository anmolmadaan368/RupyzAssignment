package com.example.rupyzassignment.Network

import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListReciever {

    companion object{





        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://documenter.getpostman.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val networkInterface:NetworkInterface by lazy {
            retrofit.create(NetworkInterface::class.java)
        }
    }


    init {

    }

    suspend fun getUsers(): List<ListResponse> {
        return networkInterface.getUsers()
    }
}
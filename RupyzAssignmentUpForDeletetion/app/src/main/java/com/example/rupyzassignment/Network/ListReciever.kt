package com.example.rupyzassignment.Network

import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ListReciever {

    // TODO: proper api response link: http://devdeployed.rupyz.com:8080/v1/blog/public/?page_no=1

    companion object{

        val retrofit = Retrofit
            .Builder()
            .baseUrl("http://devdeployed.rupyz.com:8080/")
            //.baseUrl("https://documenter.getpostman.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val networkInterface:NetworkInterface by lazy {
            retrofit.create(NetworkInterface::class.java)
        }
    }


    init {

    }

    suspend fun getUsers(): ListResponse {
        return networkInterface.getUsers()
    }
}
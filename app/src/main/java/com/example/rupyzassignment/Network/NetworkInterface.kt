package com.example.rupyzassignment.Network

import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import retrofit2.http.GET

interface NetworkInterface {

    @GET("view/16432993/UyrHesnK")
    suspend fun getUsers():List<ListResponse>
}
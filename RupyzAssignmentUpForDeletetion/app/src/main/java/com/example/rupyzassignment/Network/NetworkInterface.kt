package com.example.rupyzassignment.Network

import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import retrofit2.http.GET

interface NetworkInterface {

    // TODO: retrieved object type is ListResponse
    //@GET("view/16432993/UyrHesnK")
    @GET("v1/blog/public/?page_no=1")
    suspend fun getUsers(): ListResponse
}
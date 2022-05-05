package com.example.rupyzassignment.Network

import com.example.rupyzassignment.Model.ContentResponse
import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import retrofit2.http.GET

interface NetworkInterface {

    @GET("v1/blog/public/?page_no=1")
    suspend fun getUsers():ListResponse

    @GET("v1/blog/public/?slug_str")
    suspend fun getContent():ContentResponse
}
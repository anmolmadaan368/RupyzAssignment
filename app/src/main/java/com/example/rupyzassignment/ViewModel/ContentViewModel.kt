package com.example.rupyzassignment.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rupyzassignment.Model.ContentResponse
import com.example.rupyzassignment.Model.ListResponse
import com.example.rupyzassignment.Network.ContentReciever
import com.example.rupyzassignment.Network.ListReciever
import kotlinx.coroutines.launch

class ContentViewModel(private val contentReciever: ContentReciever): ViewModel() {

    val m_response : MutableLiveData<ContentResponse> = MutableLiveData()

    fun getUsers(){

        viewModelScope.launch {
            try {
                val response = contentReciever.getUsers()
                m_response.value = response
                Log.d("mainTest", "Success")

            } catch (exception: Exception) {

                Log.d("mainTest", "getmsg- ${exception.message}")
            }

        }
    }
}
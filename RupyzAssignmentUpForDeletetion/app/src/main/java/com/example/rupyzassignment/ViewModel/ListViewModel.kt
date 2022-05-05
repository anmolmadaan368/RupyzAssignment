package com.example.rupyzassignment.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import com.example.rupyzassignment.Network.ListReciever
import kotlinx.coroutines.launch

class ListViewModel(private val listReciever: ListReciever):ViewModel() {

    val m_response : MutableLiveData<ListResponse> = MutableLiveData()

    fun getUsers(){

        viewModelScope.launch {
            try {
                val response = listReciever.getUsers()
                m_response.value = response
                Log.d("mainTest", "Success response: $response")

            } catch (exception: Exception) {

                Log.e("mainTest", "getmsg- ${exception.message}", exception)
            }

        }
    }
}

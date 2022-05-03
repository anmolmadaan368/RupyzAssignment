package com.example.rupyzassignment.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.rupyzassignment.Model.ListResponse
import com.example.rupyzassignment.Network.ListReciever
import kotlinx.coroutines.launch

class ListViewModelFactory(private val listReciever: ListReciever): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListViewModel(listReciever) as T
    }
}
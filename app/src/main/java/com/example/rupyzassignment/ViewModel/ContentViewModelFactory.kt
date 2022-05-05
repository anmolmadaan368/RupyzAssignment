package com.example.rupyzassignment.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rupyzassignment.Network.ContentReciever
import com.example.rupyzassignment.Network.ListReciever

class ContentViewModelFactory(private val contentReciever: ContentReciever): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ContentViewModel(contentReciever) as T
    }

    }
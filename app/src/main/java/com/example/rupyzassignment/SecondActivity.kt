package com.example.rupyzassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rupyzassignment.Adapter.ContentAdapter
import com.example.rupyzassignment.Adapter.RecyclerViewAdapter
import com.example.rupyzassignment.Network.ContentReciever
import com.example.rupyzassignment.Network.ListReciever
import com.example.rupyzassignment.ViewModel.ContentViewModel
import com.example.rupyzassignment.ViewModel.ContentViewModelFactory
import com.example.rupyzassignment.ViewModel.ListViewModel
import com.example.rupyzassignment.ViewModel.ListViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val contentReciever:ContentReciever = ContentReciever()
    private lateinit var contentAdapter: ContentAdapter
    private lateinit var contentViewModel: ContentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initRecyclerView()
        val viewModelFactory = ContentViewModelFactory(contentReciever)
        contentViewModel = ViewModelProvider(this,viewModelFactory)[ContentViewModel::class.java]
        contentViewModel.getUsers()
        contentViewModel.m_response.observe(this, Observer {
            contentAdapter.setUserData(it.data)
            recyclerView1.visibility = View.VISIBLE
        })
    }

    private fun initRecyclerView(){

         contentAdapter = ContentAdapter(this, ArrayList())

        recyclerView1.apply {

            recyclerView1.layoutManager = LinearLayoutManager(this@SecondActivity)
            adapter = contentAdapter
        }}
}
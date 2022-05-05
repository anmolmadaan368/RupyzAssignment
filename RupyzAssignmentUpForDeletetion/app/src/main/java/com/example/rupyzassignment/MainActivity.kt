package com.example.rupyzassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rupyzassignment.Adapter.RecyclerViewAdapter
import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import com.example.rupyzassignment.Network.ListReciever
import com.example.rupyzassignment.ViewModel.ListViewModel
import com.example.rupyzassignment.ViewModel.ListViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    private val listReciever:ListReciever = ListReciever()
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var listViewModel:ListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        val viewModelFactory = ListViewModelFactory(listReciever)
        listViewModel = ViewModelProvider(this,viewModelFactory)[ListViewModel::class.java]
        listViewModel.getUsers()
        listViewModel.m_response.observe(this, Observer {
            recyclerViewAdapter.setUserData(it.data)
            recyclerView.visibility = View.VISIBLE
        })
    }

    private fun initRecyclerView(){

        recyclerViewAdapter = RecyclerViewAdapter(this, ArrayList())

        recyclerView.apply {

            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerViewAdapter
        }}
}
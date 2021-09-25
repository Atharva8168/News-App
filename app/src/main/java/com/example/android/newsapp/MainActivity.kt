package com.example.android.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = NewsListAdapter(items)
        recycler_view.adapter = adapter

    }

    private fun fetchData() : ArrayList<String>{
        val list = ArrayList<String>()
        for (i in 0 until 100){
            list.add("Item $i")
        }
        return list
    }
}
package com.example.recyclerviewwithanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithanimations.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerAdapter = RecyclerAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = recyclerAdapter
        recyclerview.setHasFixedSize(true)
    }
}

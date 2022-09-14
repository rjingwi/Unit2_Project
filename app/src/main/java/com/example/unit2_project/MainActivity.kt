package com.example.unit2_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var items: List<ListItem>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wishlistRv = findViewById<RecyclerView>(R.id.wishlistRv)
        items = emptyList()
        val button = findViewById<Button>(R.id.button)
        val namebox = findViewById<EditText>(R.id.nameBox)
        val pricebox = findViewById<EditText>(R.id.priceBox)
        val urlbox = findViewById<EditText>(R.id.urlBox)

        button.setOnClickListener(){
            items += ListItem(namebox.text.toString(),pricebox.text.toString(),urlbox.text.toString())
            val adapter = ListAdapter(items)
            wishlistRv.adapter = adapter
            wishlistRv.layoutManager = LinearLayoutManager(this)
        }
    }
}
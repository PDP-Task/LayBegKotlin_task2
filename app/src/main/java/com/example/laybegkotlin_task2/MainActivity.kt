package com.example.laybegkotlin_task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val btnOpen = findViewById<Button>(R.id.btn_open)
        btnOpen.setOnClickListener {
            val user = User("Samandar", 18)
            openDetailActivity(user)
        }
    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("key", user)
        startActivity(intent)
    }
}
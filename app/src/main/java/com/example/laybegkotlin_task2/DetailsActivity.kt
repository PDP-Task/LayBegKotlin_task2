package com.example.laybegkotlin_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        initView()

    }

    private fun initView() {
        val textView = findViewById<TextView>(R.id.textView)
        val text = intent.getSerializableExtra("key")
        textView.text = text.toString()
    }
}
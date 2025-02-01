package com.example.listviewapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val kegiatan: TextView = findViewById(R.id.activity_main2)

        val intent = intent
        val data = intent.getStringExtra("EXTRA_DATA")
        kegiatan.text = "Anda Memilih List $data"
    }
}
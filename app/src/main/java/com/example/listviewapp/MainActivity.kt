package com.example.listviewapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listKegiatan: ListView = findViewById(R.id.lv_kegiatan)
        val kegiatan = arrayOf("Belanja", "Olahraga", "Rapat", "Tidur", "Makan",
            "Ibadah", "Bermain", "Minum", "Duduk", "Ngopi")

        val adapterKegiatan = ArrayAdapter(this, android.R.layout.simple_list_item_1, kegiatan)
        listKegiatan.adapter = adapterKegiatan

        listKegiatan.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,
                "ID ${position + 1}\n Nama Kegiatan: ${kegiatan[position]}",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("EXTRA_DATA", kegiatan[position])


            startActivity(intent)
        }
    }
}


//
//        listKegiatan.setOnItemClickListener(object : AdapterView.OnItemClickListener{
//            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                Toast.makeText(applicationContext,
//                    "ID ${position + 1}\n Nama Kegiatan: ${kegiatan[position]}",
//                    Toast.LENGTH_SHORT).show()
//            }
//        })
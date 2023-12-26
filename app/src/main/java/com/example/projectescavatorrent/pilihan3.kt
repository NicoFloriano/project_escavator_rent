package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilihan3 : AppCompatActivity() {
    private lateinit var buttonPesan3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan3)

        buttonPesan3 = findViewById(R.id.btn_pesan3)

        buttonPesan3.setOnClickListener {
            val intentDirection = Intent(this@pilihan3, transaksi::class.java)
            startActivity(intentDirection)
        }
    }
}
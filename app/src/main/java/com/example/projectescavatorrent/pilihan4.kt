package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilihan4 : AppCompatActivity() {
    private lateinit var buttonPesan4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan4)

        buttonPesan4 = findViewById(R.id.btn_pesan4)

        buttonPesan4.setOnClickListener {
            val intentDirection = Intent(this@pilihan4, transaksi::class.java)
            startActivity(intentDirection)
        }
    }
}
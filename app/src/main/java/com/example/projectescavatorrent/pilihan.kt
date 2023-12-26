package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pilihan : AppCompatActivity() {
    private lateinit var buttonPesan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan)

        buttonPesan = findViewById(R.id.btn_pesan)

        buttonPesan.setOnClickListener {
            val intentDirection = Intent(this@pilihan, transaksi::class.java)
            startActivity(intentDirection)
        }
    }
}
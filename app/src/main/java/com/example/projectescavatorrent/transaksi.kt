package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class transaksi : AppCompatActivity() {
    private lateinit var buttonFinish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaksi)

        buttonFinish = findViewById(R.id.btn_finish)

        buttonFinish.setOnClickListener {
            val intentDirection = Intent(this@transaksi, home::class.java)
            startActivity(intentDirection)
        }
    }
}
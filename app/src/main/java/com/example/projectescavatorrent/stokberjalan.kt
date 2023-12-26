package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class stokberjalan : AppCompatActivity() {
    private lateinit var buttonTersedia3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stokberjalan)

        buttonTersedia3 = findViewById(R.id.btn_tersedia3)

        buttonTersedia3.setOnClickListener {
            val intentDirection = Intent(this@stokberjalan, stoktersedia::class.java)
            startActivity(intentDirection)
        }
    }
}
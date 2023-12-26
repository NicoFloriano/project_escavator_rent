package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class daftar : AppCompatActivity() {
    private lateinit var ButtonCreate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        ButtonCreate = findViewById(R.id.btn_create)

        ButtonCreate.setOnClickListener {
            val intentDirection = Intent(this@daftar, login::class.java)
            startActivity(intentDirection)
        }
    }
}
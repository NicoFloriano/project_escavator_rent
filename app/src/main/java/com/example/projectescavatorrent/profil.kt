package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profil : AppCompatActivity() {
    private lateinit var buttonLogOut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        buttonLogOut = findViewById(R.id.btn_logout)

        buttonLogOut.setOnClickListener {
            val intentDirection = Intent(this@profil, login::class.java)
            startActivity(intentDirection) }
    }
}
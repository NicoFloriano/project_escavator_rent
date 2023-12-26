package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonSignIn: Button
    private lateinit var buttonSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignIn = findViewById(R.id.btn_signin)
        buttonSignUp = findViewById(R.id.btn_signup)

        //intent untuk memindahkan halaman ketika button di klik
        buttonSignIn.setOnClickListener {
            val intentDirection = Intent(this@MainActivity, login::class.java)
            startActivity(intentDirection)
        }

        buttonSignUp.setOnClickListener {
            val intentDirection = Intent(this@MainActivity, daftar::class.java)
            startActivity(intentDirection)
        }
    }
}
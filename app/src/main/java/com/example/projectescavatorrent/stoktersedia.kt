package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class stoktersedia : AppCompatActivity() {
    private lateinit var buttonBerjalan2 : Button
    private lateinit var  buttonRentall1 : Button
    private lateinit var  buttonRentall2 : Button
    private lateinit var  buttonRentall3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stoktersedia)

        buttonBerjalan2 = findViewById(R.id.btn_berjalan2)
        buttonRentall1 = findViewById(R.id.btn_rentall1)
        buttonRentall2 = findViewById(R.id.btn_rentall2)
        buttonRentall3 = findViewById(R.id.btn_rentall3)

        buttonBerjalan2.setOnClickListener {
            val intentDirection = Intent(this@stoktersedia, stokberjalan::class.java)
            startActivity(intentDirection)
        }
        buttonRentall1.setOnClickListener {
            val intentDirection = Intent(this@stoktersedia, pilihan::class.java)
            startActivity(intentDirection)
        }
        buttonRentall2.setOnClickListener {
            val intentDirection = Intent(this@stoktersedia, pilihan3::class.java)
            startActivity(intentDirection)
        }
        buttonRentall3.setOnClickListener {
            val intentDirection = Intent(this@stoktersedia, pilihan4::class.java)
            startActivity(intentDirection)
        }
    }
}
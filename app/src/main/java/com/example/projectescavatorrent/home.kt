package com.example.projectescavatorrent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class home : AppCompatActivity() {
    private lateinit var buttonRental: Button
    private lateinit var buttonRental2: Button
    private lateinit var buttonRental3: Button
    private lateinit var buttonRental4: Button
    private lateinit var buttonTersedia : Button
    private lateinit var buttonBerjalan : Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonRental = findViewById(R.id.btn_rental1)
        buttonRental2 = findViewById(R.id.btn_rental2)
        buttonRental3 = findViewById(R.id.btn_rental3)
        buttonRental4 = findViewById(R.id.btn_rental4)
        buttonTersedia = findViewById(R.id.btn_tersedia)
        buttonBerjalan = findViewById(R.id.btn_berjalan)
        imageView = findViewById(R.id.akunn)


        buttonRental.setOnClickListener {
            val intentDirection = Intent(this@home, pilihan::class.java)
            startActivity(intentDirection) }

        buttonRental2.setOnClickListener {
            val intentDirection = Intent(this@home, pilihan2::class.java)
            startActivity(intentDirection) }

        buttonRental3.setOnClickListener {
            val intentDirection = Intent(this@home, pilihan3::class.java)
            startActivity(intentDirection) }

        buttonRental4.setOnClickListener {
            val intentDirection = Intent(this@home, pilihan4::class.java)
            startActivity(intentDirection) }

        buttonTersedia.setOnClickListener {
            val intentDirection = Intent(this@home, stoktersedia::class.java)
            startActivity(intentDirection) }

        buttonBerjalan.setOnClickListener {
            val intentDirection = Intent(this@home, stokberjalan::class.java)
            startActivity(intentDirection) }

        imageView.setOnClickListener {
            val intentDirection = Intent(this@home, profil::class.java)
            startActivity(intentDirection) }


    }
}
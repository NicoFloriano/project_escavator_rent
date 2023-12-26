package com.example.projectescavatorrent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class login : AppCompatActivity() {
    private lateinit var ButtonLogIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ButtonLogIn = findViewById(R.id.btn_login)
        val username: EditText = findViewById(R.id.kol_usernamelogin)
        val password: EditText = findViewById(R.id.kol_passwordlogin)

        ButtonLogIn.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()
            val BASE_URL = "https://nicofloriano.000webhostapp.com/api-login.php"
            val url = "$BASE_URL?username=$username&password=$password"

            if (!(username.isEmpty() || password.isEmpty())) {

                val requestQueue = Volley.newRequestQueue(applicationContext)

                val stringRequest = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener { response ->
                        Log.d("Server Response", response)
                        if (response == "Selamat Datang") {
                            Toast.makeText(applicationContext, "Login Berhasil", Toast.LENGTH_SHORT)
                                .show()
                            startActivity(Intent(applicationContext, home::class.java))
                        } else {
                            Toast.makeText(applicationContext, "Login Gagal", Toast.LENGTH_SHORT)
                                .show()
                        }
                    },
                    Response.ErrorListener { error ->
                        Toast.makeText(applicationContext, error.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                )
                requestQueue.add(stringRequest)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Password Atau Username Salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
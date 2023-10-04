package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnlogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)

        //event saat button Login click
        btnlogin.setOnClickListener(
            //login cek
        if(txtUsername.text.toString().equals("rifki")&&
                txtPassword.text.toString().equals("amikom")) {
            //call manager
            val intent =Intent( this,MainActivity::class.java)
            startActivity(intent)
        }else {
            Toast.makeText(this,"Login gagal,cek username dan password", Toast.LENGTH_SHORT).show()
        }
        )
    }
}
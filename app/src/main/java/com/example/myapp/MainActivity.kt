package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton :Button = findViewById(R.id.btnLogin)
        val etMail :EditText = findViewById(R.id.etEmail)
        val etPassword :EditText = findViewById(R.id.etPasssword)

        loginButton.setOnClickListener{
            val email :String = etMail.text.toString()
            val pass :String = etPassword.text.toString()

            if (email == "gmail@nakul.in" && pass == "1234"){
                Toast.makeText(this,"Login successful" ,Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Invalid Credentials" ,Toast.LENGTH_LONG).show()
            }
        }

    }
}
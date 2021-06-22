package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView

class signUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpbtn :Button = findViewById(R.id.btnSignUp)
        val backButton :CardView = findViewById(R.id.cardViewBack)
        val etPassword : EditText = findViewById(R.id.etPasssword)
        val etNewPassword :EditText = findViewById(R.id.etNewPass)

        backButton.setOnClickListener{
            val intent = Intent(this ,MainActivity::class.java)
            startActivity(intent)
        }

        signUpbtn.setOnClickListener{
            val newPass:String = etNewPassword.text.toString()
            val pass:String = etPassword.text.toString()
            if (newPass===pass){

                val intent = Intent(this ,MainActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this ,"Password Do not Match",Toast.LENGTH_SHORT).show()
            }

        }

    }
}
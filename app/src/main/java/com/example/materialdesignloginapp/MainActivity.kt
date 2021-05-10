package com.example.materialdesignloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signInButton = findViewById<MaterialButton>(R.id.next_button)

        signInButton.setOnClickListener(){
            if (email.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
        } else {
            if (email.text.toString() == "josephadikwu@gmail.com" && password.text.toString() == "woman"){
               val intent = Intent(this, com.example.materialdesignloginapp.ListView::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_LONG).show()
            }
            }
        }
    }
}
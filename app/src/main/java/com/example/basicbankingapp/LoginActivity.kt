package com.example.basicbankingapp

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

        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "marwa" && password == "123456") {
                val intent = Intent(this, AccountDetailsActivity::class.java)
                startActivity(intent)
            }else{
                val message = "wrong user name or password!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(this, message, duration)
                toast.show()

            }
        }
    }
}

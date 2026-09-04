package com.example.digilocker

import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvLogin = findViewById<TextView>(R.id.tvLogin)

        tvLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()
            val password = findViewById<EditText>(R.id.etPassword).text.toString()
            val confirmPassword = findViewById<EditText>(R.id.etConfirmPassword).text.toString()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
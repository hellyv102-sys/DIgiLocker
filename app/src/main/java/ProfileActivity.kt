package com.example.digilocker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnEditProfile = findViewById<Button>(R.id.btnEditProfile)

        btnEditProfile.setOnClickListener {
            Toast.makeText(
                this,
                "Profile Updated Successfully",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
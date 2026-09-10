package com.example.digilocker

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val switchNotification = findViewById<Switch>(R.id.switchNotification)
        val switchDarkMode = findViewById<Switch>(R.id.switchDarkMode)
        val btnLanguage = findViewById<Button>(R.id.btnLanguage)
        val btnAbout = findViewById<Button>(R.id.btnAbout)

        switchNotification.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Notifications Enabled", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Notifications Disabled", Toast.LENGTH_SHORT).show()
            }
        }

        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Dark Mode Enabled", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Dark Mode Disabled", Toast.LENGTH_SHORT).show()
            }
        }

        btnLanguage.setOnClickListener {
            Toast.makeText(this, "Language Changed", Toast.LENGTH_SHORT).show()
        }

        btnAbout.setOnClickListener {
            Toast.makeText(this, "DigiLocker Version 1.0", Toast.LENGTH_SHORT).show()
        }
    }
}
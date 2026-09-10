package com.example.digilocker

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvMyDocuments = findViewById<TextView>(R.id.tvMyDocuments)
        val tvAddDocument = findViewById<TextView>(R.id.tvAddDocument)
        val tvProfile = findViewById<TextView>(R.id.tvProfile)

        // Open My Documents
        tvMyDocuments.setOnClickListener {
            val intent = Intent(this, DocumentsActivity::class.java)
            startActivity(intent)
        }

        // Open Add Document
        tvAddDocument.setOnClickListener {
            val intent = Intent(this, AddDocumentActivity::class.java)
            startActivity(intent)
        }

        // Open Profile
        tvProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        val tvSettings = findViewById<TextView>(R.id.tvSettings)
        val tvHelp = findViewById<TextView>(R.id.tvHelp)
        val tvLogout = findViewById<TextView>(R.id.tvLogout)

        tvSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        tvHelp.setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        }

        tvLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

}
package com.example.digilocker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DocumentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documents)

        val btnAddDocument = findViewById<Button>(R.id.btnAddDocument)

        btnAddDocument.setOnClickListener {
            Toast.makeText(
                this,
                "Add Document feature coming soon!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
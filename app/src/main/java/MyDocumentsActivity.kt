package com.example.digilocker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyDocumentsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document_details)

        val tvDocumentName = findViewById<TextView>(R.id.tvDocumentName)
        val tvDocumentNumber = findViewById<TextView>(R.id.tvDocumentNumber)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val btnViewDocument = findViewById<Button>(R.id.btnViewDocument)
        val btnDeleteDocument = findViewById<Button>(R.id.btnDeleteDocument)

        val documentName = intent.getStringExtra("documentName") ?: "Document"

        tvDocumentName.text = documentName

        when (documentName) {
            "Aadhaar Card" -> {
                tvDocumentNumber.text = "Document Number: XXXX XXXX 1234"
                tvStatus.text = "Status: Verified"
            }

            "PAN Card" -> {
                tvDocumentNumber.text = "Document Number: ABCDE1234F"
                tvStatus.text = "Status: Verified"
            }

            "Driving Licence" -> {
                tvDocumentNumber.text = "Document Number: GJ0123456789"
                tvStatus.text = "Status: Verified"
            }

            "Certificates" -> {
                tvDocumentNumber.text = "Document Number: CERT-2026-001"
                tvStatus.text = "Status: Uploaded"
            }
        }

        btnViewDocument.setOnClickListener {
            Toast.makeText(this, "Viewing $documentName", Toast.LENGTH_SHORT).show()
        }

        btnDeleteDocument.setOnClickListener {
            Toast.makeText(this, "$documentName Deleted", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
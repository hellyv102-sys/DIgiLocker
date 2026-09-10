package com.example.digilocker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DocumentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_documents)

        val tvAadhaar = findViewById<TextView>(R.id.tvAadhaar)
        val tvPan = findViewById<TextView>(R.id.tvPan)
        val tvDrivingLicense = findViewById<TextView>(R.id.tvDrivingLicense)
        val tvCertificates = findViewById<TextView>(R.id.tvCertificates)
        val btnAddDocument = findViewById<Button>(R.id.btnAddDocument)

        // Aadhaar Card
        tvAadhaar.setOnClickListener {
            openDocument("Aadhaar Card")
        }

        // PAN Card
        tvPan.setOnClickListener {
            openDocument("PAN Card")
        }

        // Driving Licence
        tvDrivingLicense.setOnClickListener {
            openDocument("Driving Licence")
        }

        // Certificates
        tvCertificates.setOnClickListener {
            openDocument("Certificates")
        }

        // Add Document Button
        btnAddDocument.setOnClickListener {
            val intent = Intent(this, AddDocumentActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openDocument(documentName: String) {
        val intent = Intent(this, DocumentDetailsActivity::class.java)
        intent.putExtra("documentName", documentName)
        startActivity(intent)
    }
}
package com.example.digilocker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DocumentDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document_details)

        val tvDocumentName = findViewById<TextView>(R.id.tvDocumentName)
        val tvDocumentNumber = findViewById<TextView>(R.id.tvDocumentNumber)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val imgDocument = findViewById<ImageView>(R.id.imgDocument)
        val btnViewDocument = findViewById<Button>(R.id.btnViewDocument)
        val btnDeleteDocument = findViewById<Button>(R.id.btnDeleteDocument)

        val documentName = intent.getStringExtra("documentName") ?: "Document"

        imgDocument.visibility = View.GONE

        when (documentName) {

            "Aadhaar Card" -> {
                tvDocumentName.text = "Aadhaar Card"
                tvDocumentNumber.text = "Document Number: XXXX XXXX 1234"
                tvStatus.text = "Status: Verified"
                imgDocument.setImageResource(R.drawable.aadharcard)
            }

            "PAN Card" -> {
                tvDocumentName.text = "PAN Card"
                tvDocumentNumber.text = "Document Number: ABCDE1234F"
                tvStatus.text = "Status: Verified"
                imgDocument.setImageResource(R.drawable.pancard)
            }

            "Driving Licence" -> {
                tvDocumentName.text = "Driving Licence"
                tvDocumentNumber.text = "Document Number: GJ0123456789"
                tvStatus.text = "Status: Verified"
                imgDocument.setImageResource(R.drawable.licence)
            }

            "Certificates" -> {
                tvDocumentName.text = "Certificates"
                tvDocumentNumber.text = "Document Number: CERT2026001"
                tvStatus.text = "Status: Uploaded"
                imgDocument.setImageResource(R.drawable.certificate)
            }
        }

        btnViewDocument.setOnClickListener {
            imgDocument.visibility = View.VISIBLE
            Toast.makeText(this, "Viewing $documentName", Toast.LENGTH_SHORT).show()
        }

        btnDeleteDocument.setOnClickListener {
            Toast.makeText(this, "$documentName Deleted", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
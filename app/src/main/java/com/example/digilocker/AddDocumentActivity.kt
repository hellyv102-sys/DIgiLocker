package com.example.digilocker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddDocumentActivity : AppCompatActivity() {

    private lateinit var imgPreview: ImageView
    private lateinit var etDocumentName: EditText
    private var imageSelected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_document)

        imgPreview = findViewById(R.id.imgPreview)
        etDocumentName = findViewById(R.id.etDocumentName)

        val btnChooseImage = findViewById<Button>(R.id.btnChooseImage)
        val btnUpload = findViewById<Button>(R.id.btnUpload)

        // Choose Image
        btnChooseImage.setOnClickListener {

            val name = etDocumentName.text.toString().trim().lowercase()

            imageSelected = true

            when {
                name.contains("aadhaar") || name.contains("aadhar") -> {
                    imgPreview.setImageResource(R.drawable.aadharcard)
                }

                name.contains("pan") -> {
                    imgPreview.setImageResource(R.drawable.pancard)
                }

                // FIXED FOR LICENCE
                name.contains("licence") ||
                        name.contains("license") ||
                        name.contains("driving") -> {
                    imgPreview.setImageResource(R.drawable.licence)
                }

                name.contains("certificate") -> {
                    imgPreview.setImageResource(R.drawable.certificate)
                }

                else -> {
                    imageSelected = false
                    Toast.makeText(
                        this,
                        "Enter Aadhaar, PAN, Licence or Certificate",
                        Toast.LENGTH_SHORT
                    ).show()
                    return@setOnClickListener
                }
            }

            Toast.makeText(this, "Image Selected", Toast.LENGTH_SHORT).show()
        }

        // Upload Document
        btnUpload.setOnClickListener {

            val name = etDocumentName.text.toString().trim()

            if (name.isEmpty()) {
                Toast.makeText(this, "Enter Document Name", Toast.LENGTH_SHORT).show()

            } else if (!imageSelected) {
                Toast.makeText(this, "Choose Image", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Document Uploaded Successfully", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}
package com.example.zurajabauri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.next)

    nextButton.setOnClickListener {
        val intent = Intent(this, SecondaryActivity::class.java)
        startActivity(intent)
    }
        val nameView = findViewById<TextView>(R.id.nameView)
        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val okayButton = findViewById<Button>(R.id.okay)

        okayButton.setOnClickListener {
            val inputName = inputEditText.text.toString()

            // Update the TextView with the entered name
            if (inputName.isNotEmpty()) {
                nameView.text = "Hello, $inputName"
            }
        }
    }
}
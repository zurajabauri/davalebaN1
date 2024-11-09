package com.example.zurajabauri

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val numberTextView = findViewById<TextView>(R.id.number)
        val incrementButton = findViewById<Button>(R.id.incrementButton)

        incrementButton.setOnClickListener {
            counter += 1

            numberTextView.text = counter.toString()
        }
    }
}

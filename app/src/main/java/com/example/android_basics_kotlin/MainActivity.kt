package com.example.android_basics_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.textView)
        rollButton.setOnClickListener{
            resultTextView.text = "6"
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        }
    }
}
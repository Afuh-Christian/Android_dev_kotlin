package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<TextInputEditText>(R.id.inputONE)
val input2 = findViewById<TextInputEditText>(R.id.inputTWO)
        val tvRESULT = findViewById<TextView>(R.id.tvRESULT)
        val btnSUM = findViewById<Button>(R.id.btnSUM)
        val btnSUBTRACT = findViewById<Button>(R.id.btnSUBTRACT)
        val btnMULTIPLY = findViewById<Button>(R.id.btnMULTIPLY)
        val btnDIVIDE = findViewById<Button>(R.id.btnDIVIDE)

        btnSUM.setOnClickListener {
            tvRESULT.text = (input1.text.toString().toDouble() + input2.text.toString().toDouble()).toString()
        }

        btnSUBTRACT.setOnClickListener {
            tvRESULT.text = (input1.text.toString().toDouble() - input2.text.toString().toDouble()).toString()
        }

        btnMULTIPLY.setOnClickListener {
            tvRESULT.text = (input1.text.toString().toDouble() * input2.text.toString().toDouble()).toString()
        }

        btnDIVIDE.setOnClickListener {
            tvRESULT.text = (input1.text.toString().toDouble() / input2.text.toString().toDouble()).toString()
        }

    }
}
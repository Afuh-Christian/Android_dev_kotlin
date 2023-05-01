package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSkill = findViewById<Button>(R.id.btnSkill)
        val btnWork = findViewById<Button>(R.id.btnWork)
        val btnEducation = findViewById<Button>(R.id.btnEducation)
        val  btnArchievment = findViewById<Button>(R.id.btnArchievment)

        btnSkill.setOnClickListener {
            intent = Intent(
                this,
                SkillsActivity::class.java
            )
            startActivity(intent)
        }

        btnEducation.setOnClickListener {
            intent = Intent(
                this,
                EducationActivity::class.java
            )
            startActivity(intent)
        }
        btnWork.setOnClickListener {
            intent = Intent(
                this,
                WorkActivity::class.java
            )
            startActivity(intent)
        }
        btnArchievment.setOnClickListener {
            intent = Intent(
                this,
                ArchievmentActivity::class.java
            )
            startActivity(intent)
        }



























    }


}
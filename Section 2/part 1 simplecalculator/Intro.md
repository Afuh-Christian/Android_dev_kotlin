# 02:15:59.257 

# Step 1 xml -----------------------------------------------------------------------------------------------------------------------





# step 2 ...... apply plugin to get id without using getViewbyId() -------------------------------------------------------------------------------------

# Gradle/gradle.build(Module.app)


dependencies {

    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
# -------------------
    apply plugin: 'kotlin-android-extensions'
# -------------------

}



# Now .... we are importing <the 'input1 id from 'kotlinx.android.synthetic.main.activity_main.input1>

import kotlinx.android.synthetic.main.activity_main.input1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val input1 = input1

    }
}


# .... NB ... use the old view binding method ... this one is outDated


































































# Step 3 .... xml  ----------------------------------------------------------------------------------------------------------------------- 


<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    >


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="20dp">

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"

            >

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/inputONE"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="hint"
                android:textSize="25dp" />
        </com.google.android.material.textfield.TextInputLayout>

        <com.google.android.material.textfield.TextInputLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:paddingTop="20dp">

            <com.google.android.material.textfield.TextInputEditText
                android:id="@+id/inputTWO"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="hint"
                android:textSize="25dp" />
        </com.google.android.material.textfield.TextInputLayout>

        <TextView
            android:id="@+id/tvRESULT"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:paddingTop="20dp"
            android:text="TextView"
            android:textSize="25dp"

            />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="50dp"
        >


        <Button
            android:id="@+id/btnSUM"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="10dp"
            android:text="SUM" />

        <Button
            android:id="@+id/btnSUBTRACT"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="10dp"
            android:text="SUBTRACT" />
    </LinearLayout>



    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">


        <Button
            android:id="@+id/btnMULTIPLY"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="10dp"
            android:text="MULTIPLY" />

        <Button
            android:id="@+id/btnDIVIDE"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_margin="10dp"
            android:text="DIVIDE" />
    </LinearLayout>


</androidx.appcompat.widget.LinearLayoutCompat>










# Step 3 .... kt  ----------------------------------------------------------------------------------------------------------------------- 

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

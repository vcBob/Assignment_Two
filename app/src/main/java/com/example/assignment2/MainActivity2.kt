package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        //==========================================================================================
        // The code below calls all the id names of the components from the activity_main2.xml folder over to the MainActivity2.kt
        val txtQuestion2 = findViewById<TextView>(R.id.txt_Question2)
        val txtHistQuestion = findViewById<TextView>(R.id.txt_HistQuestion2)
        val txtFeedback = findViewById<TextView>(R.id.txt_Feedback)
        val btnTrue = findViewById<Button>(R.id.btn_True)
        val btnFalse = findViewById<TextView>(R.id.btn_False)
        val btnNext = findViewById<TextView>(R.id.btn_Next)
        //==========================================================================================

    }
}
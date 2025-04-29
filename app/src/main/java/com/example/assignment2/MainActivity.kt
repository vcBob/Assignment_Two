package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //==========================================================================================
        //Calling all textview and button components from the front end code of the main activity.
        //Calling components allows the program to know what the components being used are and where the components being used are found.

        val txtTo = findViewById<TextView>(R.id.txt_To)
        val txtWelcome = findViewById<TextView>(R.id.txt_Welcome)
        val txtHistory = findViewById<TextView>(R.id.txt_History)
        val txtQuestion = findViewById<TextView>(R.id.txt_Question)
        val btnContinue = findViewById<Button>(R.id.btn_Continue)

        //==========================================================================================




       

    }
}
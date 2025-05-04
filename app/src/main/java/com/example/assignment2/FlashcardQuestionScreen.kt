package com.example.assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.flashcard_question_screen)
        //==========================================================================================
        // The code below calls all the id names of the components from the flashcard_question_screen.xml.xml folder over to the MainActivity2FlashcardQuestionScreen.kt
        val txtQuestion2 = findViewById<TextView>(R.id.txt_Question2)
        val txtHistQuestion = findViewById<TextView>(R.id.txt_HistQuestion2)
        val txtFeedback = findViewById<TextView>(R.id.txt_Feedback)
        val btnTrue = findViewById<Button>(R.id.btn_True)
        val btnFalse = findViewById<TextView>(R.id.btn_False)
        val btnNext = findViewById<TextView>(R.id.btn_Next)
        //==========================================================================================

        //==========================================================================================
        // 5 True or false history questions that whe user will be answering.
        val index = 0
        val arrQuestions = arrayOf<String>("The first electronic digital computer was primarily built for playing games.","Email existed in some form before the World Wide Web was invented.","The term \"computer bug\" originated from an actual insect causing a malfunction in an early computer.","The Apple Macintosh was the first personal computer to feature a graphical user interface and a mouse.","The programmingq language COBOL was initially developed for scientific and mathematical computations.")

        var count = 0
        txtHistQuestion.text = arrQuestions[count]

        btnNext.setOnClickListener{
            if (count == 4){
                val triviaPage = Intent(this,ScoreScreen::class.java)
                startActivity(triviaPage)
            }
            else{
                count++
                txtHistQuestion.text = arrQuestions[count]}
        }
    }
}
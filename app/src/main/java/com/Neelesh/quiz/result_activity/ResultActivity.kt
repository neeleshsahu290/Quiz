package com.Neelesh.quiz.result_activity

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.Neelesh.quiz.R
import com.Neelesh.quiz.constaints_data.Constaints
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    var nusername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        setContentView(R.layout.activity_result)

        nusername = sharedPreferences.getString("Title", "Name") as String

        //val username =intent.getStringExtra(Constaints.User_name)
        txtname.text = nusername

        val totalquestions = intent.getIntExtra(Constaints.total_question,0)
        val correetoptions = intent.getIntExtra(Constaints.correct_answers,0)
        txtscore.text = "your score is $correetoptions out of $totalquestions"

        val btnfinish : Button = findViewById(R.id.btnfinish)
        btnfinish.setOnClickListener(){
            onBackPressed()
            finish()
        }
    }
}
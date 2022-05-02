package com.Neelesh.quiz.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.Neelesh.quiz.R

class AboutappActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutapp)
        title="About App"
    }
}
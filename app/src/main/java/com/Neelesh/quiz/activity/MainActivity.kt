package com.Neelesh.quiz.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.Neelesh.quiz.constaints_data.Constaints
import com.Neelesh.quiz.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var Button: Button
    lateinit var edittextname : EditText
    lateinit var sharedPreferences: SharedPreferences
    var nusername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        val isloggedin =sharedPreferences.getBoolean("isloggedin",false)

        setContentView(R.layout.activity_main)

        nusername = intent.getStringExtra(Constaints.User_name)


        if (isloggedin){
            val intent=Intent(this,FirstPageActivity::class.java)
            startActivity(intent)
            finish()
        }

        Button = findViewById(R.id.btnstart)
        Button.setOnClickListener(){
            if (edttxtname.text.toString().isEmpty()){
                Toast.makeText(this@MainActivity,"enter name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, FirstPageActivity::class.java)

                //intent.putExtra(Constaints.User_name,edttxtname.text.toString())
                savepreferences(edttxtname.text.toString())
                startActivity(intent)
                finish()
            }
        }


        }
    fun savepreferences (user:String){
        sharedPreferences.edit().putBoolean("isloggedin",true).apply()
        sharedPreferences.edit().putString("Title",user).apply()
    }

    }

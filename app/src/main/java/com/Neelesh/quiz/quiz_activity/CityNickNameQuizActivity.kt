package com.Neelesh.quiz.quiz_activity

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.Neelesh.quiz.R
import com.Neelesh.quiz.constaints_data.CentralBankObject
import com.Neelesh.quiz.constaints_data.CityNicknameObject
import com.Neelesh.quiz.constaints_data.Constaints
import com.Neelesh.quiz.data_class.Question
import com.Neelesh.quiz.result_activity.ResultActivity
import kotlinx.android.synthetic.main.activity_quiz_question.*

class CityNickNameQuizActivity : AppCompatActivity() , View.OnClickListener{
    var mCurrentposition:Int =1
    var mquestionlist : ArrayList<Question>? = null
    var mselectedoptionposition : Int = 0
    var mcorrectanswer: Int = 0
    var musername : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        title="Quiz"


        musername = intent.getStringExtra(Constaints.User_name)

        mquestionlist = CityNicknameObject .getQuestions()
        setQuestion()
        txtoptionone.setOnClickListener (this)
        txtoptiontwo.setOnClickListener(this)
        txtoptionthree.setOnClickListener(this)
        txtoptionfour.setOnClickListener(this)
        btnsubmit.setOnClickListener(this)
    }
    fun setQuestion(){


        val question = mquestionlist!![mCurrentposition-1]
        defaultoptionsview()

        if (mCurrentposition==mquestionlist!!.size){
            btnsubmit.text = "Finish"
        }else{
            btnsubmit.text="Submit"
        }


        progressbar.progress = mCurrentposition
        progressbar.max = 8
        tv_progress.text = "$mCurrentposition"+ "/"+ mquestionlist!!.size
        tv_question.text= question!!.Question
        txtoptionone.text= question.Optionone
        txtoptiontwo.text= question.Optiontwo
        txtoptionthree.text= question.OPtionthree
        txtoptionfour.text=question.OPtionfour
    }
    fun defaultoptionsview(){
        val options = ArrayList<TextView>()
        options.add(0,txtoptionone)
        options.add(1,txtoptiontwo)
        options.add(2,txtoptionthree)
        options.add(3,txtoptionfour)
        for (option in options){
            option.setTextColor(Color.parseColor("#7A8686"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.txtoptionone ->{
                selectedoptionview(txtoptionone,1)
            }
            R.id.txtoptiontwo ->{
                selectedoptionview(txtoptiontwo,2)
            }
            R.id.txtoptionthree ->{
                selectedoptionview(txtoptionthree,3)
            }
            R.id.txtoptionfour ->{
                selectedoptionview(txtoptionfour,4)
            }
            R.id.btnsubmit ->{
                if (mselectedoptionposition==0){
                    mCurrentposition++
                    when{
                        mCurrentposition<=mquestionlist!!.size->{
                            setQuestion()
                        }else->{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constaints.User_name,musername)
                        intent.putExtra(Constaints.correct_answers,mcorrectanswer)
                        intent.putExtra(Constaints.total_question,mquestionlist!!.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val question= mquestionlist?.get(mCurrentposition-1)
                    if (question!!.Correctoption != mselectedoptionposition){
                        answerview(mselectedoptionposition,
                            R.drawable.wrong_option_border_bg
                        )
                    }
                    else{
                        mcorrectanswer++
                    }
                    answerview(question.Correctoption,
                        R.drawable.correct_option_border_bg
                    )

                    if (mCurrentposition==mquestionlist!!.size){
                        btnsubmit.text = "Finish"
                    }else{
                        btnsubmit.text="Go to Next Question"
                    }
                    mselectedoptionposition = 0
                }

            }
        }

    }
    fun selectedoptionview(txt: TextView, selectedoptionNum : Int){
        defaultoptionsview()
        mselectedoptionposition= selectedoptionNum
        txt.setTextColor(Color.parseColor("#363A43"))
        txt.setTypeface(txt.typeface, Typeface.BOLD)
        txt.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg
        )
    }
    fun answerview(answer:Int,drawableview:Int){
        when(answer){
            1->{
                txtoptionone.background= ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            2->{
                txtoptiontwo.background= ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            3->{
                txtoptionthree.background= ContextCompat.getDrawable(
                    this,drawableview
                )
            }
            4->{
                txtoptionfour.background= ContextCompat.getDrawable(
                    this,drawableview
                )
            }
        }
    }
}
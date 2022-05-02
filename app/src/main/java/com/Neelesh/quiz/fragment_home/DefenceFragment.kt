package com.Neelesh.quiz.fragment_home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.list_package.*
import com.Neelesh.quiz.quiz_activity.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class DefenceFragment : Fragment() {

    lateinit var drdolablist:TextView
    lateinit var militaryexerciselist:TextView
    lateinit var airchiefmarshallist:TextView
    lateinit var navyadrinalslist:TextView

    lateinit var drdolabquiz:TextView
    lateinit var militaryexercisequiz:TextView
    lateinit var airchiefmarshalquiz:TextView
    lateinit var navyadrinalsquiz:TextView


    private lateinit var mInterstitialAd: InterstitialAd
    private lateinit var InterstitialAd1: InterstitialAd
    private lateinit var InterstitialAd2: InterstitialAd
    private lateinit var InterstitialAd3: InterstitialAd
    private lateinit var InterstitialAd4: InterstitialAd


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_defence, container, false)

        //ads content start
        MobileAds.initialize(this.context)
        mInterstitialAd = InterstitialAd(this.context)
        mInterstitialAd.adUnitId = "ca-app-pub-1517849940912635/7238197396"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        InterstitialAd1 = InterstitialAd(this.context)
        InterstitialAd1.adUnitId = "ca-app-pub-1517849940912635/2729332475"
        InterstitialAd1.loadAd(AdRequest.Builder().build())


        InterstitialAd2= InterstitialAd(this.context)
        InterstitialAd2.adUnitId = "ca-app-pub-1517849940912635/8599115564"
        InterstitialAd2.loadAd(AdRequest.Builder().build())

        InterstitialAd3 = InterstitialAd(this.context)
        InterstitialAd3.adUnitId = "ca-app-pub-1517849940912635/3718980519"
        InterstitialAd3.loadAd(AdRequest.Builder().build())

        InterstitialAd4 = InterstitialAd(this.context)
        InterstitialAd4.adUnitId = "ca-app-pub-1517849940912635/9190142509"
        InterstitialAd4.loadAd(AdRequest.Builder().build())
        //asdcontent finish
        //(activity as FrontPageActivity).supportActionBar?.title="Defence"

        drdolablist=view.findViewById(R.id.txtdrdolablist)
        militaryexerciselist=view.findViewById(R.id.txtmilitaryexerciselist)
        airchiefmarshallist=view.findViewById(R.id.txtairchifmarshallist)
        navyadrinalslist=view.findViewById(R.id.txtnavyadrinalslist)

        drdolabquiz=view.findViewById(R.id.txtdrdolabQuiz)
        militaryexercisequiz=view.findViewById(R.id.txtmilitaryexerciseQuiz)
        airchiefmarshalquiz=view.findViewById(R.id.txtairchifmarshalQuiz)
        navyadrinalsquiz=view.findViewById(R.id.txtnavyadrinalsQuiz)

        drdolablist.setOnClickListener {
            val intent = Intent(this.context, DrdoLabourititesListActivity::class.java)
            startActivity(intent)
        }
        militaryexerciselist.setOnClickListener {
            val intent = Intent(this.context, MilitaryExerciseActivity::class.java)
            startActivity(intent)
        }
        airchiefmarshallist.setOnClickListener {
            val intent = Intent(this.context, AirChirfMarshalActivity::class.java)
            startActivity(intent)
        }
        navyadrinalslist.setOnClickListener {
            val intent = Intent(this.context, NavyAdrinalActivity::class.java)
            startActivity(intent)
        }

        drdolabquiz.setOnClickListener() {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), DrdoLabouratriesQuizActivity::class.java)
                startActivity(intent)
            }
        }
        militaryexercisequiz.setOnClickListener() {
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), MilitaryExerciseQuizActivity::class.java)
                startActivity(intent)
            }
        }
        airchiefmarshalquiz.setOnClickListener() {
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity(), AirchiesMarshalQuizActivity::class.java)
                startActivity(intent)
            }
        }
        navyadrinalsquiz.setOnClickListener() {
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {

                val intent = Intent(getActivity(), NavyAdrinalQuizActivity::class.java)
                startActivity(intent)
            }
        }

        return view
    }


}
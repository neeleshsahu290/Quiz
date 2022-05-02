package com.Neelesh.quiz.fragment_home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.constaints_data.Constaints
import com.Neelesh.quiz.list_package.*
import com.Neelesh.quiz.quiz_activity.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class EnviourmentFragment : Fragment() {
    lateinit var himalayanpeaklist: TextView
    lateinit var nationalparklist: TextView
    lateinit var birdSanturiylist: TextView
    lateinit var tigerreservelist: TextView
    lateinit var waterfallslist: TextView

    lateinit var himalayanpeakQuiz: TextView
    lateinit var nationalparkQuiz: TextView
    lateinit var birdSanturiyQuiz: TextView
    lateinit var tigerreserveQuiz: TextView
    lateinit var waterfallsQuiz: TextView
    var nusername : String? = null
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
        val view = inflater.inflate(R.layout.fragment_enviourment, container, false)


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
       // (activity as FrontPageActivity).supportActionBar?.title="Enviournment"

        himalayanpeaklist=view.findViewById(R.id.txthimalyanpeaklist)
        nationalparklist=view.findViewById(R.id.txtnationalparklist)
        birdSanturiylist= view.findViewById(R.id.txtbirdsanturylist)
        tigerreservelist=view.findViewById(R.id.txttigerreserveslist)
        waterfallslist=view.findViewById(R.id.txtwaterfalllist)

        himalayanpeakQuiz=view.findViewById(R.id.txthimalayanpeakQuiz)
        nationalparkQuiz=view.findViewById(R.id.txtnationalparkQuiz)
        birdSanturiyQuiz= view.findViewById(R.id.txtbirdsanturyQuiz )
        tigerreserveQuiz=view.findViewById(R.id.txttigerreservesQuiz)
        waterfallsQuiz=view.findViewById(R.id.txtwaterfallQuiz)

        himalayanpeaklist.setOnClickListener {
            val intent = Intent(getActivity(), HimalyanPeakActivity::class.java)
            startActivity(intent)
        }
        nationalparklist.setOnClickListener (){
            val intent = Intent(getActivity(), NationalParkActivity::class.java)
            startActivity(intent)
        }
        birdSanturiylist.setOnClickListener (){
            val intent = Intent(getActivity(), BirdSanturiesActivity::class.java)
            startActivity(intent)
        }
        tigerreservelist.setOnClickListener (){
            val intent = Intent(getActivity(), TigerReservesActivity::class.java)
            startActivity(intent)
        }
        waterfallslist.setOnClickListener (){
            val intent = Intent(getActivity(), WaterfallsActivity::class.java)
            startActivity(intent)
        }

        himalayanpeakQuiz.setOnClickListener (){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), HimalayanPeakQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        nationalparkQuiz.setOnClickListener (){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), NationalParkQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        birdSanturiyQuiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity(), BirdSanctuaryQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        tigerreserveQuiz.setOnClickListener {
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {

                val intent = Intent(getActivity(), TigerReservesQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        waterfallsQuiz.setOnClickListener {
            if (InterstitialAd4.isLoaded) {
                InterstitialAd4.show()
            } else {

                val intent = Intent(getActivity(), WaterFallQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }

        return view
    }

}
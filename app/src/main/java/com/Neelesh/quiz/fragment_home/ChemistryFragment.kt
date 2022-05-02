package com.Neelesh.quiz.fragment_home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.Neelesh.quiz.R
import com.Neelesh.quiz.generalscience.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class ChemistryFragment : Fragment() {



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
        val view= inflater.inflate(R.layout.fragment_chemistry, container, false)

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

        val elementorelist=view.findViewById(R.id.txtelementorelist) as TextView
        val compoundalloylist=view.findViewById(R.id.txtelCompoundalloylist) as TextView
        val elementlist=view.findViewById(R.id.txelementlist) as TextView
        val elementorequiz=view.findViewById(R.id.txtelementoreQuiz) as TextView
        val compoundalloyquiz=view.findViewById(R.id.txtcompoundalloyQuiz) as TextView
        val elementQuiz=view.findViewById(R.id.txtelementQuiz) as TextView
        elementorelist.setOnClickListener (){
          //  val intent = Intent(getActivity(), ElementOresActivity::class.java)
          //  startActivity(intent)
            findNavController().navigate(R.id.action_chemistryFragment_to_elementOresActivity)
        }
        compoundalloylist.setOnClickListener(){
          //  val intent = Intent(getActivity(), AlloysActivity::class.java)
           // startActivity(intent)
            findNavController().navigate(R.id.action_chemistryFragment_to_alloysActivity)

        }
        elementlist.setOnClickListener {
            // val intent = Intent(getActivity(), ElementActivity::class.java)
            // startActivity(intent)
            findNavController().navigate(R.id.action_chemistryFragment_to_elementActivity)

        }
        elementorequiz.setOnClickListener() {
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {
               // val intent = Intent(getActivity(), ElementOresQuizActivity::class.java)
               // startActivity(intent)
                findNavController().navigate(R.id.action_chemistryFragment_to_elementOresQuizActivity)

            }
        }
        compoundalloyquiz.setOnClickListener() {
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {
               // val intent = Intent(getActivity(), AlloysQuizActivity::class.java)
               // startActivity(intent)
                findNavController().navigate(R.id.action_chemistryFragment_to_alloysQuizActivity)
            }
        }



        return view
    }


}
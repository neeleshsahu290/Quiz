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
import com.Neelesh.quiz.list_package.NutrientandDeficiencyDiciesesActivity
import com.Neelesh.quiz.quiz_activity.NutrientSourcesQuizActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class BiologyFragment : Fragment() {

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
        val view= inflater.inflate(R.layout.fragment_biology, container, false)

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

        val nutrientsourceslist=view.findViewById(R.id.txtnutrientsourcelist) as TextView
        val nutrientsourcesquiz=view.findViewById(R.id.txtnutrientsourceQuiz) as TextView

        nutrientsourceslist.setOnClickListener (){
           // val intent = Intent(getActivity(), NutrientandDeficiencyDiciesesActivity::class.java)
           // startActivity(intent)
            findNavController().navigate(R.id.action_biologyFragment_to_nutrientandDeficiencyDiciesesActivity)
        }

        nutrientsourcesquiz.setOnClickListener() {
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {
               // val intent = Intent(getActivity(), NutrientSourcesQuizActivity::class.java)
                //startActivity(intent)
                findNavController().navigate(R.id.action_biologyFragment_to_nutrientSourcesQuizActivity)
            }
        }



        return view
    }


}
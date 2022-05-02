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
import com.Neelesh.quiz.list_package.CityFounderActivity
import com.Neelesh.quiz.list_package.PalacesinIndiaActivity
import com.Neelesh.quiz.quiz_activity.CityFounderQuizActivity
import com.Neelesh.quiz.quiz_activity.PalaceIndiaActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class HIstoryFragment : Fragment() {

    lateinit var cityfounderlist:TextView
    lateinit var palacelist : TextView

    lateinit var cityfounderquiz:TextView
    lateinit var palacequiz : TextView

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
        val view= inflater.inflate(R.layout.fragment_h_istory, container, false)

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
        //(activity as FrontPageActivity).supportActionBar?.title="History"

        palacelist=view.findViewById(R.id.txtpalacelist)
        cityfounderlist=view.findViewById(R.id.txtcityfounderlist)

        palacequiz=view.findViewById(R.id.txtpalaceQuiz)
        cityfounderquiz=view.findViewById(R.id.txtCityfounderQuiz)

        palacelist.setOnClickListener (){
            val intent = Intent(getActivity(), PalacesinIndiaActivity::class.java)
            startActivity(intent)
        }

        cityfounderlist.setOnClickListener (){
            val intent = Intent(getActivity(), CityFounderActivity::class.java)
            startActivity(intent)
        }


        palacequiz.setOnClickListener(){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), PalaceIndiaActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }

        cityfounderquiz.setOnClickListener(){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), CityFounderQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }

        return view
    }


}
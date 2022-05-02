package com.Neelesh.quiz.fragment_home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.list_package.SpaceCentrelistActivity
import com.Neelesh.quiz.quiz_activity.SpaceCentreQuizActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds

class SpaceFragment : Fragment() {
    lateinit var spacecentrelist:TextView

    lateinit var spacecentrequiz:TextView

    private lateinit var mInterstitialAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_space, container, false)

        //ads content start
        MobileAds.initialize(this.context)
        mInterstitialAd = InterstitialAd(this.context)
        mInterstitialAd.adUnitId = "ca-app-pub-1517849940912635/7238197396"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        //asdcontent finish
        //(activity as FrontPageActivity).supportActionBar?.title="Space"


        spacecentrelist = view.findViewById(R.id.txtspacecentrelist)

        spacecentrequiz= view.findViewById(R.id.txtspacecentreQuiz)

        spacecentrelist.setOnClickListener {
            val intent = Intent(this.context, SpaceCentrelistActivity::class.java)
            startActivity(intent)
        }

        spacecentrequiz.setOnClickListener() {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), SpaceCentreQuizActivity::class.java)
                startActivity(intent)
            }
        }

        return view

    }


}
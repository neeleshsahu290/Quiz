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


class IndiaFragment : Fragment() {

    lateinit var statecapitallist : TextView
    lateinit var stateLanguageList : TextView
    lateinit var nicknamecitylist: TextView
    lateinit var fatheroffieldslist:TextView
    lateinit var firstmaleindialist:TextView
    lateinit var firstfemaleindialist:TextView
    lateinit var attonygenerallist:TextView
    lateinit var cbidirectorlist:TextView
    lateinit var chiefjusticelist:TextView
    lateinit var auditorlist:TextView

    lateinit var statecapitaQuiz : TextView
    lateinit var stateLanguageQuiz : TextView
    lateinit var nicknamecityQuiz: TextView
    lateinit var fatheroffieldsquiz:TextView
    lateinit var firstmaleindiaquiz:TextView
    lateinit var firstfemaleindiaquiz:TextView
    lateinit var attonygeneralQuiz:TextView
    lateinit var cbidirectorquiz:TextView
    lateinit var chiefjusticequiz:TextView
    lateinit var auditorquiz:TextView

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
        val view = inflater.inflate(R.layout.fragment_india, container, false)

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
      //  (activity as FrontPageActivity).supportActionBar?.title="India"

        statecapitallist=view.findViewById(R.id.txtStateCapitalList)
        stateLanguageList = view.findViewById(R.id.txtStateLanguageList)
        nicknamecitylist=view.findViewById(R.id.txtcitynicknamelist)
        fatheroffieldslist=view.findViewById(R.id.txtfatherfieldslist)
        firstmaleindialist=view.findViewById(R.id.txtfirstmaleindialist)
        firstfemaleindialist=view.findViewById(R.id.txtfirstfemaleindialist)
        attonygenerallist=view.findViewById(R.id.txtattonygenerallist)
        cbidirectorlist=view.findViewById(R.id.txtcbidirectorlist)
        chiefjusticelist=view.findViewById(R.id.txtchifjusticelist)
        auditorlist=view.findViewById(R.id.txtcomptrollerAuditorlist)


        statecapitaQuiz=view.findViewById(R.id.txtStateCapitalQuiz)
        stateLanguageQuiz = view.findViewById(R.id.txtStateLanguageQuiz)
        nicknamecityQuiz=view.findViewById(R.id.txtcitynicknameQuiz)
        fatheroffieldsquiz=view.findViewById(R.id.txtfatherfieldsQuiz)
        firstmaleindiaquiz=view.findViewById(R.id.txtfirstmaleindiaQuiz)
        firstfemaleindiaquiz=view.findViewById(R.id.txtfirstfemaleindiaQuiz)
        attonygeneralQuiz=view.findViewById(R.id.txtattonygeneralQuiz)
        cbidirectorquiz=view.findViewById(R.id.txtcbidirectorQuiz)
        chiefjusticequiz=view.findViewById(R.id.txtchifjusticeQuiz)
        auditorquiz=view.findViewById(R.id.txtcomptrollerAuditorQuiz)

        statecapitallist.setOnClickListener(){
            val intent = Intent( getActivity(), State_Capital_list_Activity::class.java)
            startActivity(intent)
        }
        stateLanguageList.setOnClickListener(){
            val intent= Intent( getActivity(), StateLanguageListActivity::class.java)
            startActivity(intent)
        }
        nicknamecitylist.setOnClickListener (){
            val intent = Intent( getActivity(), CityNicknameActivity::class.java)
            startActivity(intent)
        }
        fatheroffieldslist.setOnClickListener (){
            val intent = Intent( getActivity(), FatheroffieldsListActivity::class.java)
            startActivity(intent)
        }
        firstmaleindialist.setOnClickListener (){
            val intent = Intent( getActivity(), FirstinMaleActivity::class.java)
            startActivity(intent)
        }
        firstfemaleindialist.setOnClickListener (){
            val intent = Intent( getActivity(), FirstinwomenActivity::class.java)
            startActivity(intent)
        }
        attonygenerallist.setOnClickListener (){
            val intent = Intent( getActivity(), AtonyGeneralActivity::class.java)
            startActivity(intent)
        }
        cbidirectorlist.setOnClickListener (){
            val intent = Intent( getActivity(), CbiDirectorActivity::class.java)
            startActivity(intent)
        }
        chiefjusticelist.setOnClickListener (){
            val intent = Intent( getActivity(), ChifjusticeActivity::class.java)
            startActivity(intent)
        }
        auditorlist.setOnClickListener (){
            val intent = Intent( getActivity(), AuditorGeneralActivity::class.java)
            startActivity(intent)
        }


        statecapitaQuiz.setOnClickListener(){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                val intent = Intent(getActivity(), State_Capital_Quiz_Activity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        stateLanguageQuiz.setOnClickListener(){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), SecondActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        nicknamecityQuiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity(), CityNickNameQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        fatheroffieldsquiz.setOnClickListener (){
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {

                val intent = Intent(getActivity(), FatherfieldquizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        firstmaleindiaquiz.setOnClickListener (){
            if (InterstitialAd4.isLoaded) {
                InterstitialAd4.show()
            } else {

                val intent = Intent(getActivity(), FirstMalequizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        firstfemaleindiaquiz.setOnClickListener (){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), FirstFemaleQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        attonygeneralQuiz.setOnClickListener (){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), AtornyGeneralQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        cbidirectorquiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity(), CbiDirectorQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        chiefjusticequiz.setOnClickListener (){
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {

                val intent = Intent(getActivity(), ChifJusticeQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        auditorquiz.setOnClickListener (){
            if (InterstitialAd4.isLoaded) {
                InterstitialAd4.show()
            } else {

                val intent = Intent(getActivity(), ComptrollerAuditorQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }

        return view
    }

    
}
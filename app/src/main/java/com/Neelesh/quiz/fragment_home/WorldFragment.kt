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
import com.Neelesh.quiz.constaints_data.Constaints
import com.Neelesh.quiz.list_package.*
import com.Neelesh.quiz.quiz_activity.*
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_result.*

class WorldFragment : Fragment() {
    lateinit var countrycapitalcurrencylist : TextView
    lateinit var centralbanklist: TextView
    lateinit var famousnewspaperlist: TextView
    lateinit var internationalorganisationslist: TextView
    lateinit var foodfestivallist:TextView
    lateinit var countyparliamentlist:TextView

    lateinit var countrycapitalcurrencyquiz : TextView
    lateinit var centralbankquiz: TextView
    lateinit var famousnewspaperquiz: TextView
    lateinit var internationalorganisationsquiz: TextView
    lateinit var foodfestivalquiz:TextView
    lateinit var countyparliamentquiz:TextView

    var nusername : String? = null
    private lateinit var mInterstitialAd: InterstitialAd
    private lateinit var InterstitialAd1: InterstitialAd
    private lateinit var InterstitialAd2: InterstitialAd
    private lateinit var InterstitialAd3: InterstitialAd
    private lateinit var InterstitialAd4: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_world, container, false)


        //ads content start
        MobileAds.initialize(this@WorldFragment.context)
        mInterstitialAd = InterstitialAd(this@WorldFragment.context)
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
        //(activity as FrontPageActivity).supportActionBar?.title="World"

        countrycapitalcurrencylist=view.findViewById(R.id.txtCountryCapitalCurrencyist)
        centralbanklist=view.findViewById(R.id.txtcentralbanklist)
        famousnewspaperlist=view.findViewById(R.id.txtnewspaperlist)
        internationalorganisationslist=view.findViewById(R.id.txtInternationalOrganizationslist)
        foodfestivallist=view.findViewById(R.id.txtfoodfestivallist)
        countyparliamentlist=view.findViewById(R.id.txtcountryparliamentlist)

        countrycapitalcurrencyquiz=view.findViewById(R.id.txtCountryCapitalCurrencyQuiz)
        centralbankquiz=view.findViewById(R.id.txtcentralbankQuiz)
        famousnewspaperquiz=view.findViewById(R.id.txtnewspaperQuiz)
        internationalorganisationsquiz=view.findViewById(R.id.txtInternationalOrganizationsQuiz)
        foodfestivalquiz=view.findViewById(R.id.txtfoodfestivalQuiz)
        countyparliamentquiz=view.findViewById(R.id.txtcountyparliamentQuiz)

        countrycapitalcurrencylist.setOnClickListener() {
            val intent = Intent(getActivity(), Country_Capital_Currency_List_Activity::class.java)
           startActivity(intent)
          //  findNavController().navigate(R.id.action_worldFragment_to_countryCentralBankActivity)

        }
        centralbanklist.setOnClickListener {
          //  val intent = Intent(getActivity(), CountryCentralBankActivity::class.java)
          //  startActivity(intent)
            findNavController().navigate(R.id.action_worldFragment_to_countryCentralBankActivity)
        }
        famousnewspaperlist.setOnClickListener (){
            //val intent = Intent(getActivity(), NewspapersActivity::class.java)
            //startActivity(intent)
            findNavController().navigate(R.id.action_worldFragment_to_newspapersActivity)
        }
        internationalorganisationslist.setOnClickListener (){
            //val intent = Intent(getActivity(), InternationalOrganizationsActivity::class.java)
            //startActivity(intent)
            findNavController().navigate(R.id.action_worldFragment_to_internationalOrganizationsActivity)
        }
        foodfestivallist.setOnClickListener (){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

              //  val intent = Intent(this.context, FoodFestivleActivity::class.java)
              //  startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_foodFestivleActivity)

            }
        }
        countyparliamentlist.setOnClickListener (){
           // val intent = Intent(getActivity(), CountryParlimantrylistActivity::class.java)
          //  startActivity(intent)
            findNavController().navigate(R.id.action_worldFragment_to_countryParlimantrylistActivity)
        }




        countrycapitalcurrencyquiz.setOnClickListener (){

            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
              //  val intent = Intent(getActivity(), CountryCapitalCurrencyQuizActivity::class.java)
                //intent.putExtra(Constaints.User_name,nusername)
                //startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_countryCapitalCurrencyQuizActivity)

            }
        }
        centralbankquiz.setOnClickListener(){

            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

               // val intent = Intent(getActivity(), CentralBankActivity::class.java)
               // intent.putExtra(Constaints.User_name,nusername)
               // startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_centralBankActivity)

            }


        }
        famousnewspaperquiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {
               // val intent = Intent(getActivity(), FamousNewsPaperQuizActivity::class.java)
              //  intent.putExtra(Constaints.User_name,nusername)
               // startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_famousNewsPaperQuizActivity)
            }


        }
        internationalorganisationsquiz.setOnClickListener (){
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {

              //  val intent = Intent(getActivity(), InternationalOrganisationsQuizActivity::class.java)
               // intent.putExtra(Constaints.User_name,nusername)
               // startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_internationalOrganisationsQuizActivity)
            }


        }
        foodfestivalquiz.setOnClickListener() {
            if (InterstitialAd4.isLoaded) {
                InterstitialAd4.show()
            } else {

            //    val intent = Intent(getActivity(), FoodfestivalQuizActivity::class.java)
           //     startActivity(intent)
                findNavController().navigate(R.id.action_worldFragment_to_foodfestivalQuizActivity)
            }
        }
        countyparliamentquiz.setOnClickListener() {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

               // val intent = Intent(getActivity(), CountryParliamentQuizActivity::class.java)
                //startActivity(intent)

                findNavController().navigate(R.id.action_worldFragment_to_countryParliamentQuizActivity)
            }
        }

        return view
    }
}
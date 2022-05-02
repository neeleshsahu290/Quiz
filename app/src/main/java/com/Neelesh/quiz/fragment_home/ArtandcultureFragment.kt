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
import kotlinx.android.synthetic.main.app_bar_main.*


class ArtandcultureFragment : Fragment() {



    var nusername : String? = null
   // private lateinit var mInterstitialAd: InterstitialAd
    //private lateinit var InterstitialAd1: InterstitialAd
    //private lateinit var InterstitialAd2: InterstitialAd

   // private lateinit var InterstitialAd3: InterstitialAd




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            //nusername = bundleOf(.getString(Constaints.User_name))


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_artandculture, container, false)



        //ads content start
        MobileAds.initialize(this.context)
        val mInterstitialAd = InterstitialAd(this.context)
        mInterstitialAd.adUnitId = "ca-app-pub-1517849940912635/7238197396"
        mInterstitialAd.loadAd(AdRequest.Builder().build())


        val InterstitialAd1 = InterstitialAd(this.context)
        InterstitialAd1.adUnitId = "ca-app-pub-1517849940912635/2729332475"
        InterstitialAd1.loadAd(AdRequest.Builder().build())


        val InterstitialAd2= InterstitialAd(this.context)
        InterstitialAd2.adUnitId = "ca-app-pub-1517849940912635/8599115564"
        InterstitialAd2.loadAd(AdRequest.Builder().build())

        val InterstitialAd3 = InterstitialAd(this.context)
        InterstitialAd3.adUnitId = "ca-app-pub-1517849940912635/3718980519"
        InterstitialAd3.loadAd(AdRequest.Builder().build())
        //asdcontent finish
        //(activity as FrontPageActivity).supportActionBar?.title="Art and Culture"

        val damlist=view.findViewById(R.id.txtdamsist) as TextView
        val rivercitylist=view.findViewById(R.id.txtrivercitylist) as TextView
        val danceformslist=view.findViewById(R.id.txtdanceformslist) as TextView
        val bookauthorlist=view.findViewById(R.id.txtbookauthorlist) as TextView
        val famoustemplelist=view.findViewById(R.id.txtfamoustemplelist) as TextView
        val revolutionindialist=view.findViewById(R.id.txtrevolutionindialist) as TextView
        val superlativelist=view.findViewById(R.id.txtsuperlativelist) as TextView

        val damquiz=view.findViewById(R.id.txtdamsQuiz) as TextView
        val rivercityquiz=view.findViewById(R.id.txtrivercityQuiz) as TextView
        val danceformsquiz=view.findViewById(R.id.txtdanceformsQuiz) as TextView
        val bookauthorquiz=view.findViewById(R.id.txtbookauthorQuiz) as TextView
        val famoustemplequiz=view.findViewById(R.id.txtfamoustempleQuiz) as TextView
        val revolutionindiaquiz=view.findViewById(R.id.txtrevolutionindiaQuiz) as TextView
        val superlativequiz=view.findViewById(R.id.txtsuperlativeQuiz) as TextView

        damlist.setOnClickListener(){
            val intent = Intent(getActivity(), DamListActivity::class.java)
            startActivity(intent)
        }
        rivercitylist.setOnClickListener (){
        val intent = Intent(getActivity(), RiverSideCityActivity::class.java)
        startActivity(intent)
    }
        danceformslist.setOnClickListener (){
            val intent = Intent(getActivity(), DanceFormsActivity::class.java)
            startActivity(intent)
        }
        bookauthorlist.setOnClickListener (){
            val intent = Intent(getActivity(), BooksandAuthorsActivity::class.java)
            startActivity(intent)
        }
        famoustemplelist.setOnClickListener (){
            val intent = Intent(getActivity(), FamousTempleActivity::class.java)
            startActivity(intent)
        }
        revolutionindialist.setOnClickListener (){
            val intent = Intent(getActivity(), RevolutionsinindiaActivity::class.java)
            startActivity(intent)
        }
        superlativelist.setOnClickListener (){
            val intent = Intent(getActivity(), SuperlativesinindiaActivity::class.java)
            startActivity(intent)
        }


        damquiz.setOnClickListener (){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity(), DamsindiaQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }
        rivercityquiz.setOnClickListener(){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity(), RiverSideCityQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }
        danceformsquiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity(), DanceFormsQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }
        bookauthorquiz.setOnClickListener (){
            if (InterstitialAd3.isLoaded) {
                InterstitialAd3.show()
            } else {


                val intent = Intent(getActivity(), BookAuthorsQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }

        }
        famoustemplequiz.setOnClickListener (){
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {

                val intent = Intent(getActivity() ,FamousTempleQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }
        revolutionindiaquiz.setOnClickListener (){
            if (InterstitialAd1.isLoaded) {
                InterstitialAd1.show()
            } else {

                val intent = Intent(getActivity() ,RevolutionsIndiaQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }
        superlativequiz.setOnClickListener (){
            if (InterstitialAd2.isLoaded) {
                InterstitialAd2.show()
            } else {

                val intent = Intent(getActivity() ,SuperlativeIndiaQuizActivity::class.java)
                intent.putExtra(Constaints.User_name,nusername)
                startActivity(intent)
            }


        }

        return view
    }


}
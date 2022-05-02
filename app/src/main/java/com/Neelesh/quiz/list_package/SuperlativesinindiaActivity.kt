package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class SuperlativesinindiaActivity : AppCompatActivity() {

    lateinit var recyclerstatecapital : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofcountry = arrayListOf<State_Capital>(
        State_Capital("The longest Bridge Above Water" ,"Mahatma Gandhi Setu Patna (5.75 km.)"),
                State_Capital("The largest animal Fair" ,"Sonpur (Bihar)"),
                State_Capital("The largest Auditorium" ,"Sri Shanmukhananda Hall (Mumbai)"),
                State_Capital("The largest Lake" ,"Wular Lake (J & K)"),
    State_Capital("The highest Dam" ,"Tehri dam"),
    State_Capital("The largest Desert" ,"Thar (Rajastan)"),
    State_Capital("The largest cave Temple" ,"KailashNath Temple (Ellora, Maharashtra)"),
    State_Capital("The largest Zoo" ,"Vandalur Zoo (1300 Acres)"),
    State_Capital("The largest Mosque" ,"Jama Masjid (Delhi)"),
    State_Capital("The highest peak" ,"kangchenjunga"),
    State_Capital("The longest Tunnel" ,"Pir panjal tunnel"),
    State_Capital("The largest Delta" ,"Sundarbans (W. Bengal)"),
    State_Capital("The State with maximum forest area" ,"Madhya Pradesh"),
    State_Capital("The longest Corridor" ,"Corridor of Ramanathaswamy Temple of Rameswaram (Tamil Nadu)"),
    State_Capital("The highest Waterfall" ,"Kunchikal Falls (Karnataka)"),
    State_Capital("The longest Road" ,"Grand Trunk Road (Kolkatta to Delhi)"),
    State_Capital("The highest Gate way" ,"Buland Darwaza, Fatehpur Sikri (U.P)"),
    State_Capital("The longest River" ,"The Ganga (2640 km. long)"),
    State_Capital("The largest museum" ,"Indian museum, Kolkata"),
    State_Capital("The largest Dome" ,"Gol Gumbaz, Bijapur (in Karnataka)"),
    State_Capital("The Tallest Statue" ,"Statue of Unity, Sadhu Bet, Sardar Sarovar Dam, Gujarat (182 m)"),
        State_Capital("The largest Public sector Bank" ,"State Bank of India"),
    State_Capital("The Biggest Canti lever Bridge" ,"Rabindra Setu or Howrah Bridge (Kolkatta)"),
    State_Capital("The longest Canal" ,"Indira Gandhi Canal or Rajasthan Canal(Rajasthan)"),
    State_Capital("The longest Railway platform" ,"Gorakhpur, UP"),
    State_Capital("The Biggest Stadium" ,"Buddh International Circuit (Auto Racing), Yuva Bharti (Salt Lake) Stadium Kolkatta (foot ball)"),
    State_Capital("The most popular city" ,"Mumbai (Maharastra)"),
    State_Capital("The Longest Passenger Train Route" ,"Dibrugarh to Kanyakumari"),
    State_Capital("The Oldest Church" ,"St. Thomas Church at palayer, Thrissur (Kerela)"),
    State_Capital("The longest National Highway" ,"N.H-7 (Varanasi to Kanyakumari)"),
    State_Capital("The State with longest Coast Line" ,"Gujarat"),
    State_Capital("The Highest Lake" ,"Cholamu lake (north Sikim)"),
    State_Capital("The largest Saline water Lake" ,"Sambhar lake, Rajasthan"),
    State_Capital("The largest fresh water Lake" ,"wular Lake"),
    State_Capital("Largest Cave" ,"Amarnath(J & K)"),
    State_Capital("The longest river of Southern India" ,"Godawari"),
    State_Capital("The longest Dam" ,"Hirakud Dam (Orissa)"),
    State_Capital("The highest Gallantry Award" ,"Ashok Chakra"),
    State_Capital("The highest Award" ,"Bharat Ratna"),
    State_Capital("The biggest Church" ,"Saint Cathedral at old Goa (goa)"),
    State_Capital("The Southern Indian State with Longest Costal line" ,"Andhra Pradesh"),
    State_Capital("The Longest Sea Beach" ,"Marina Beach (Chennai)"),
    State_Capital("The Highest Road" ,"Road at Khardungla, (in Leh â€“Manali Sector)"),
    State_Capital("The largest artificial Lake" ,"Govind Sagar (Bhakhra Nangal)"),
    State_Capital("The deepest River Valley" ,"Bhagirathi and Alaknanda"),
    State_Capital("The largest River without Delta" ,"Narmada and Tapi"),
    State_Capital("The biggest river Island" ,"Majuli Brahmputra river, (Assam)"),
    State_Capital("The largest Planetarium" ,"Birla Planetarium"),
    State_Capital("The Highest Airport" ,"Leh Airport (Ladakh)"),
    State_Capital("Largest state in area" ,"Rajasthan (3,42,239 sq.km)"),
    State_Capital("Smallest state in area" ,"Goa (3,702sq.km)")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Superlatives in India"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Field"
        bank.text = "Name and Place"


        recyclerstatecapital=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofcountry)
        recyclerstatecapital.adapter = recyclerAdapter
        recyclerstatecapital.layoutManager =  layoutManager
    }
}
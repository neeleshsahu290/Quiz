package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class RiverSideCityActivity : AppCompatActivity() {

    lateinit var recyclerrivercity : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofrivercity = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency( "New Delhi", "Yamuna","Delhi"),
        Country_Capital_Currency("Srinagar"," Jhelum ","Jammu and Kashmir"),
        Country_Capital_Currency("Ferozpur"," Sutlej", "Punjab"),
        Country_Capital_Currency("Ahmedabad", "Sabarmati", "Gujarat"),
        Country_Capital_Currency("Surat", "Tapi", "Gujarat") ,
        Country_Capital_Currency("Vadodara", "Vishwamitri, Mahi, Narmada", "Gujarat"),
        Country_Capital_Currency("Bharuch", "Narmada", "Gujarat"),
        Country_Capital_Currency( "Kota", "Chambal", "Rajasthan"),
        Country_Capital_Currency("Rishikesh", "Ganges", "Uttarakhand"),
        Country_Capital_Currency("Haridwar", "Ganges", "Uttarakhand"),
        Country_Capital_Currency("Badrinath", "Alaknanda", "Uttarakhand"),
        Country_Capital_Currency("Allahabad" ,"At the confluence of Ganga, Yamuna and Saraswati", "Uttar Pradesh"),
        Country_Capital_Currency("Kanpur" ,"Ganges", "Uttar Pradesh"),
        Country_Capital_Currency("Kanpur", "Cantonment Ganges", "Uttar Pradesh"),
        Country_Capital_Currency("Varanasi", "Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Mirzapur", "Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Fatehgarh", "Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Farrukhabad" ,"Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Kannauj" ,"Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Shuklaganj" ,"Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Chakeri" ,"Ganges" ,"Uttar Pradesh"),
        Country_Capital_Currency("Mathura" ,"Yamuna" ,"Uttar Pradesh"),
        Country_Capital_Currency("Agra" ,"Yamuna" ,"Uttar Pradesh"),
        Country_Capital_Currency("Auraiya" ,"Yamuna" ,"Uttar Pradesh"),
        Country_Capital_Currency("Etawah" ,"Yamuna" ,"Uttar Pradesh"),
        Country_Capital_Currency("Jaunpur" ,"Gomti", "Uttar Pradesh"),
        Country_Capital_Currency("Lucknow" ,"Gomti" ,"Uttar Pradesh"),
        Country_Capital_Currency("Ayodhya" ,"Saryu" ,"Uttar Pradesh"),
        Country_Capital_Currency("Gorakhpur" ,"Rapti" ,"Uttar Pradesh"),
        Country_Capital_Currency("Bhagalpur" ,"Ganges" ,"Bihar"),
        Country_Capital_Currency("Patna" ,"Ganges" ,"Bihar"),
        Country_Capital_Currency("Hajipur" ,"Ganges" ,"Bihar"),
        Country_Capital_Currency("Gaya" ,"Falgu (Neeranjana)" ,"Bihar"),
        Country_Capital_Currency("Gwalior" ,"Chambal" ,"Madhya Pradesh"),
        Country_Capital_Currency("Ujjain", "Shipra" ,"Madhya Pradesh"),
        Country_Capital_Currency("Ashta" ,"Parwati" ,"Madhya Pradesh"),
        Country_Capital_Currency("Jabalpur" ,"Narmada" ,"Madhya Pradesh"),
        Country_Capital_Currency("Kolkata" ,"Hooghly" ,"West Bengal"),
        Country_Capital_Currency("Banki" ,"Mahanadi" ,"Odisha"),
        Country_Capital_Currency("Cuttack" ,"Mahanadi" ,"Odisha"),
        Country_Capital_Currency("Sambalpur" ,"Mahanadi" ,"Odisha"),
        Country_Capital_Currency("Rourkela" ,"Brahmani" ,"Odisha"),
        Country_Capital_Currency("Brahmapur" ,"Rushikulya" ,"Odisha"),
        Country_Capital_Currency("Chhatrapur" ,"Rushikulya" ,"Odisha"),
        Country_Capital_Currency("Hyderabad" ,"Musi" ,"Telangana"),
        Country_Capital_Currency("Nizamabad" ,"Godavari" ,"Telangana"),
        Country_Capital_Currency("Rajahmundry" ,"Godavari" ,"Andhra Pradesh"),
                Country_Capital_Currency("Kurnool" ,"Tungabhadra" ,"Andhra Pradesh"),
                Country_Capital_Currency("Vijayawada" ,"Krishna" ,"Andhra Pradesh"),
                Country_Capital_Currency("Nellore" ,"Pennar" ,"Andhra Pradesh"),
                Country_Capital_Currency("Bangalore" ,"Vrishabhavathi" ,"Karnataka"),
                Country_Capital_Currency("Mangalore" ,"Netravati , Gurupura" ,"Karnataka"),
                Country_Capital_Currency("Shimoga" ,"Tunga River" ,"Karnataka"),
                Country_Capital_Currency("Bhadravathi" ,"Bhadra" ,"Karnataka"),
                Country_Capital_Currency("Hospet" ,"Tungabhadra" ,"Karnataka"),
                Country_Capital_Currency("Karwar" ,"Kali" ,"Karnataka"),
                Country_Capital_Currency("Bagalkot" ,"Ghataprabha" ,"Karnataka"),
                Country_Capital_Currency("Honnavar" ,"Sharavathi" ,"Karnataka"),
                Country_Capital_Currency("Nashik" ,"Godavari" ,"Maharashtra"),
                Country_Capital_Currency("Nanded" ,"Godavari" ,"Maharashtra"),
                Country_Capital_Currency("Sangli" ,"Krishna" ,"Maharashtra"),
                Country_Capital_Currency("Karad" ,"Krishna, Koyna" ,"Maharashtra"),
                Country_Capital_Currency("Pune" ,"Mula, Mutha" ,"Maharashtra"),
                Country_Capital_Currency("Karjat" ,"Ulhas" ,"Maharashtra"),
                Country_Capital_Currency("Mahad" ,"Savitri" ,"Maharashtra"),
               Country_Capital_Currency( "Kolhapur" ,"Panchaganga" ,"Maharashtra"),
                Country_Capital_Currency("Malegaon" ,"Girna River" ,"Maharashtra"),
                Country_Capital_Currency("Thiruchirapalli" ,"Kaveri" ,"Tamil Nadu"),
                Country_Capital_Currency("Erode" ,"Kaveri" ,"Tamil Nadu"),
               Country_Capital_Currency("Chennai" ,"Cooum, Adyar" ,"Tamil Nadu"),
                Country_Capital_Currency("Madurai" ,"Vaigai" ,"Tamil Nadu"),
                Country_Capital_Currency("Coimbatore" ,"Noyyal" ,"Tamil Nadu"),
                Country_Capital_Currency("Tirunelveli" ,"Thamirabarani" ,"Tamil Nadu"),
                Country_Capital_Currency("Kottayam" ,"Meenachil" ,"Kerala"),
                Country_Capital_Currency("Dibrugarh" ,"Brahmaputra" ,"Assam"),
                Country_Capital_Currency("Guwahati" ,"Brahmaputra" ,"Assam"),
                Country_Capital_Currency("Rangpo" ,"Teesta" ,"Sikkim"),
                Country_Capital_Currency("Daman" ,"Daman Ganga River" ,"Daman")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="RIVER SIDE CITES"

        var city : TextView = findViewById(R.id.txt3rowElt1)
        var river : TextView = findViewById(R.id.txt3rowElt2)
        var state : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "State"
        city.text = "City"
        river.text ="River"

        recyclerrivercity =findViewById(R.id.recyclercountrycurrencylist)
        recyclerrivercity.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofrivercity)
        recyclerrivercity.adapter = recyclerAdapter
        recyclerrivercity.layoutManager =  layoutManager

    }
}
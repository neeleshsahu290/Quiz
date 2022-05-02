package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class CityNicknameActivity : AppCompatActivity() {

    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofcity = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Agra" ,"City of Taj, Petha Nagari" ,"Uttar Pradesh"),

                Country_Capital_Currency("Ahmedabad" ,"Boston of India, Manchester of India"," Gujarat"),
                Country_Capital_Currency("Allahabad", "Abode of the God, City of Prime Ministers, Sangam City","Uttar Pradesh"),
                Country_Capital_Currency("Amritsar" ,"Golden City of India" ,"Punjab"),
                Country_Capital_Currency("Asansol" ,"Land of Black Diamond" ,"West Bengal"),
                Country_Capital_Currency("Bengaluru", "Electronic City of India, Garden City of India, IT Capital of India, Science city of India, Silicon Valley of India, Space City","Karnataka"),
                Country_Capital_Currency("Bhagalpur" ,"The Silk City of India" ,"Bihar"),
                Country_Capital_Currency("Bhopal" ,"City of Lakes" ,"Madhya Pradesh"),
        Country_Capital_Currency("Indore" ,"Mini Mumbai" ,"Madhya Pradesh"),
                Country_Capital_Currency("Bhimavaram" ,"City of Prawns, Second Bardoli of India" ,"Andhra Pradesh"),

                Country_Capital_Currency("Bhubaneswar" ,"Temple City of India" ,"Odisha"),
                Country_Capital_Currency("Chandigarh" ,"The City Beautiful" ,"Chandigarh"),
                Country_Capital_Currency("Chennai" ,"Auto Hub of India, Detroit of Asia, Gateway of South India, Health Capital of India","Tamil Nadu"),
                Country_Capital_Currency("Coimbatore" ,"Textile City of India, Manchester of South India" ,"Tamil Nadu"),

                Country_Capital_Currency("Coorg" ,"Scotland of India" ,"Karnataka"),
                Country_Capital_Currency("Darjeeling" ,"Queen of the Hills" ,"West Bengal"),
                Country_Capital_Currency("Dhanbad" ,"The Coal Capital of India" ,"Jharkhand"),
                Country_Capital_Currency("Shillong" ,"Scotland of East" ,"Meghalaya"),
                Country_Capital_Currency("Dibrugarh" ,"Tea City of India" ,"Assam"),
                Country_Capital_Currency("Durgapur" ,"Rur of India" ,"West Bengal"),
                Country_Capital_Currency("Gandhinagar" ,"Green City" ,"Gujarat"),
                Country_Capital_Currency("Guntur" ,"City of Chillies" ,"Andhra Pradesh"),
                Country_Capital_Currency("Guwahati" ,"Gateway of North East India" ,"Assam"),
                Country_Capital_Currency("Nilgiri" ,"Blue Mountains" ,"Tamil Nadu"),
        Country_Capital_Currency("Hyderabad" ,"City of Pearls, City of Nizams, Hightech City, World Capital of Biryani, Bangle City","Telangana"),
                Country_Capital_Currency("Hyderabad-Secunderabad" ,"Twin City" ,"Telangana"),
                Country_Capital_Currency("Jaipur" ,"City of Palaces, Paris of India, Pink City","Rajasthan"),
                Country_Capital_Currency("Jaisalmer" ,"Golden City of India" ,"Rajasthan"),
                Country_Capital_Currency("Jamshedpur" ,"Pittsburgh of India, Steel City of India" ,"Jharkhand"),

                Country_Capital_Currency("Jodhpur" ,"Blue City, Sun City" ,"Rajasthan"),

                Country_Capital_Currency("Kakinada" ,"City of Kaja, Pensioners Paradise" ,"Andhra Pradesh"),

                Country_Capital_Currency("Kanpur" ,"Leather City of the World, Manchester of North India" ,"Uttar Pradesh"),

                Country_Capital_Currency("Kashmir" ,"Switzerland of India" ,"Jammu and Kashmir"),
                Country_Capital_Currency("Kochi" ,"Gateway to Kerala, Queen of the Arabian Sea" ,"Kerala"),
        Country_Capital_Currency("Kolkata" ,"City of Joy, City of Palaces, Cultural Capital of India, Gateway of Eastern India, Heaven of the Aged","West Bengal"),
                Country_Capital_Currency("Kolhapur" ,"City of Wrestlers" ,"Maharashtra"),
                Country_Capital_Currency("Kollam" ,"Cashew Capital of the World, Gateway to Backwaters, Prince of Arabian sea","Kerala"),
               Country_Capital_Currency("Lucknow" ,"City of Nawabs, Constantinople of the East, hiraz-e-Hind, The Golden City of India","Uttar Pradesh"),
                Country_Capital_Currency("Madurai" ,"Athens of the East, City of Festivals, City of Four Junctions, Sleepless City, Temple City","Tamil Nadu"),
                Country_Capital_Currency("Malda" ,"Mango City" ,"West Bengal"),
                Country_Capital_Currency("Mangalore", "Cradle of Indian Banking, Gateway of Karnataka, Rome of the East","Karnataka"),
                Country_Capital_Currency("Mumbai" ,"City of Dreams, City of Seven Islands, Financial Capital of India, Gateway of India, Hollywood of India, Maximum City, Maya Nagari","Maharashtra"),
                Country_Capital_Currency("Mundi" ,"Power Hub City" ,"Madhya Pradesh"),
                Country_Capital_Currency("Mussoorie" ,"Queen of the Mountains" ,"Uttarakhand"),
                Country_Capital_Currency("Mysore" ,"Green City, Heritage City" ,"Karnataka"),

                Country_Capital_Currency("Nagpur" ,"Orange City" ,"Maharashtra"),
                Country_Capital_Currency("Nainital" ,"City of Lakes" ,"Uttarakhand"),
                Country_Capital_Currency("Nasik" ,"California of India, Grape city of India, Wine capital of India","Maharashtra"),
                Country_Capital_Currency("New Delhi" ,"City of Rallies" ,"Delhi"),
                Country_Capital_Currency("Patiala" ,"Royal City" ,"Punjab"),
                Country_Capital_Currency("Panipat" ,"City of Handloom, City of Weavers" ,"Haryana"),
        Country_Capital_Currency("Palanpur" ,"City of Diamonds, Flower City" ,"Gujrat"),

                Country_Capital_Currency("Pondicherry" ,"Paris of the East" ,"Puducherry"),
                Country_Capital_Currency("Prayag" ,"Abode of the God" ,"Uttar Pradesh"),
                Country_Capital_Currency("Pune" ,"Queen of Deccan" ,"Maharashtra"),
                Country_Capital_Currency("Purulia" ,"Manbhum City" ,"West Bengal"),
                Country_Capital_Currency("Rajahmundry" ,"Cultural City" ,"Andhra Pradesh"),
                Country_Capital_Currency("Rishikesh" ,"City of Sages, Yoga City" ,"Uttrakhand"),

                Country_Capital_Currency("Siliguri" ,"City of Hospitality, Gateway to the Doors" ,"West Bengal"),

                Country_Capital_Currency("Srinagar" ,"City of lakes" ,"Jammu and Kashmir"),
                Country_Capital_Currency("Surat" ,"City Of Diamonds, Diamond City Of India, Textile city Of India" ,"Gujarat"),

                Country_Capital_Currency("Tezpur" ,"City of Blood" ,"Assam"),
                Country_Capital_Currency("Thane" ,"City of Lakes" ,"Maharashtra"),
                Country_Capital_Currency("Tiruchirappalli" ,"Energy equipment and fabrication capital of India, Rock Fort City, Tucker Trichy","Tamil Nadu"),
                Country_Capital_Currency("Tirunelveli" ,"City of Paddy fields, Halwa city of India, Oxford city of South India" ,"Tamil Nadu"),

                Country_Capital_Currency("Udaipur" ,"City of Lakes, Venice of the East, White City" ,"Rajasthan"),

                Country_Capital_Currency("Vadodara" ,"Banyan City, Cultural City Of India, Sayaji Nagari, World Capital Of Garba" ,"Gujarat"),

                Country_Capital_Currency("Vaniyambadi" ,"Leather city of South India" ,"Tamil Nadu"),
                Country_Capital_Currency("Varanasi" ,"City of Lights, City of Temples, City of Learning, Holy City, Oldest living city on Earth, Religious capital of India, Spiritual capital of India","Uttar Pradesh"),
                Country_Capital_Currency("Vijayawada" ,"The Place of Victory" ,"Andhra Pradesh"),
                Country_Capital_Currency("Visakhapatnam" ,"City Of Destiny" ,"Andhra Pradesh"),
                Country_Capital_Currency("Warangal" ,"City of Lakes,City of Temples, Second city of Nizam" ,"Telangana"),

               Country_Capital_Currency("Zunheboto" ,"Land Of Warriors" ,"Nagaland")



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Nicknames of Indian Cities"

        val damname: TextView =findViewById(R.id.txt3rowElt1)
        val stale : TextView = findViewById(R.id.txt3rowElt2)
        val river : TextView = findViewById(R.id.txt3rowElt3)
        damname.text = "Name of the City"
        stale.text = "Nicknames"
        river.text="State/UT"

        recyclernickname=findViewById(R.id.recyclercountrycurrencylist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager

    }
}
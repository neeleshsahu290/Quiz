package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class FirstinwomenActivity : AppCompatActivity() {


    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("First Indian Woman Doctor" ,"Anandi Gopal Joshi","1886" ,"Pune, British India"),
        City_Founders4("First Woman President of INC" ,"Annie Besant","1917" ,"London, UK"),
        City_Founders4("First Indian Woman President of INC" ,"Sarojini Naidu","1925" ,"Hyderabad, Andhra Pradesh (Now Telangana)"),
        City_Founders4("First Indian Woman Airline Pilot" ,"Sarla Thakral","1936" ,"New Delhi"),
        City_Founders4("First Indian Woman to swim across English Channel" ,"Arati Saha","1959" ,"Kolkata, West Bengal"),
        City_Founders4("First Indian woman to get Arjuna Award" ,"Stephie D'Souza","1963" ,"Goa"),
        City_Founders4("First Indian Woman to become Miss World" ,"Miss Reita Faria","1966" ,"British Bombay (Now Mumbai)"),
        City_Founders4("First Indian Woman to win Gold in Asian Games" ,"Kamaljeet Sandhu","1970" ,"Punjab"),
        City_Founders4("First Indian Woman to get Bharat Ratna" ,"Indira Gandhi","1971" ,"Allahabad, Uttar Pradesh"),
        City_Founders4("First Indian Woman to get Jnanpith Award" ,"Ashapoorna Devi","1976", "Culcutta (Now Kolkata, West Bengal)"),
        City_Founders4("First Indian Woman to get Nobel Prize" ,"Mother Terasa","1979" ,"West Germany (Now Macedonia)"),
        City_Founders4("First Indian Women to win Oscar Award" ,"Bhanu Athaiya","1983" ,"Kolhapur, British India (Now Maharashtra)"),
    City_Founders4("First Indian Woman to climb Mt Everest" ,"Bachendri Pal","1984", "Uttrakashi (Now Uttarakand)"),
        City_Founders4("First Woman to get Ashok Chakra" ,"Nirja Bhanot","1987" ,"Chandigarh, Punjab"),
        City_Founders4("First Woman Judge of Supreme Court" ,"Meera Sahib Fatima Bibi","1989" ,"Pathanamthitta, Kerala "),
        City_Founders4("First Indian Woman to become Miss Universe" ,"Susmita Sen","1994" ,"Hyderabad, Andhra Pradesh (Now Telangana)"),
        City_Founders4("First Indian Woman to Booker Prize" ,"Arundhati Roy","1997" ,"Shillong, Assam (Present Meghalaya)"),
        City_Founders4("First Indian Woman to go to space","Kalpana Chawla","1997" ,"Karnal, Punjab (Now Haryana)"),
        City_Founders4("First Woman Musician to get Bharat Ratna" ,"MS Subbalakshmi","1998" ,"Madurai, Tamilnadu"),
        City_Founders4("First Indian Woman to win Medal in Olymbic" ,"Karnam Malleswari","2000" ,"Andhra Pradesh"),
        City_Founders4("First Indian Woman to win WTA Title", "Sania Mirza","2004" ,"Hyderabad, Andhra Pradesh (Now Telangana)"),
        City_Founders4("India’s First Woman Governor (Uttar Pradesh)" ,"Sarojini Naidu","1947 - 1949" ,"Hyderabad, Andhra Pradesh (Now Telangana)"),
        City_Founders4("First Indian Woman Ambassador at UN" ,"Vijalakshmi Pandit","1947 - 1949" ,"Allahabad, Uttar Pradesh"),
        City_Founders4("First Woman Union Minister (Minister of Health)" ,"Rajkumari Amrita Kaur","1947 - 1957" ,"Lucknow, Uttar Pradesh"),
        City_Founders4("First Woman Chief Minister of State (Uttar Pradesh)" ,"Sucheta Kripalani","1963 - 1967" ,"Ambala, Punjab (Now in Haryana)"),
        City_Founders4("India’s First Woman Prime Minister" ,"Indira Gandhi", "1966-1977" ,"Allahabad, Uttar Pradesh"),
        City_Founders4("India’s First Woman IPS Officer" ,"Kiran Bedi","1975 (In Delhi)" ,"Amritsar, Punjab"),
        City_Founders4("First Indian Woman to climb Mt Everest twice" ,"Santhosh Yadhav","1992, 1993" ,"Haryana"),
        City_Founders4("India’s First Woman President" ,"Pratiba Patil","2007 - 2012" ,"Maharashtra"),
        City_Founders4("First transgender woman to be a police officer in India (Dharmapuri)" ,"K Prithika Yashini","2017 (Dharmapuri)" ,"Tamilnadu")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="First in India (Female)"


        val damname: TextView =findViewById(R.id.txt4rowElt1)
        val stale : TextView = findViewById(R.id.txt4rowElt2)
        val river : TextView = findViewById(R.id.txt4rowElt3)
        val year : TextView = findViewById(R.id.txt4rowElt4)
        damname.text = "Field"
        stale.text = "Name of the Person"
        river.text="Year"
        year.text="Birth Place"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager
    }
}
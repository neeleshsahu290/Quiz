package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class SpaceCentrelistActivity : AppCompatActivity() {


    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(

        State_Capital("New Delhi" ,"DOS branch secretariate , ISRO branch office , Delhi earth station"),
        State_Capital("Dehradun" ,"Indian Institue of remote sensing , Northern RRSC-Regional Remote Sensing Centre"),
        State_Capital("Lucknow" ,"ISTRAC ground station"),
        State_Capital("Shillong" ,"North eastern space application centre"),
        State_Capital("Kharagpur" ,"Eastern RRSC-Regional Remote Sensing Centre"),
        State_Capital("Hyderbad" ,"NRSA or NRSC – national remote sensing agency /centre"),
        State_Capital("Tirupati" ,"NMRF-National Atmospheric Research Laboratory"),
        State_Capital("Sriharikota" ,"Satish Dhawan Space Centre"),
        State_Capital("Port Blair" ,"Down range station"),
        State_Capital("Kerala" ,"ALUVA – Ammonium perchlorate experiment plant"),
        State_Capital("Mahendra Giri" ,"Liquid Propulsion Test Facilities"),
        State_Capital("Thiruvananthapuram" ,"Vikram Sarabhai Space Centre, Liquid Propulsion Systems Centre , ISRO Interial Systems Unit"),
        State_Capital("Hassan" ,"INSAT master control facility"),
        State_Capital("Banglore" ,"Space commission, HQ –ISRO , INSAT programme office , NNRMS secretriate- National Natural Resources Management System , ANTRIX corporation , ISTRAC-ISRO Telemetry&Tracking and Command Network , ISRO satellite centre , Liquid propulsaion systems centre"),
        State_Capital("Mumbai" ,"ISRO Liasion office"),
        State_Capital("Nagpur" ,"Central RRSC-Regional Remote Sensing Centre"),
        State_Capital("Mount Abu" ,"Infrared Observatory"),
        State_Capital("Ahmedabad" ,"Space Application Centre , Physcial Research Laboratory , Development & educational communication unit"),
        State_Capital("Jodhpur" ,"Western RRSC-Regional Remote Sensing Centre"),
        State_Capital("Udaipur" ,"Solar Obesrvatory"),
        State_Capital("Balasore" ,"Remote Sensing Centre")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Space Centres In India"


        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Location in India"
        bank.text = "Name Of Space Centre"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager

    }
}
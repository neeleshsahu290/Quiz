package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class BirdSanturiesActivity : AppCompatActivity() {


    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(
        State_Capital("Andhra Pradesh" ,"Atapaka Bird Sanctuary"),
        State_Capital("","Nelapattu Bird Sanctuary"),
        State_Capital("","Pulicat Lake Bird Sanctuary"),
        State_Capital("","Sri Peninsula Narasimha Wildlife Sanctuary"),
        State_Capital("","Uppalapadu Bird Sanctuary"),
        State_Capital("Assam" ,"Bordoibam Beelmukh Birds’ Sanctuary"),
        State_Capital("","Deepor beel bird sanctuary"),
        State_Capital("","Panidihing bird sanctuary"),
                State_Capital("Bihar" ,"Nagi Dam Bird Sanctuary"),
                State_Capital("","Nakti Dam Bird SanctuaryBhimband Wildlife Sanctuary"),
                State_Capital("Delhi" ,"Najafgarh drain bird sanctuary"),
                State_Capital("Goa" ,"Salim Ali Bird Sanctuary"),
                State_Capital("Gujarat" ,"Gaga Wildlife Sanctuary"),
                State_Capital("","Khijadiya Bird Sanctuary"),
                State_Capital("","Kutch Bustard Sanctuary"),
                State_Capital("","Nal Sarovar Bird Sanctuary"),
                State_Capital("","Porbandar Bird Sanctuary"),
                State_Capital("","Thol Lake"),
        State_Capital("Haryana" ,"Bhindawas Wildlife Sanctuary"),
        State_Capital("","Khaparwas Wildlife Sanctuary"),
        State_Capital("Himachal Pradesh" ,"Gamgul"),
        State_Capital("Karnataka" ,"Attiveri Bird Sanctuary"),
        State_Capital("","Bankapura Peacock Sanctuary"),
        State_Capital("","Bonal Bird Sanctuary"),
        State_Capital("","Gudavi Bird Sanctuary"),
        State_Capital("","Kaggaladu Bird Sanctuary"),
        State_Capital("","Magadi Bird Sanctuary"),
        State_Capital("","Mandagadde Bird Sanctuary"),
                State_Capital("","Puttenahalli Lake (Yelahanka)"),
                State_Capital("","Ranganathittu Bird Sanctuary"),
                State_Capital("Kerala" ,"Kadalundi Bird Sanctuary"),
                State_Capital("","Kumarakom Bird Sanctuary"),
                State_Capital("","Mangalavanam Bird Sanctuary"),
                State_Capital("","Pathiramanal Kerala"),
                State_Capital("","Pakshipathalam Bird Sanctuary"),
                State_Capital("","Thattekad Bird Sanctuary"),
                State_Capital("Maharashtra" ,"Mayani Bird Sanctuary"),
                State_Capital("","Great Indian Bustard Sanctuary"),
                State_Capital("Mizoram" ,"Lengteng Wildlife Sanctuary"),
                State_Capital("Odisha" ,"Chilika Lake"),
                State_Capital("Punjab" ,"Harike bird sanctuary"),
                State_Capital("Rajasthan" ,"Keoladeo National Park"),
                State_Capital("","Khichan Bird Sanctuary"),
                State_Capital("","Tal Chhapar Sanctuary"),
                State_Capital("Tamil Nadu","Chitrangudi Bird Sanctuary"),
                State_Capital("","Kanjirankulam Bird Sanctuary"),
                State_Capital("","Koonthankulam Bird Sanctuary"),
                State_Capital("","Suchindram Theroor Birds Sanctuary"),
                State_Capital("","Udayamarthandapuram Bird Sanctuary"),
                State_Capital("","Vedanthangal Bird Sanctuary"),
                State_Capital("","Vellode Birds Sanctuary"),
                State_Capital("","Vettangudi Bird Sanctuary"),
                State_Capital("Uttar Pradesh" ,"Bakhira Sanctuary"),
                State_Capital("","Lakh Bahosi Sanctuary"),
                State_Capital("","Nawabganj Bird Sanctuary"),
                State_Capital("","Okhla Sanctuary"),
                State_Capital("","Patna Bird Sanctuary"),
                State_Capital("","Saman Sanctuary"),
                State_Capital("","Samaspur Sanctuary"),
                State_Capital("","Sandi Bird SanctuaryThasrana Bird Sanctuary"),
                State_Capital("West Bengal" ,"Chintamoni Kar Bird Sanctuary"),
                State_Capital("","Raiganj Wildlife Sanctuary")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Bird Sanctuaries"

        val country : TextView = findViewById(R.id.txt2rowElt1)
        val bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="State"
        bank.text = "Bird Sanctuary"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
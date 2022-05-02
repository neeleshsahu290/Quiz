package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency
import com.Neelesh.quiz.data_class.State_Capital

class State_Capital_list_Activity : AppCompatActivity() {
    lateinit var recyclerstatecapital : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofcountry = arrayListOf<State_Capital>(
        State_Capital("Andhra Pradesh","Hyderabad (Proposed Capital Amaravati)"),
        State_Capital("Arunachal Pradesh","Itanagar"),
        State_Capital("Assam","Dispur"),
        State_Capital("Bihar","Patna"),
        State_Capital("Chhattigarh","Raipur"),
        State_Capital("Goa","Panaji"),
        State_Capital("Gujarat","Gandhinagar"),
        State_Capital("Haryana","Chandigarh"),
        State_Capital("Himachal Pradesh","Shimla"),
        State_Capital("Jharkhand","Ranchi"),
        State_Capital("Karnataka","Bengaluru (formerly Bangalore)"),
        State_Capital("Kerala","Thiruvananthapuram"),
        State_Capital("Madhya Pradesh","Bhopal"),
        State_Capital("Maharasthra","Mumbai"),
        State_Capital("Manipur","Imphal"),
        State_Capital("Meghalaya","Shillong"),
        State_Capital("Mizoram","Aizawl"),
        State_Capital("Nagaland","Kohima"),
        State_Capital("Odisha","Bhubaneswar"),
        State_Capital("Punjab","Chandigarh"),
        State_Capital("Rajasthan","Jaipur"),
        State_Capital("Sikkim","Gangtok"),
        State_Capital("Tamil Nadu","Chennai"),
        State_Capital("Telangana","Hyderabad"),
        State_Capital("Tripura","Agartala"),
        State_Capital("Uttar Pradesh","Lucknow"),
        State_Capital("Uttarakhand","Dehradun (Winter)\n" +
                "Gairsain (Summer)"),
        State_Capital("West Bengal","Kolkata")


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="States and their Capitals"

        recyclerstatecapital=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofcountry)
        recyclerstatecapital.adapter = recyclerAdapter
        recyclerstatecapital.layoutManager =  layoutManager



    }
}
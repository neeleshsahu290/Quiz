package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency
import com.Neelesh.quiz.data_class.State_Capital

class FoodFestivleActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(
        State_Capital("Orange Festival"	,"Poland"),
        State_Capital("International Mango Festival"	,"New Delhi, India"),
        State_Capital("Pancake Festival"	,"Moscow, Russia"),
        State_Capital("Marine Lobster Festival"	,"Rockland USA"),
        State_Capital("Mistura Food Festival"	,"Lima, Peru"),
        State_Capital("Melbourne Food & Wine Festival"	,"Melbourne, Australia"),
    State_Capital("San Francisco Street Food Festival"	,"San Francisco, Australia"),
    State_Capital("Oktoberfest"	,"Munich, Germany"),
    State_Capital("Chinchilla Melon Festival ( Watermelon)"	,"Australia"),
    State_Capital("Alba White Truffle Festival"	,"Alba, Italy"),
    State_Capital("Baltic Herring Festival"	,"Helsinki, Finland"),
    State_Capital("Chocolate Festival"	,"London, UK"),
    State_Capital("Tomato Festival"	,"Spain"),
    State_Capital("Monkey Buffet Festival"	,"Lopburi Province, Thailand"),
    State_Capital("Potato Festival"	,"Sweden"),
    State_Capital("Onion Eating Festival"	,"Spain"),
    State_Capital("Vegetarian Festival"	,"Thailand"),
    State_Capital("Ivrea Orange Festival"	,"Ivrea, Italy"),
    State_Capital("Abergavenny Food Festival"	,"Wales, UK"),
    State_Capital("Grape Throwing Festival"	,"Mallorca, Spain")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Food Festival Around The World"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Food Festival Name"
        bank.text = "Country"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
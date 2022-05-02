package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class HimalyanPeakActivity : AppCompatActivity() {

    lateinit var recyclerHpeak : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofstate = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Kangchenjunga","8,586 m (28,169 ft)" ,"Himalayas Ranges, Sikkim"),
    Country_Capital_Currency("Nanda Devi","7816 m(25643 ft)" ,"Garhwal Himalayas, Uttarakhand"),
    Country_Capital_Currency("Kamet","7,756 m (25,446 ft)" ,"Zaskar Range, Uttarakhand"),
    Country_Capital_Currency("Saltoro Kangri","7,742 m (25,400 ft)" ,"Karakoram,Greater Himalaya, Jammu and Kashmir"),
        Country_Capital_Currency("Saser Kangri", "7,672 m (25,171 ft)","Saser Muztagh, Karakoram greater Himalaya, Jammu and Kashmir"),
    Country_Capital_Currency("Mamostong Kangri", "7,516 m (24,659 ft)" ,"Rimo Muztagh, Karakoram, Jammu and Kashmir"),
    Country_Capital_Currency("Rimo","7,385 m (24,229 ft)" ,"Siachen Area, Jammu and Kashmir"),
    Country_Capital_Currency("Hardeol", "7,151 m (23,461 ft)" ,"Kumaon Region, Uttarakhand"),
    Country_Capital_Currency("Chaukhamba", "7,138 m (23,419 ft)" ,"Kumaon Region, Uttarakhand"),
    Country_Capital_Currency("Trisul","7,120 m (23,359 ft)" ,"Kumaon Region, Uttarakhand")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Himalayan mountain peaks in India"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var lang : TextView = findViewById(R.id.txt3rowElt2)
        var lang2 : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "Peak"
        lang.text = "Height"
        lang2.text ="State/UT"

        recyclerHpeak =findViewById(R.id.recyclercountrycurrencylist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofstate)
        recyclerHpeak.adapter = recyclerAdapter
        recyclerHpeak.layoutManager =  layoutManager

    }
}
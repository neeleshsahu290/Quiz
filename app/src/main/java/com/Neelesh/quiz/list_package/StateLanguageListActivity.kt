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

class StateLanguageListActivity : AppCompatActivity() {

    lateinit var recyclerstatelanguage : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofstate = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Andhra Pradesh","Telugu","Urdu"),
    Country_Capital_Currency("Arunachal Pradesh","English",""),
    Country_Capital_Currency("Assam","Assamese",""),
    Country_Capital_Currency("Bihar","Hindi","Urdu"),
    Country_Capital_Currency("Chhattigarh","Hindi",""),
    Country_Capital_Currency("Goa","Konkani","Marathi"),
    Country_Capital_Currency("Gujarat","Gujarati",""),
    Country_Capital_Currency("Haryana","Hindi",""),
   Country_Capital_Currency("Himachal Pradesh","Hindi","English"),
    Country_Capital_Currency("Jharkhand","Hindi","Urdu"),
    Country_Capital_Currency("Karnataka","Kannada",""),
    Country_Capital_Currency("Kerala","Malayalam",""),
    Country_Capital_Currency("Madhya Pradesh","Hindi",""),
    Country_Capital_Currency("Maharasthra","Marathi",""),
    Country_Capital_Currency("Manipur","Manipuri","English"),
    Country_Capital_Currency("Meghalaya","English","Khasi"),
    Country_Capital_Currency("Mizoram","Mizo, English, Hindi",""),
    Country_Capital_Currency("Nagaland","English",""),
    Country_Capital_Currency("Odisha","Odia",""),
    Country_Capital_Currency("Punjab","Punjabi (in Gurumukhi Script)",""),
    Country_Capital_Currency("Rajasthan","Hindi","English"),
    Country_Capital_Currency("Sikkim","English",""),
    Country_Capital_Currency("Tamil Nadu","Tamil","English"),
    Country_Capital_Currency("Telangana","Telugu and Urdu",""),
    Country_Capital_Currency("Tripura","Bengali, Kokborok and\n" +
            "English",""),
    Country_Capital_Currency("Uttar Pradesh","Hindi","Urdu"),
    Country_Capital_Currency("Uttarakhand","Hindi",""),
    Country_Capital_Currency("West Bengal","Bengali","Hindi, Urdu, Santhali, Oriya and Punjabi, Nepali"),
        Country_Capital_Currency("Andaman and Nicobar Islands" ,"English, Hindi",""),
        Country_Capital_Currency("Chandigarh" ,"English" ,"Punjabi and Hindi"),
                 Country_Capital_Currency("Dadra and Nagar Haveli" ,"Hindi and Gujarati" ,"Marathi"),
        Country_Capital_Currency("Daman and Diu" ,"Konkani and Gujarati",""),
         Country_Capital_Currency("Delhi" ,"Hindi" ,"Punjabi, Urdu"),
        Country_Capital_Currency("Lakshadweep" ,"English" ,"Hindi"),
                 Country_Capital_Currency("Puducherry" ,"Tamil, English" ,"Malayalam and Telugu"),
        Country_Capital_Currency("Jammu and Kashmir","Urdu",""),
        Country_Capital_Currency("Ladakh","Hindi and English","Ladakhi, Urdu")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="States/UT official languages"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var lang : TextView = findViewById(R.id.txt3rowElt2)
        var lang2 : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "State/UT"
        lang.text = "Official Languages"
        lang2.text ="Other officially Recorganiged language"

        recyclerstatelanguage =findViewById(R.id.recyclercountrycurrencylist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofstate)
        recyclerstatelanguage.adapter = recyclerAdapter
        recyclerstatelanguage.layoutManager =  layoutManager

    }
}
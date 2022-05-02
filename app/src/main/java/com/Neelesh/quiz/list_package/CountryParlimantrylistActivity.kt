package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class CountryParlimantrylistActivity : AppCompatActivity() {

    lateinit var recyclerCentralBank : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofcountry = arrayListOf<State_Capital>(
        State_Capital("Afghanistan" ,"Shora"),
        State_Capital("Albania" ,"People’s Assembly"),
        State_Capital("Algeria" ,"National People’s Assembly"),
                State_Capital("Andorra" ,"General Council"),
                State_Capital("Angola" ,"National People’s Assembly"),
    State_Capital("Argentina" ,"National Congress"),
    State_Capital("Australia" ,"Federal Parliament"),
    State_Capital("Austria" ,"National Assembly"),
    State_Capital("Azerbaijan" ,"Melli Majlis"),
    State_Capital("Bahamas" ,"General Assembly"),
    State_Capital("Bahrain" ,"Consultative Council"),
    State_Capital("Bangladesh" ,"Jatia Parliament"),
    State_Capital("Belize" ,"National Assembly"),
    State_Capital("Bhutan" ,"Tsogdu"),
    State_Capital("Bolivia" ,"National Congress"),
    State_Capital("Botswana" ,"National Assembly"),
    State_Capital("Brazil" ,"National Congress"),
    State_Capital("Britain" ,"Parliment (House Of Common’s And House Of Lords)"),
    State_Capital("Brunei" ,"National Assembly"),
    State_Capital("Bulgaria" ,"Narodno Subranie"),
    State_Capital("Cambodia" ,"National Assembly"),
    State_Capital("Canada" ,"Parliament"),
    State_Capital("China" ,"National People’s Assembly"),
    State_Capital("Colombia" ,"Congress"),
    State_Capital("Comoros" ,"Legislative Council And Senate"),
    State_Capital("Congo Democratic" ,"Rep. Of National Legislative Council"),
        State_Capital("Costa Rice" ,"Legislative Council And Senate"),
                State_Capital("Crotia" ,"Sabor"),
                State_Capital("Cuba" ,"National Assembly Of People’s Power"),
    State_Capital("Denmark" ,"Folketing"),
    State_Capital("East Timor" ,"Constituent Assembly"),
    State_Capital("Ecuador" ,"National Congress"),
    State_Capital("Egypt" ,"People’s Assembly"),
    State_Capital("El Salvador", "Legislative Assembly"),
    State_Capital("Ethiopia" ,"Federal Council And House Of Representative"),
    State_Capital("Fiji Islands" ,"Senate & House Of Representative"),
    State_Capital("Finland" ,"Eduskusta (Parliament)"),
    State_Capital("France" ,"National Assembly"),
    State_Capital("Germany" ,"Bundestag (Lower House) & Bundesrat (Upper House)"),
    State_Capital("Great Britain" ,"Parliament"),
    State_Capital("Greece" ,"Chamber Of Deputies"),
    State_Capital("Guyana" ,"National Assembly"),
    State_Capital("Hungary" ,"National Assembly"),
    State_Capital("Iceland" ,"Althing"),
    State_Capital("India" ,"Sansad"),
    State_Capital("Indonesia" ,"People’s Consultative Assembly"),
    State_Capital("Iran" ,"Majlis"),
    State_Capital("Iraq" ,"National Assembly"),
    State_Capital("Ireland" ,"Oireachtas"),
    State_Capital("Israel" ,"The Knesset"),
    State_Capital("Italy" ,"Chamber Of Deputies And Senate"),
    State_Capital("Japan" ,"Diet"),
    State_Capital("Jordan" ,"National Assembly"),
    State_Capital("Korea(North)" ,"Supreme People’s Assembly"),
    State_Capital("Korea(South)" ,"National Assembly"),
    State_Capital("Kuwait" ,"National Assembly"),
    State_Capital("Labanon" ,"National Assembly"),
    State_Capital("Laos" ,"People’s Supreme Assembly"),
    State_Capital("Lativa" ,"Saeima"),
    State_Capital("Lesotho" ,"National Assembly And Senate"),
    State_Capital("Libya" ,"General People’s Congress"),
    State_Capital("Lithuania" ,"Seimas"),
    State_Capital("Luxembourg" ,"Chamber Of Deputies"),
    State_Capital("Madagascar" ,"National People’s Assembly"),
    State_Capital("Magnolia" ,"Khural"),
    State_Capital("Malaysia" ,"Majilis"),
    State_Capital("Maldives" ,"Majilis"),
    State_Capital("Mongolia" ,"Great People’s Khural"),
    State_Capital("Montenegro" ,"Federal Assembly"),
    State_Capital("Mozambique" ,"People’s Assembly"),
    State_Capital("Myanmar" ,"Pyithu Hluttaw"),
    State_Capital("Nepal" ,"Rashtriya Panchayat"),
    State_Capital("Netherlands" ,"States General (Staten-General)"),
    State_Capital("New Zealand" ,"Parliament (House Of Representative)"),
    State_Capital("Norway" ,"Storting"),
    State_Capital("Oman" ," Majlis al-Shura"),
    State_Capital("Pakistan" ,"National Assembly & Senate"),
    State_Capital("Papua New Guinea" ,"National Parliament"),
    State_Capital("Paraguay" ,"Senate & Chamber Of Deputies"),
    State_Capital("Philippines" ,"The Congress"),
    State_Capital("Poland" ,"Sejm"),
    State_Capital("Romania" ,"Great National Assembly"),
    State_Capital("Russia" ,"Duma & Federal Council"),
    State_Capital("Saudi Arabia" ,"Majlis Al Shura"),
    State_Capital("South Africa" ,"Parliament"),
    State_Capital("Spain" ,"Crotes"),
    State_Capital("Taiwan" ,"Yuan"),
    State_Capital("Turkey" ,"Grand National Assembly"),
    State_Capital("Uruguay" ,"Genral Assembly"),
    State_Capital("USA" ,"Congress"),
    State_Capital("Uzbekistan" ,"Oliy Majlis"),
    State_Capital("Vietnam" ,"National Assembly"),
    State_Capital("Zambia" ,"National Assembly"),
    State_Capital("Zimbabwe" ,"Parliament")


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Countries And Their Parliament Name"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Country Name"
        bank.text = "Parliament Name"

        recyclerCentralBank=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofcountry)
        recyclerCentralBank.adapter = recyclerAdapter
        recyclerCentralBank.layoutManager =  layoutManager
    }
}
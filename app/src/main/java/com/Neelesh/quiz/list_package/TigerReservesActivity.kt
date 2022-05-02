package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class TigerReservesActivity : AppCompatActivity() {

    lateinit var recyclerpalace : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofpalace = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Bandipur" ,"Karnataka" ,"1456"),
         Country_Capital_Currency("Jim Corbett" ,"Uttarakhand" ,"1288"),
         Country_Capital_Currency("Kanha" ,"Madhya Pradesh" ,"2052"),
         Country_Capital_Currency("Manas" ,"Assam" ,"3151"),
         Country_Capital_Currency("Melghat" ,"Maharashtra" ,"2769"),
         Country_Capital_Currency("Palamau" ,"Jharkhand" ,"1130"),
         Country_Capital_Currency("Ranthambore" ,"Rajasthan" ,"1411"),
         Country_Capital_Currency("Similipal" ,"Odisha" ,"2750"),
         Country_Capital_Currency("Sunderbans" ,"West Bengal" ,"2585"),
         Country_Capital_Currency("Periyar" ,"Kerala" ,"925"),
         Country_Capital_Currency("Sariska" ,"Rajasthan" ,"1213"),
         Country_Capital_Currency("Buxa" ,"West Bengal" ,"758"),
         Country_Capital_Currency("Indravati" ,"Chhattisgarh" ,"2799"),
         Country_Capital_Currency("Namdapha" ,"Arunachal Pradesh" ,"2053"),
         Country_Capital_Currency("Dudhwa" ,"Uttar Pradesh" ,"2202"),
         Country_Capital_Currency("Kalakkad-Mundanthurai" ,"Tamil Nadu" ,"1602"),
         Country_Capital_Currency("Valmiki" ,"Bihar" ,"899"),
         Country_Capital_Currency("Pench" ,"Madhya Pradesh" ,"1180"),
         Country_Capital_Currency("Tadoba" ,"Maharashtra" ,"1728"),
         Country_Capital_Currency("Bandhavgarh" ,"Madhya Pradesh" ,"1598"),
         Country_Capital_Currency("Panna" ,"Madhya Pradesh" ,"1579"),
         Country_Capital_Currency("Dampa" ,"Mizoram" ,"988"),
         Country_Capital_Currency("Bhadra" ,"Karnataka" ,"1064"),
         Country_Capital_Currency("Pakhui" ,"Arunachal Pradesh" ,"1198"),
         Country_Capital_Currency("Nameri" ,"Assam" ,"344"),
         Country_Capital_Currency("Satpura" ,"Madhya Pradesh" ,"2133"),
         Country_Capital_Currency("Anamalai" ,"Tamil Nadu" ,"1480"),
         Country_Capital_Currency("Udanti-Sitanadi" ,"Chhattisgarh" ,"1843"),
        Country_Capital_Currency("Satkosia" ,"Odisha" ,"964"),
         Country_Capital_Currency("Kaziranga" ,"Assam" ,"1174"),
         Country_Capital_Currency("Achanakmar" ,"Chhattisgarh" ,"914"),
        Country_Capital_Currency("Kali" ,"Karnataka" ,"1098"),
         Country_Capital_Currency("Sanjay-Dubri" ,"Madhya Pradesh" ,"1675"),
        Country_Capital_Currency("Mudumalai" ,"Tamil Nadu" ,"689"),
         Country_Capital_Currency("Nagarahole" ,"Karnataka" ,"1206"),
         Country_Capital_Currency("Parambikulam" ,"Kerala" ,"644"),
         Country_Capital_Currency("Sahyadri" ,"Maharashtra" ,"1166"),
         Country_Capital_Currency("Biligiriranga" ,"Karnataka" ,"575"),
         Country_Capital_Currency("Kawal" ,"Telangana" ,"2019"),
        Country_Capital_Currency("Sathyamangalam" ,"Tamil Nadu" ,"1408"),
         Country_Capital_Currency("Mukandra Hills" ,"Rajasthan" ,"760"),
         Country_Capital_Currency("Nawegaon-Nagzira" ,"Maharashtra" ,"1895"),
         Country_Capital_Currency("Nagarjunsagar-Srisailam" ,"Andhra Pradesh" ,"3296"),
         Country_Capital_Currency("Amrabad" ,"Telangana" ,"2611"),
         Country_Capital_Currency("Pilibhit" ,"Uttar Pradesh" ,"730"),
         Country_Capital_Currency("Bor" ,"Maharashtra" ,"816"),
         Country_Capital_Currency("Rajaji" ,"Uttarakhand" ,"1075"),
         Country_Capital_Currency("Orang" ,"Assam" ,"492"),
         Country_Capital_Currency("Kamlang" ,"Arunachal Pradesh" ,"783")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Tiger reserves"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var location : TextView = findViewById(R.id.txt3rowElt2)
        var palacename : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "Tiger Reserve"
        location.text = "State"
        palacename.text ="Total Area (km2)"

        recyclerpalace =findViewById(R.id.recyclercountrycurrencylist)
        recyclerpalace.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofpalace)
        recyclerpalace.adapter = recyclerAdapter
        recyclerpalace.layoutManager =  layoutManager
    }
}
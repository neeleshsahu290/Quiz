package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class PalacesinIndiaActivity : AppCompatActivity() {

    lateinit var recyclerpalace : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofpalace = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Assam","Gurugram","Ahom Raja’s Palace"),
        Country_Capital_Currency("Bihar", "Madhubani", "Navlakha Palace"),
        Country_Capital_Currency( "","Darbhanga", "Nargona Palace"),

                Country_Capital_Currency("Chhattisgarh" ,"Jagdalpur" ,"Bastar Palace"),
                Country_Capital_Currency("","Kawardha" ,"Kawardha Palace"),
                Country_Capital_Currency("","Kanker" ,"Kanker Palace"),

                Country_Capital_Currency("Delhi" ,"Delhi","Rashtrapati Bhawan"),

                Country_Capital_Currency("Ladakh","Leh", "Leh Palace"),
                Country_Capital_Currency("Jammu & Kashmir","Jammu" ,"Mubarak Mandi Palace, Amar Mahal Palace"),

                Country_Capital_Currency("Karnataka" ,"Mysore" ,"Jagan Mohan Palace, Mysore Palace"),

                Country_Capital_Currency("Kerala" ,"Trivandrum", "Kowdiar Palace"),
                Country_Capital_Currency("","Kochi", "Bolgatty Palace"),
                Country_Capital_Currency("","Thrissur" ,"Shakthan Thampuran Palace"),

                Country_Capital_Currency("Madhya Pradesh", "Gwalior" ,"Jai Vilas"),
                Country_Capital_Currency("","Bhopal", "Noor-Us-sabah Palace"),
                Country_Capital_Currency("","Bhopal", "Gohar Mahal"),

                Country_Capital_Currency("Maharashtra" ,"Kolhapur", "Shalini Palace"),
                Country_Capital_Currency("","Pune" ,"Lal Mahal (Red Palace)"),
                Country_Capital_Currency("","Pune" ,"Aga Khan Palace"),
                Country_Capital_Currency("","Aurangabad" ,"Naukhanda Palace"),
                Country_Capital_Currency("","Ahmednagar" ,"Farah Bagh Palace"),

                Country_Capital_Currency("Manipur" ,"Imphal" ,"Kangla Palace"),

                Country_Capital_Currency("Odisha" ,"Lokapada" ,"Aul Palace"),
                Country_Capital_Currency("","Gaja Pati" ,"Brundaban Palace"),


               Country_Capital_Currency("Punjab" ,"Amritstar" ,"Maharaja Ranjit Singh Palace"),

                Country_Capital_Currency("Rajasthan" ,"Jaipur" ,"Rambagh Palace"),
                Country_Capital_Currency("","Jaipur" ,"Jal Mahal"),
        Country_Capital_Currency("","Jaipur" ,"City Palace"),
        Country_Capital_Currency("","Jaipur" ,"Somode Palace"),
                Country_Capital_Currency("","Jaipur" ,"Umaid Bhawan"),
                Country_Capital_Currency("","Jaisalmer" ,"Mandir Palace"),
                Country_Capital_Currency("","Udaipur" ,"Lake Palace, Monsoon Palce(Sajjan Garh Palace), Shiv Niwas Palace, City Palace"),
                Country_Capital_Currency("","Bharatpur", "Laxmi Vilas"),
                Country_Capital_Currency("","Bikaner", "Lalgarh Palace"),

                Country_Capital_Currency("Tamilnadu" ,"Karaikudi" ,"Chettinad Palace House"),
                Country_Capital_Currency("","Kanyakumari", "Padmanabhapuram Palace"),

                Country_Capital_Currency("Telengana" ,"Hyderabad" ,"King Kothi Palace, Falaknuma Palace, Chowmahalla Palace"),

                Country_Capital_Currency("Tripura" ,"Agartala" ,"Ujjayanta Palace, Kunjaban Palace"),
                Country_Capital_Currency("","Melaghar" ,"Neer Mahal(Water Palace)"),
                Country_Capital_Currency("Uttarakhand" ,"Mussoorie" ,"Kasmanda palace"),

                Country_Capital_Currency("Uttar Pradesh" ,"Agra" ,"Fetehpur sikri Palace"),

                Country_Capital_Currency("West Bengal" ,"Kolkatta" ,"Marble Palace"),
                Country_Capital_Currency("","Cooch Behar" ,"Cooch Behar Palace"),
                Country_Capital_Currency("","Murshidabad" ,"Hazarduari Palace")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Palaces in India"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var location : TextView = findViewById(R.id.txt3rowElt2)
        var palacename :TextView = findViewById(R.id.txt3rowElt3)
        state.text = "State"
        location.text = "Location"
        palacename.text ="Palace Name"

        recyclerpalace =findViewById(R.id.recyclercountrycurrencylist)
        recyclerpalace.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofpalace)
        recyclerpalace.adapter = recyclerAdapter
        recyclerpalace.layoutManager =  layoutManager

    }
}
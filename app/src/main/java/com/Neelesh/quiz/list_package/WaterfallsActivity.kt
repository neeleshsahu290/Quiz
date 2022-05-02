package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class WaterfallsActivity : AppCompatActivity() {

    lateinit var recyclerpalace : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofpalace = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Kunchikal Falls" ,"455 metres (1,493 ft)" ,"Shimoga district, Karnataka"),
    Country_Capital_Currency("Barehipani Falls" ,"399 metres (1,309 ft)" ,"Mayurbhanj district, Odisha"),
    Country_Capital_Currency("Langshiang Falls" ,"337 metres (1,106 ft)" ,"West Khasi Hills district, Meghalaya"),
    Country_Capital_Currency("Nohkalikai Falls" ,"335 metres (1,099 ft)" ,"East Khasi Hills district, Meghalaya"),
    Country_Capital_Currency("Nohsngithiang Falls" ,"315 metres (1,033 ft)" ,"East Khasi Hills district, Meghalaya"),
    Country_Capital_Currency("Dudhsagar Falls" ,"310 metres (1,020 ft)" ,"Karnataka, Goa"),
    Country_Capital_Currency("Kynrem Falls" ,"305 metres (1,001 ft)" ,"East Khasi Hills district, Meghalaya"),
    Country_Capital_Currency("Meenmutty Falls" ,"300 metres (980 ft)" ,"Wayanad district, Kerala"),
    Country_Capital_Currency("Thalaiyar Falls" ,"297 metres (974 ft)" ,"Dindigul district, Tamil Nadu"),
    Country_Capital_Currency("Barkana Falls" ,"259 metres (850 ft)" ,"Shimoga district, Karnataka"),
    Country_Capital_Currency("Jog Falls" ,"253 metres (830 ft)" ,"Sagar, Karnataka"),
    Country_Capital_Currency("Khandadhar Falls" ,"244 metres (801 ft)" ,"Sundargarh district, Odisha"),
    Country_Capital_Currency("Vantawng Falls" ,"229 metres (751 ft)" ,"Serchhip district, Mizoram"),
    Country_Capital_Currency("Penchalakona Falls" ,"219 metres (719 ft)" ,"Nellore district, Andhra Pradesh"),
    Country_Capital_Currency("Kune Falls" ,"200 metres (660 ft)" ,"Lonavla, Maharashtra"),
    Country_Capital_Currency("Soochipara Falls" ,"200 metres (660 ft)" ,"Wayanad district, Kerala"),
    Country_Capital_Currency("Magod Falls" ,"198 metres (650 ft)" ,"Uttara Kannada district, Karnataka"),
    Country_Capital_Currency("Hebbe Falls" ,"168 metres (551 ft)" ,"Chikkamagaluru district, Karnataka"),
    Country_Capital_Currency("Duduma Falls" ,"175 metres (574 ft)" ,"Koraput district, Odisha"),
    Country_Capital_Currency("Joranda Falls" ,"157 metres (515 ft)" ,"Mayurbhanj district, Odisha"),
        Country_Capital_Currency("Palani Falls" ,"150 metres (490 ft)" ,"Kullu district, Himachal Pradesh"),
                Country_Capital_Currency("Lodh Falls" ,"143 metres (469 ft)" ,"Latehar district, Jharkhand"),
                Country_Capital_Currency("Bishop Falls" ,"135 metres (443 ft)" ,"Shillong, Meghalaya"),
                Country_Capital_Currency("Chachai Falls" ,"130 metres (430 ft)" ,"Rewa district, Madhya Pradesh"),
                Country_Capital_Currency("Keoti Falls" ,"130 metres (430 ft)" ,"Rewa district, Madhya Pradesh"),
                Country_Capital_Currency("Kalhatti Falls" ,"122 metres (400 ft)" ,"Chikkamagaluru district, Karnataka"),
                Country_Capital_Currency("Beadon Falls" ,"120 metres (390 ft)" ,"Shillong, Meghalaya"),
                Country_Capital_Currency("Keppa Falls" ,"116 metres (381 ft)" ,"Uttara Kannada district, Karnataka"),
                Country_Capital_Currency("Koosalli Falls" ,"116 metres (381 ft)" ,"Udupi, Karnataka"),
                Country_Capital_Currency("Pandavgad Falls" ,"107 metres (351 ft)" ,"Thane, Maharashtra"),
                Country_Capital_Currency("Rajat Prapat" ,"107 metres (351 ft)" ,"Hoshangabad district, Madhya Pradesh"),
                Country_Capital_Currency("Bundla Falls" ,"100 metres (330 ft)" ,"Kangra district, Himachal Pradesh"),
                Country_Capital_Currency("Shivanasamudra Falls" ,"98 metres (322 ft)" ,"Mysore, Karnataka"),
                Country_Capital_Currency("Agaya Gangai" ,"92 metres (302 ft)" ,"Tamil Nadu"),
                Country_Capital_Currency("Lower Ghaghri Falls" ,"98 metres (322 ft)" ,"Latehar district, Jharkhand"),
                Country_Capital_Currency("Hundru Falls" ,"98 metres (322 ft)" ,"Ranchi district, Jharkhand"),
                Country_Capital_Currency("Sweet Falls" ,"98 metres (322 ft)" ,"Shillong, Meghalaya"),
                Country_Capital_Currency("Gatha Falls" ,"91 metres (299 ft)" ,"Panna district, Madhya Pradesh"),
                Country_Capital_Currency("Teerathgarh Falls" ,"91 metres (299 ft)" ,"Baster district, Chhattisgarh"),
                Country_Capital_Currency("Kiliyur Falls" ,"91 metres (299 ft)" ,"Yercaud, Tamil Nadu"),
                Country_Capital_Currency("Kedumari Falls" ,"91 metres (299 ft)" ,"Udupi district, Karnataka"),
                Country_Capital_Currency("Muthyala Maduvu Falls","91 metres (299 ft)" ,"Bangalore, Karnataka"),
                Country_Capital_Currency("Palaruvi Falls" ,"91 metres (299 ft)" ,"Kollam district, Kerala"),
        Country_Capital_Currency("Kuntala Falls" ,"45 metres (148 ft)" ,"Nirmal, Telangana"),
                Country_Capital_Currency("Catherine Falls" ,"250 ft (76 m)" ,"Kotagiri, Tamilnadu"),
                Country_Capital_Currency("Kutladampatti Falls" ,"90 ft (27 m)" ,"Kutladampatti, Tamilnadu"),
                Country_Capital_Currency("Kutralam Falls" ,"167 m (548 ft)" ,"Tirunelveli")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="WATER FALLS"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var location : TextView = findViewById(R.id.txt3rowElt2)
        var palacename : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "Waterfall"
        location.text = "Height"
        palacename.text ="Location"

        recyclerpalace =findViewById(R.id.recyclercountrycurrencylist)
        recyclerpalace.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofpalace)
        recyclerpalace.adapter = recyclerAdapter
        recyclerpalace.layoutManager =  layoutManager
    }
}
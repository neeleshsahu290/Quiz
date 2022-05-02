package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class FatheroffieldsListActivity : AppCompatActivity() {


    lateinit var recyclerHpeak : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofstate = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Politics" ,"Mahatma Gandhi" ,"Father of the Nation"),
        Country_Capital_Currency("Politics", "Raja Ram Mohan Roy" ,"Father of Modern India"),
        Country_Capital_Currency("Politics" ,"Potti Sreeramulu" ,"Father of Linguistic Democracy"),
        Country_Capital_Currency("Politics" ,"B.R Ambedkar(Bhimrao Ramji Ambedkar)", "Father of Constitution"),
        Country_Capital_Currency("Economics" ,"M.G.Ranade(Mahadev Govind Ranade)" ,"Father of Modern Economics") ,
        Country_Capital_Currency("Economics" ,"Manmohan Singh" ,"Father of Modern Economic Reforms" ),
        Country_Capital_Currency("Science", "Homi J.Bhabha" ,"Father of Nuclear/Atomic Program" ),
        Country_Capital_Currency("Science" ,"Vikram Sarabhai" ,"Father of Space Program"),
        Country_Capital_Currency("Science","A. P. J. Abdul Kalam (Avul Pakir Jainulabdeen Abdul Kalam)" ,"Father of Missile Program"),
        Country_Capital_Currency("Comics" ,"Anant Pai" ,"Father of Comic Books" ),
        Country_Capital_Currency("Geography" ,"James Rennell" ,"Father of Geography"),
        Country_Capital_Currency("Cinema" ,"Dadasaheb Phalke(Dhundiraj Govind Phalke)" ,"Father of Cinema"),
        Country_Capital_Currency("Agriculture", "N. G. Ranga(Gogineni Ranga Nayukulu)" ,"Father of Peasant Movement"),
        Country_Capital_Currency("Biology" ,"Birbal Sahni" ,"Father of Paleobotany"),
        Country_Capital_Currency("Biology", "Dr. Arun Krishnsnan and Hiralal Chaudhari" ,"Father of Blue Revolution"),
        Country_Capital_Currency("Biology"," M. S. Swaminathan(Mankombu Sambasivan Swaminathan)" ,"Father of Green Revolution"),
        Country_Capital_Currency("Biology" ,"Verghese Kurien" ,"Father of White Revolution"),
        Country_Capital_Currency("Biology" ,"Shalihotra" ,"Father of Veterinary Science"),
        Country_Capital_Currency("Enterperneur" ,"J. R. D. Tata(Jehangir Ratanji Dadabhoy Tata)" ,"Father of Civil Aviation"),
        Country_Capital_Currency("Military" ,"Subroto Mukerjee" ,"Father of Air Force"),
        Country_Capital_Currency("Military"	,"Chhatrapati Shivaji Maharaj"	,"Father Of Indian Navy"),
        Country_Capital_Currency("Engineering" ,"Sir Mokshagundam Vishweshvaraiah" ,"Father of Civil Engineering"),
        Country_Capital_Currency("Medicine"	,"Sushruta"	,"Father of Surgery"),
        Country_Capital_Currency("Medicine"	,"Durgesh Patel"	,"father of Pink Revolution in India"),
        Country_Capital_Currency("Agriculture / Horicuture"	,"Indira Gandhi"	,"father of Silver Revolution" ),
        Country_Capital_Currency("Agriculture"	,"Nirpakh Tutaj"	,"father of Gold Revolution"),
        Country_Capital_Currency("Agriculture / Horicuture"	,"Sam Pitroda"	,"father of Yellow Revolution"),
        Country_Capital_Currency("Horicuture / Beef cattle"	,"Vishal Tewari"	,"father of Red Revolution")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Father of Various Fields"

        val state : TextView = findViewById(R.id.txt3rowElt1)
        val lang : TextView = findViewById(R.id.txt3rowElt2)
        val lang2 : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "Field"
        lang.text = "Name"
        lang2.text ="Title"

        recyclerHpeak =findViewById(R.id.recyclercountrycurrencylist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofstate)
        recyclerHpeak.adapter = recyclerAdapter
        recyclerHpeak.layoutManager =  layoutManager
    }
}
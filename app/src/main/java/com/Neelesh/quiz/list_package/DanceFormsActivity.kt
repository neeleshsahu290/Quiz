package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class DanceFormsActivity : AppCompatActivity() {


    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(
        State_Capital("Andhra Pradesh" ,"Kuchipudi , Kottam"),
        State_Capital("Assam","Ojapali, Bihu, Ankia Na"),
    State_Capital("Arunachal Pradesh","Lion and Peacock dance, Chalo, Popir, Bardo Chham, Aji Lamu"),
    State_Capital("Bihar","Jata Jatin, Faguna or Fag, Purbi, Bidesia"),
    State_Capital("Chhatisgarh","Panthi, Raut Nacha"),
    State_Capital("Gujarat","Dandya Ras, Garba Lasya Nritya, Bhavai, Garba, Rasila, Trippan"),
    State_Capital("Goa","Fugdi, Dekhnni, Tarangamel , Dhalo"),
    State_Capital("Haryana:"  ,"Swang, Khoria, Gugga dance, Loor, Sang, Dhama"), State_Capital("Himachal Pradesh"  ,"Luddi Dance, Munzra, Kanayala, Giddha Parhaun, Hikat"), State_Capital("Jammu and Kashmir" , "Rouf, Chakri"),
    State_Capital("Jharkhand" ,"Karma"),
    State_Capital("Karnataka" , "Yakshagana, Bayalata, Simha Nutrya, Dollu Kunitha, Veeragase"),
    State_Capital("Kerala" , "Chakiarkoothu, Kathakali, Mohiniattam, Ottam Thullal, Chavittu Natakam, Kaikotti Kalai, Koodiyattam, Krishnavattam, Mudiyettu, Tappatri Kai, Theyyam"),
    State_Capital("Lakshadweep" ,"Lava"),
    State_Capital("Madhya Pradesh"  ,"Macha, Lota, Pandvan, Tertali, Charkula, Jawara, Matki dance, Phulpatti dance, Grida dance, Maanch, Gaur maria dance"),
    State_Capital("Mizoram"  ,"Chiraw (Bamboo Dance)"),
    State_Capital("Manipur"  ,"Thang ta, Dhol cholom, Manipuri"),
    State_Capital("Maharashtra"  ,"Tamasha, Dahi Kala, Lavani, Lezim"),
    State_Capital("Odisha" , "Odissi, Savari, Ghumara, Paik, Chhau, Gotipua, Sambalpur"),
    State_Capital("Puducherry" , "Garadi"),
    State_Capital("Punjab"  ,"Bhangra, Giddha, Daff, Dhaman, Malwai, Jhumar, Karthi, Kikli, Sammi, Dandass, Ludi, Jindua"),
    State_Capital("Rajasthan" , "Ghumar, Chakri, Gangaur, Jhulan, Leela, Jhuma, Suisini, Ghapal, Kalbelia"),
    State_Capital("Sikkim"  ,"Singhi chham, Yak Chaam, Maruni, Rechungma"),
    State_Capital("Tamil Nadu"  ,"Bharatnatyam, Kumi, Kolattam, Kavadi, Karagattam, Theru koothu, Bommal attam, Puliyaattam, Oyilattam"),
    State_Capital("Telangana"  ,"Perini Thandavam, Dappu, Lambadi"),
    State_Capital("Tripura"  ,"Hojagiri, Goria, Lebang Boomani"),
    State_Capital("Uttarakhand"  ,"Chholiya, Jagars, Thali-Jadda, Jhainta, Barada Nat"),
    State_Capital("Uttar Pradesh"  ,"Nautanki, Raslila, Kajri, Jhora, Chhapeli, Jaita"),
    State_Capital("West Bengal"  ,"Jatra, Chau, Kathi")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="States And Their Dance Forms"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="State"
        bank.text = "Dance Form"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager = layoutManager
    }
}
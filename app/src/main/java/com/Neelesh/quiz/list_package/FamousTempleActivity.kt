package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class FamousTempleActivity : AppCompatActivity() {
    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofpark = arrayListOf<State_Capital>(

        State_Capital("Akshardham Temple"  ,"Delhi"),
                State_Capital("Amarkantak Temple" ,"Chhattisgarh"),
                State_Capital("Amarnath Cave Temple" ,"Jammu & Kashmir"),
                State_Capital("Angrabadi Temple","Jharkhand"),
                State_Capital("Annamalaiyar Temple" ,"Tamil Nadu"),
                State_Capital("Badrinath Temple" ,"Uttarakhand"),
                State_Capital("Brihadeeswara Temple" ,"Tamil Nadu"),
                State_Capital("Chennakesava Temple" ,"Karnataka"),
                State_Capital("Durgiana Temple" ,"Punjab"),
                State_Capital("Dwarkadhish Temple" ,"Gujarat"),
                State_Capital("Gangotri Temple" ,"Uttarakhand"),
                State_Capital("Golden Temple" ,"Punjab"),
                State_Capital("Gomateshwara Temple" ,"Karnataka"),
                State_Capital("Hoysaleswara Temple" ,"Karnataka"),
                State_Capital("Iskcon Temple" ,"Uttar Pradesh"),
                State_Capital("Kalighat Mandir" ,"West Bengal"),
                State_Capital("Kamakhya Temple" ,"Assam"),
                State_Capital("Kanaka Temple" ,"Andhra Pradesh"),
                State_Capital("Kanchipuram Temples" ,"Tamil Nadu"),
                State_Capital("Kashi Vishwanath Temple" ,"Uttar Pradesh"),
                State_Capital("Kedarnath Temple" ,"Uttarakhand"),
                State_Capital("Khajuraho Temple" ,"Madhya Pradesh"),
                State_Capital("Konark Sun Temple" ,"Odisha"),
                State_Capital("Kumbakonam Temples" ,"Tamil Nadu"),
                State_Capital("Laxminarayan Temple" ,"Delhi"),
                State_Capital("Lingaraja Temple" ,"Odisha"),
                State_Capital("Lord Jagannath Temple" ,"Odisha"),
                State_Capital("Lotus Temple" ,"New Delhi"),
                State_Capital("Malinithan Temple" ,"Arunachal Pradesh"),
                State_Capital("Manikaran Temple" ,"Himachal Pradesh"),
                State_Capital("Meenakshi Temple" ,"Tamil Nadu"),
                State_Capital("Nellaiappar Temple" ,"Tamil Nadu"),
                State_Capital("Ram Tirath Temple" ,"Punjab"),
                State_Capital("Ramanathaswamy (Rameshwaram) Temple" ,"Tamil Nadu"),
                State_Capital("Ranakpur Temple" ,"Rajasthan"),
                State_Capital("Sabarimala Temple" ,"Kerala"),
                State_Capital("Sanchi Stupa" ,"Madhya Pradesh"),
                State_Capital("Shankaracharya Temple" ,"Jammu & Kashmir"),
            State_Capital("Shirdi Sai Baba Temple" ,"Maharashtra"),
    State_Capital("Shri Digambar Jain Lal Mandir" ,"Delhi"),
    State_Capital("Siddhivinayak Temple" ,"Maharashtra"),
    State_Capital("Somnath Temple" ,"Gujarat"),
    State_Capital("Sree Padmanabhaswamy Temple" ,"Kerala"),
    State_Capital("Thillai Nataraja Temple" ,"Tamil Nadu"),
    State_Capital("Tirupati Balaji" ,"Andhra Pradesh"),
    State_Capital("Vaishno Devi" ,"Jammu & Kashmir"),
    State_Capital("Virupaksha Temple" ,"Karnataka"),
    State_Capital("Yamunotri Temple" ,"Uttarakhand")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Famous Temples"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Temple"
        bank.text = "State"

        recyclerNationalpark=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
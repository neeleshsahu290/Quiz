package com.Neelesh.quiz.generalscience

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class ElementActivity : AppCompatActivity() {

    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("Agra" ,"Sikandar Lodi" ,"Uttar Pradesh" ,"In 1504"),
        City_Founders4("Ahmedabad" ,"Ahmed Shah I" ,"Gujarat" ,"In 1411"),
        City_Founders4("Ajmer" ,"Ajayraja II (Son of Prithviraj I)" ,"Rajasthan",""),
        City_Founders4("Prayagraj Allahabad (as ILLAHABAS)","Akbar" ,"Uttar Pradesh" ,"In 1575"),
        City_Founders4("Ambala" ,"Amba Rajput King" ,"Punjab" ,"During 14th century"),
        City_Founders4("Amritsar" ,"Guru Ram Das (4 th Â Sikh Guru)" ,"Punjab" ,"In 1574"),
        City_Founders4("Bijapur (Vijayapura)" ,"Yosuf Adil Shah" ,"Karnataka",""),
        City_Founders4("Bikaner" ,"Rao Bika" ,"Rajasthan" ,"In 1488"),
        City_Founders4("Faizabad" ,"Founded by Ali Vardi Khan, nawab of Bengal, The foundation was laid by Saadat Khan, the second Nawab of Awadh" ,"Uttar Pradesh" ,"In 1730"),
        City_Founders4("Fatehpur Sikri" ,"Akbar" ,"Uttar Pradesh" ,"In 1569"),
        City_Founders4("Ghaziabad" ,"Wazir Ghazi-ud-din" ,"Uttar Pradesh" ,"In1740"),
        City_Founders4("Hampi" ,"Harihara Raya I, Bukka Raya I" ,"Karnataka",""),
        City_Founders4("Hyderabad" ,"Md.Quli Qutub Shah" ,"Telangana" ,"In 1589"),
        City_Founders4("Jaipur" ,"RajaÂ Jai Singh II" ,"Rajasthan" ,"In 1727"),
        City_Founders4("Jaunpur" ,"Feroz Shah Tuglaq" ,"Uttar Pradesh" ,"In 1359"),
        City_Founders4("Jodhpur" ,"Rao Jodha" ,"Rajasthan" ,"In 1459"),
        City_Founders4("Madras" ,"Francis Day and Andrew Cogan" ,"Tamil Nadu" ,"In 1640"),
        City_Founders4("Muradabad" ,"Rustam Khan" ,"Uttar Pradesh" ,"In 1625"),
        City_Founders4("Pondicherry" ,"FranÃ§ois Martin" ,"Union Territory" ,"In 1674"),
        City_Founders4("Srinagar" ,"Pravarsena II" ,"Jammu & Kashmir",""),
        City_Founders4("Tuglaqabad" ,"Ghiasuddin Tughlak" ,"Delhi" ,"In 1320"),
        City_Founders4("Vijayanagar" ,"Harihara I and Bukka Raya I" ,"Karnataka" ,"In 1336"),
        City_Founders4("Warangal" ,"Beta Raja I" ,"Andhra Pradesh" ,"12th century")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="Cities & Their Founders"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager
    }
}
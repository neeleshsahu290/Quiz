package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class RevolutionsinindiaActivity : AppCompatActivity() {

    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("Green Revolution" ,"Agriculture" ,"Mr. M.S.Swaminathan" ,"1966 - 1967"),
        City_Founders4("White Revolution or Operation flood" ,"Milk/Dairy products" ,"Mr. Verghese Kurien","1970 - 1996"),
        City_Founders4("Blue Revolution" ,"Fish & Aqua" ,"Mr. Dr.Arun Krishnan","1973-2002"),
        City_Founders4("Golden Revolution" ,"Fruits, Honey, Horticulture" ,"Mr. Nirpakh Tutej","1991- 2003"),
        City_Founders4("Silver Revolution" ,"Eggs" ,"Mrs. Indira Gandhi","2000's"),
        City_Founders4("Yellow Revolution" ,"Oil Seeds" ,"Mr. Sam Pitroda","1986 - 1990"),
        City_Founders4("Pink Revolution" ,"Pharmaceuticals, Prawns, Onion" ,"Mr. Durgesh Patel","1970's"),
        City_Founders4("Brown Revolution" ,"Leather, Coco" ,"Mr. Hirlal Chaudri",""),
        City_Founders4("Red Revolution" ,"Meat, Tomato" ,"Mr. Vishal Tewari","1980's"),
        City_Founders4("Golden Fibre Revolution" ,"Jute","","1990's"),
        City_Founders4("Evergreen Revolution" ,"Overall Production of Agriculture." ,"M.S.Swaminathan","2014 - 2022"),
        City_Founders4("Black Revolution" ,"Petroleum","",""),
        City_Founders4("Silver Fiber Revolution" ,"Cotton","", "2000's"),
        City_Founders4("Round Revolution" ,"Potato","","1965- 2005"),
        City_Founders4("Protein Revolution" ,"Agriculture (Higher Production)" ,"Coined by Mr. Narendra Modi","2014 - 2020"),
        City_Founders4("Grey Revolution" ,"Fertilizers","","1960's - 1970's")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="Revolutions in India"


        val damname: TextView =findViewById(R.id.txt4rowElt1)
        val stale : TextView = findViewById(R.id.txt4rowElt2)
        val river : TextView = findViewById(R.id.txt4rowElt3)
        val year : TextView = findViewById(R.id.txt4rowElt4)
        damname.text = "Revolution"
        stale.text = "Field / Product"
        river.text="Father of Revolutions"
        year.text="Period"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager

    }
}
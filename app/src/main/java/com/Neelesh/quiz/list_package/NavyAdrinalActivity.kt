package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.SNOAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class NavyAdrinalActivity : AppCompatActivity() {


    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1" ,"Mr. Sir Charles Thomas Mark Pizey","1995"),
        Country_Capital_Currency("2" ,"Sir Stephen Hope Carlill ( vice admiral )","1955-1958"),
        Country_Capital_Currency("3" ,"Mr. Ram Dass Katari (Vice Admiral)","1958-1962"),
        Country_Capital_Currency("4" ,"Mr. Bhaskar Sadashiv Soman","1962-1966"),
        Country_Capital_Currency("5" ,"Mr. Adhar Kumar Chatterji","1966-1970"),
        Country_Capital_Currency("6" ,"Mr. Sardarilal Mathradas Nanda","1970-1973"),
        Country_Capital_Currency("7" ,"Mr. Sourendra Nath Kohli","1973-1976"),
        Country_Capital_Currency("8" ,"Mr. Jal Cursetji","1976-1979"),
        Country_Capital_Currency("9" ,"Mr. Ronald Lynsdale Pereira","1979-1982"),
        Country_Capital_Currency("10" ,"Mr. Oscar Stanley Dawson","1982-1984"),
        Country_Capital_Currency("11" ,"Mr. Radhakrishna Hariram Tahiliani","1984-1987"),
        Country_Capital_Currency("12" ,"Mr. Jayant Ganpat Nadkarni","1987-1990"),
        Country_Capital_Currency("13" ,"Mr. Laxminarayan Ramdas","1990-1993"),
        Country_Capital_Currency("14" ,"Mr. Vijai Singh Shekhawat","1993-1996"),
        Country_Capital_Currency("15" ,"Mr. Vishnu Bhagwat","1996-1998"),
        Country_Capital_Currency("16" ,"Mr. Sushil Kumar","1998-2001"),
        Country_Capital_Currency("17" ,"Mr. Madhvendra Singh","2001-2004"),
        Country_Capital_Currency("18" ,"Mr. Arun Prakash","2004-2006"),
        Country_Capital_Currency("19" ,"Mr. Sureesh Mehta","2006-2009"),
        Country_Capital_Currency("20" ,"Mr. Nirmal Kumar Verma","2009-2012"),
        Country_Capital_Currency("21" ,"Mr. Devendra Kumar Joshi","2012-2014"),
        Country_Capital_Currency("22" ,"Mr. Robin K Dhowan","2014-2016"),
        Country_Capital_Currency("23" ,"Mr. Sunil Lanba","2016 - 2019"),
        Country_Capital_Currency("24","Karambir Singh","2019 - Till Now")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="INDIAN NAVY ADMIRALS"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
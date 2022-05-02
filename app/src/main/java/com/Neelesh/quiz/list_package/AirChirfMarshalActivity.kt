package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.SNOAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class AirChirfMarshalActivity : AppCompatActivity() {


    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1" ,"Sir Thomas Elmhirst","1947-1950"),
        Country_Capital_Currency("2" ,"Sir Ronald Ivelaw-Chapman","1950-1951"),
        Country_Capital_Currency("3" ,"Gerald Gibbs","1951-1954"),
        Country_Capital_Currency("4" ,"Subroto Mukerjee", "1954-1960"),
        Country_Capital_Currency("5" ,"Aspy Engineer","1960-1964"),
        Country_Capital_Currency("6" ,"Arjan Singh","1964-1969"),
        Country_Capital_Currency("7" ,"Pratap Chandra Lal","1969-1973"),
        Country_Capital_Currency("8" ,"Om Prakash Mehra","1973-1976"),
        Country_Capital_Currency("9" ,"Hrushikesh Moolgavkar","1976-1978"),
        Country_Capital_Currency("10" ,"Idris Latif","1978-1981"),
        Country_Capital_Currency("11" ,"Dilbagh Singh","1981-1984"),
        Country_Capital_Currency("12" ,"Lakshman Mohan Katre","1984-1985"),
        Country_Capital_Currency("13" ,"Denis Anthony La Fontaine","1985-1988"),
        Country_Capital_Currency("14" ,"Surinder Mehra","1988-1991"),
        Country_Capital_Currency("15" ,"Nirmal Chandra Suri","1991-1993"),
        Country_Capital_Currency("16" ,"Swaroop Kaul","1993-1995"),
        Country_Capital_Currency("17" ,"Satish Kumar Sareen","1995-1998"),
        Country_Capital_Currency("18" ,"Anil Yashwant Tipnis","1998-2001"),
        Country_Capital_Currency("19" ,"Srinivasapuram Krishnaswamy","2001-2004"),
        Country_Capital_Currency("20" ,"Shashindra Pal Tyagi","2004-2007"),
        Country_Capital_Currency("21" ,"Fali Homi Major","2007-2009"),
        Country_Capital_Currency("22" ,"Pradeep Vasant Naik","2009-2011"),
        Country_Capital_Currency("23" ,"Anil Kumar Browne","2011-2013"),
        Country_Capital_Currency("24" ,"Arup Raha","2013-2016"),
        Country_Capital_Currency("25" ,"Birender Singh Dhanoa","2016 - 2019"),
        Country_Capital_Currency("26", "Rakesh Kumar Singh Bhadauria","2019 - Till Date")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="INDIAN AIR CHIEF MARSHALS"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
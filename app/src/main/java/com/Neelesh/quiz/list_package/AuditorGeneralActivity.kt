package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.SNOAdaptor
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency
import com.Neelesh.quiz.data_class.State_Capital

class AuditorGeneralActivity : AppCompatActivity() {
    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1." ,"V. Narahari Rao","1949 - 1954"),
        Country_Capital_Currency("2." ,"A. K. Chanda","1954 - 1960"),
        Country_Capital_Currency("3." ,"A. K. Roy","1960 - 1966"),
        Country_Capital_Currency("4." ,"S. Ranganathan","1966 - 1972"),
        Country_Capital_Currency("5." ,"A. Bakshi","1972 - 1978"),
        Country_Capital_Currency("6.", "Gian Prakash","1978 - 1984"),
        Country_Capital_Currency("7." ,"T. N. Chaturvedi","1984 -1990"),
        Country_Capital_Currency("8." ,"C. G. Somiah","1990 - 1996"),
        Country_Capital_Currency("9." ,"V. K. Shunglu","1996 -2002"),
        Country_Capital_Currency("10." ,"VN Kaul","2002 - 2008"),
        Country_Capital_Currency("11." ,"Vinod Rai","2008 - 2013"),
        Country_Capital_Currency("12." ,"Shashi Kant Sharma","2013 - 2017"),
        Country_Capital_Currency("13." ,"Rajiv Mehrishi,","2017 - Present")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="Comptroller and Auditor General of India"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
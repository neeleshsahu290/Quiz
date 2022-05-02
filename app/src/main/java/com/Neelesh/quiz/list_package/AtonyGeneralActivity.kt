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

class AtonyGeneralActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1." ,"Mr. M. C. Setalvad","1950-1963"),
        Country_Capital_Currency("2." ,"Mr. C. K. Daphtary","1963-1968"),
        Country_Capital_Currency("3." ,"Mr. Niren De","1968-1977"),
        Country_Capital_Currency("4." ,"Mr. S. V. Gupte","1977-1979"),
        Country_Capital_Currency("5." ,"Mr. L. N. Sinha","1979-1983"),
        Country_Capital_Currency("6." ,"Mr. K. Parasaran","1983-1989"),
        Country_Capital_Currency("7." ,"Mr. Soli Sorabjee","1989-1990"),
        Country_Capital_Currency("8." ,"Mr. G. Ramaswamy","1990-1992"),
        Country_Capital_Currency("9." ,"Mr. Milon K. Banerji","1992-1996"),
        Country_Capital_Currency("10." ,"Mr. Ashok Desai","1996-1998"),
        Country_Capital_Currency("11." ,"Mr. Soli Sorabjee","1998-2004"),
        Country_Capital_Currency("12." ,"Mr. Milon K. Banerji","2004-2009"),
        Country_Capital_Currency("13." ,"Mr. Goolam Essaji Vahanvati","2009-2014"),
        Country_Capital_Currency("14." ,"Mr. Mukul Rohatgi","2014-2017"),
        Country_Capital_Currency("15." ,"Mr. K. K. Venugopal","2017 - Till Now")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="Attorney Generals of India"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
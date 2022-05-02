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

class CbiDirectorActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1." ,"D. P. Kohli", "1963–1968"),
   Country_Capital_Currency("2."  ,"F. V. Arul", "1968-1971"),
    Country_Capital_Currency("3.",  "D. Sen","1971-1977"),
    Country_Capital_Currency("4."  ,"S. N. Mathur","1977"),
    Country_Capital_Currency("5.",  "C. V. Narsimhan","1977"),
    Country_Capital_Currency("6."  ,"John Lobo","1977-1979"),
    Country_Capital_Currency("7."  ,"R. D. Singh","1979-1980"),
    Country_Capital_Currency("8."  ,"J. S. Bajwa","1980-1985"),
    Country_Capital_Currency("9."  ,"M. G. Katre","1985-1989"),
    Country_Capital_Currency("10."  ,"A. P. Mukherjee","1989-1990"),
    Country_Capital_Currency("11." ,"R. Sekhar","1990"),
    Country_Capital_Currency("12."  ,"Vijay Karan","1990-1992"),
    Country_Capital_Currency("13."  ,"S. K. Datta","1992-1993"),
    Country_Capital_Currency("14."  ,"K. V. R. Rao","1993-1996"),
    Country_Capital_Currency("15."  ,"Joginder Singh","1996-1997"),
    Country_Capital_Currency("16."  ,"R. C. Sharma","1997-1998"),
    Country_Capital_Currency("17."  ,"D. R. Karthikeyan","1998"),
    Country_Capital_Currency("18."  ,"T. N. Mishra","1998-1999"),
    Country_Capital_Currency("19."  ,"R. K. Raghavan","1999-2001"),
    Country_Capital_Currency("20."  ,"P. C. Sharma","2001-2003"),
    Country_Capital_Currency("21."  ,"U. S. Misra","2003-2005"),
    Country_Capital_Currency("22."  ,"Vijay Shanker Tiwari","2005-2008"),
    Country_Capital_Currency("23."  ,"Ashwani Kumar","2008-2010"),
    Country_Capital_Currency("24."  ,"A P Singh","2010-2012"),
    Country_Capital_Currency("25."  ,"Ranjit Sinha","2012-2014"),
    Country_Capital_Currency("26."  ,"Anil Sinha","2014-2016"),
    Country_Capital_Currency("27." , "Rakesh Asthana (Acting Director)","2016-2017"),
    Country_Capital_Currency("28."  ,"Alok Verma","2017-2019"),
        Country_Capital_Currency("29." ,"Rishi Kumar Shukla","2019-Present")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="CBI Directors of India"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager

        
    }
}
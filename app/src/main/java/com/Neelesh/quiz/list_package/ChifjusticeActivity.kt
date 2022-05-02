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

class ChifjusticeActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1." ,"H. J. Kania","1950-1951"),
        Country_Capital_Currency("2."  ,"M. Patanjali Sastri","1951-1954"),
        Country_Capital_Currency("3."  ,"Mehr Chand Mahajan","1954"),
        Country_Capital_Currency("4."  ,"Bijan Kumar Mukherjea", "1954-1956"),
        Country_Capital_Currency("5."  ,"Sudhi Ranjan Das", "1956-1959"),
        Country_Capital_Currency("6."  ,"Bhuvaneshwar Prasad Sinha", "1959-1964"),
        Country_Capital_Currency("7."  ,"P. B. Gajendragadkar", "1964-1966"),
        Country_Capital_Currency("8."  ,"Amal Kumar Sarkar","1966"),
        Country_Capital_Currency("9."  ,"Koka Subba Rao","1966-1967"),
        Country_Capital_Currency("10." ,"Kailas Nath Wanchoo","1967-1968"),
        Country_Capital_Currency("11." ,"Mohammad Hidayatullah[10]","1968-1970"),
        Country_Capital_Currency("12." ,"Jayantilal Chhotalal Shah","1970-1971"),
        Country_Capital_Currency("13." ,"Sarv Mittra Sikri","1971-1973"),
        Country_Capital_Currency("14."  ,"Ajit Nath Ray","1973-1977"),
        Country_Capital_Currency("15."  ,"Mirza Hameedullah Beg","1977-1978"),
        Country_Capital_Currency("16."  ,"Yeshwant Vishnu Chandrachud","1978-1985"),
        Country_Capital_Currency("17." ,"Prafullachandra Natwarlal Bhagwati","1985-1986"),
        Country_Capital_Currency("18."  ,"Raghunandan Swarup Pathak","1986-1989"),
        Country_Capital_Currency("19."  ,"Engalaguppe Seetharamiah Venkataramiah","1989"),
        Country_Capital_Currency("20."  ,"Sabyasachi Mukharji","1989-1990"),
        Country_Capital_Currency("21." , "Ranganath Misra","1990-1991"),
        Country_Capital_Currency("22."  ,"Kamal Narain Singh","1991"),
        Country_Capital_Currency("23."  ,"Madhukar Hiralal Kania","1991-1992"),
        Country_Capital_Currency("24."  ,"Lalit Mohan Sharma", "1992-1993"),
        Country_Capital_Currency("25."  ,"Manepalli Narayana Rao Venkatachaliah","1993-1994"),
        Country_Capital_Currency("26."  ,"Aziz Mushabber Ahmadi","1994-1997"),
        Country_Capital_Currency("27."  ,"Jagdish Sharan Verma", "1997-1998"),
        Country_Capital_Currency("28."  ,"Madan Mohan Punchhi","1998"),
        Country_Capital_Currency("29."  ,"Adarsh Sein Anand", "1998-2001"),
        Country_Capital_Currency("30."  ,"Sam Piroj Bharucha","2001-2002"),
        Country_Capital_Currency("31."  ,"Bhupinder Nath Kirpal","2002"),
        Country_Capital_Currency("32."  ,"Gopal Ballav Pattanaik","2002"),
        Country_Capital_Currency("33."  ,"V. N. Khare","2002-2004"),
        Country_Capital_Currency("34."  ,"S. Rajendra Babu","2004"),
        Country_Capital_Currency("35."  ,"Ramesh Chandra Lahoti","2004-2005"),
        Country_Capital_Currency("36."  ,"Yogesh Kumar Sabharwal","2005-2007"),
        Country_Capital_Currency("37."  ,"K. G. Balakrishnan", "2007-2010"),
        Country_Capital_Currency("38."  ,"S. H. Kapadia","2010-2012"),
        Country_Capital_Currency("39."  ,"Altamas Kabir", "2012-2013"),
        Country_Capital_Currency("40."  ,"P. Sathasivam","2013-2014"),
        Country_Capital_Currency("41."  ,"Rajendra Mal Lodha", "2014"),
        Country_Capital_Currency("42."  ,"H. L. Dattu","2014-2015"),
        Country_Capital_Currency("43."  ,"T. S. Thakur","2015-2017"),
       Country_Capital_Currency("44."  ,"J. S. Khehar", "2017"),
        Country_Capital_Currency("45."  ,"Dipak Misra","2017-2018"),
        Country_Capital_Currency("46."  ,"Ranjan Gogoi","2018-2019"),
        Country_Capital_Currency("47."  ,"Sharad Arvind Bobde","2019 - Till date")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_two_row)
        title="CHIEF JUSTICE OF INDIA"

        recyclerNationalpark=findViewById(R.id.recyclersnorowtwo)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = SNOAdaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
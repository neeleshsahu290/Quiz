package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class DamListActivity : AppCompatActivity() {

    lateinit var recyclerdamlist : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofdams = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("Nizam Sagar Dam" ,"Telangana"," Manjira River"),
                Country_Capital_Currency("Somasila Dam" ,"Andhra Pradesh" ,"Pennar River"),
                Country_Capital_Currency("Srisailam Dam" ,"Andhra Pradesh" ,"Krishna River"),
                Country_Capital_Currency("Singur dam" ,"Telangana" ,"Manjira River"),
                Country_Capital_Currency("Ukai Dam" ,"Gujarat" ,"Tapti River"),
                Country_Capital_Currency("Dharoi Dam" ,"Gujarat" ,"Sabarmati River"),
                Country_Capital_Currency("Kadana dam" ,"Gujarat" ,"Mahi River"),
                Country_Capital_Currency("Dantiwada Dam" ,"Gujarat" ,"Banas River"),
                Country_Capital_Currency("Pandoh Dam" ,"Himachal Pradesh" ,"Beas River"),
                Country_Capital_Currency("Bhakra Nangal Dam" ,"Himachal Pradesh and Punjab Border" ,"Sutlej River"),
                Country_Capital_Currency("Nathpa Jhakri Dam" ,"Himachal Pradesh" ,"Satluj River"),
                Country_Capital_Currency("Chamera Dam" ,"Himachal Pradesh" ,"Ravi River"),
                Country_Capital_Currency("Baglihar Dam" ,"Jammu and Kashmir" ,"Chenab River"),
                Country_Capital_Currency("Dumkhar Hydroelectric Dam" ,"Jammu and Kashmir" ,"Indus River"),
                Country_Capital_Currency("Uri Hydroelectric Dam" ,"Jammu and Kashmir" ,"Jhelum River"),
                Country_Capital_Currency("Maithon Dam" ,"Jharkhand" ,"Barakar River"),
                Country_Capital_Currency("Chandil Dam" ,"Jharkhand" ,"Swarnarekha River"),
                Country_Capital_Currency("Panchet Dam" ,"Jharkhand" ,"Damodar River"),
                Country_Capital_Currency("Tunga Bhadra Dam" ,"Karnataka" ,"Tungabhadra River"),
                Country_Capital_Currency("Linganamakki dam" ,"Karnataka" ,"Sharavathi River"),
                Country_Capital_Currency("Kadra Dam" ,"Karnataka" ,"Kalinadi River"),
                Country_Capital_Currency("Alamatti Dam" ,"Karnataka" ,"Krishna River"),
        Country_Capital_Currency("Supa Dam" ,"Karnataka" ,"Kalinadi or Kali river"),
                Country_Capital_Currency("Krishna Raja Sagara Dam" ,"Karnataka" ,"Kaveri River"),
                Country_Capital_Currency("Harangi Dam" ,"Karnataka" ,"Harangi River"),
                Country_Capital_Currency("Narayanpur Dam" ,"Karnataka" ,"Krishna River"),
                Country_Capital_Currency("Kodasalli Dam" ,"Karnataka" ,"Kali River"),
                Country_Capital_Currency("Malampuzha Dam" ,"Kerala" ,"Malampuzha River"),
                Country_Capital_Currency("Peechi Dam" ,"Kerala" ,"Manali River"),
                Country_Capital_Currency("Idukki Dam" ,"Kerala" ,"Periyar River"),
                Country_Capital_Currency("Kundala Dam" ,"Kerala" ,"Kundala Lake"),
                Country_Capital_Currency("Parambikulam Dam" ,"Kerala" ,"Parambikulam River"),
                Country_Capital_Currency("Walayar Dam" ,"Kerala" ,"Walayar River"),
                Country_Capital_Currency("Mullaperiyar Dam" ,"Kerala" ,"Periyar River"),
                Country_Capital_Currency("Neyyar Dam" ,"Kerala" ,"Neyyar River"),
                Country_Capital_Currency("Rajghat Dam" ,"Uttar Pradesh and Madhya Pradesh Border" ,"Betwa River"),
                Country_Capital_Currency("Barna Dam" ,"Madhya Pradesh" ,"Barna River"),
                Country_Capital_Currency("Bargi Dam" ,"Madhya Pradesh" ,"Narmada River"),
                Country_Capital_Currency("Bansagar Dam" ,"Madhya Pradesh" ,"Sone River"),
                Country_Capital_Currency("Gandhi Sagar Dam" ,"Madhya Pradesh" ,"Chambal River"),
                Country_Capital_Currency("Yeldari Dam" ,"Maharashtra" ,"Purna river"),
                Country_Capital_Currency("Ujani Dam" ,"Maharashtra" ,"Bhima River"),
                Country_Capital_Currency("Pawna Dam" ,"Maharashtra" ,"Maval River"),
                Country_Capital_Currency("Mulshi Dam" ,"Maharashtra" ,"Mula River"),
                Country_Capital_Currency("Koyna Dam" ,"Maharashtra" ,"Koyna River"),
                Country_Capital_Currency("Jayakwadi Dam" ,"Maharashtra" ,"Godavari River"),
                Country_Capital_Currency("Bhatsa Dam" ,"Maharashtra" ,"Bhatsa river"),
        Country_Capital_Currency("Wilson Dam" ,"Maharashtra" ,"Pravara River"),
                Country_Capital_Currency("Tansa Dam" ,"Maharashtra" ,"Tansa river"),
                Country_Capital_Currency("Panshet Dam" ,"Maharashtra" ,"Ambi River"),
                Country_Capital_Currency("Mula Dam" ,"Maharashtra" ,"Mula river"),
                Country_Capital_Currency("Kolkewadi Dam" ,"Maharashtra" ,"Vashishti River"),
                Country_Capital_Currency("Girna Dam" ,"Maharashtra" ,"Girana river"),
                Country_Capital_Currency("Vaitarna Dam" ,"Maharashtra" ,"Vaitarna river"),
                Country_Capital_Currency("Radhanagari Dam" ,"Telangana" ,"Bhogawati River"),
                Country_Capital_Currency("Lower Manair Dam" ,"Telangana" ,"Manair River"),
                Country_Capital_Currency("Mid Manair Dam" ,"Telangana" ,"Manair River and SRSP Flood Flow Canal"),
                Country_Capital_Currency("Upper Manair Dam" ,"Telangana" ,"Manair River and Kudlair River"),
                Country_Capital_Currency("Khadakwasla Dam" ,"Maharashtra" ,"Mutha River"),
                Country_Capital_Currency("Gangapur Dam" ,"Maharashtra" ,"Godavari river"),
                Country_Capital_Currency("Jalaput Dam" ,"Andhra Pradesh and Odisha Border" ,"Machkund River"),
                Country_Capital_Currency("Indravati Dam" ,"Odisha" ,"Indravati River"),
                Country_Capital_Currency("Hirakud Dam" ,"Odisha" ,"Mahanadi River"),
                Country_Capital_Currency("Vaigai Dam" ,"Tamil Nadu" ,"Vaigai River"),
                Country_Capital_Currency("Perunchani Dam" ,"Tamil Nadu" ,"Paralayar River"),
                Country_Capital_Currency("Mettur Dam" ,"Tamil Nadu" ,"Kaveri River"),
                Country_Capital_Currency("Rihand dam" ,"Uttar Pradesh" ,"Rihand River"),
                Country_Capital_Currency("Tehri Dam" ,"Uttarakhand" ,"Bhagirathi River"),
                Country_Capital_Currency("Dhauli Ganga Dam" ,"Uttarakhand" ,"Dhauli Ganga River")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Dams in India"

        val damname: TextView =findViewById(R.id.txt3rowElt1)
        val stale : TextView = findViewById(R.id.txt3rowElt2)
        val river : TextView = findViewById(R.id.txt3rowElt3)
        damname.text = "Name of Dam"
        stale.text = "State/UT"
        river.text="River"

        recyclerdamlist=findViewById(R.id.recyclercountrycurrencylist)
        recyclerdamlist.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofdams)
        recyclerdamlist.adapter = recyclerAdapter
        recyclerdamlist.layoutManager =  layoutManager

    }
}
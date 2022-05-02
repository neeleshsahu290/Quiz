package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CountryCapitalCurrencyAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class NewspapersActivity : AppCompatActivity() {
    lateinit var recyclerHpeak : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CountryCapitalCurrencyAdaptor
    val listofstate = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("The Yomiuri Shimbun" ,"Japan" ,"Japanese"),
        Country_Capital_Currency("The Asahi Shimbun" ,"Japan" ,"Japanese"),
        Country_Capital_Currency("USA Today" ,"USA" ,"English"),
        Country_Capital_Currency("Dainik Bhaskar" ,"India" ,"Hindi"),
                Country_Capital_Currency("Dainik Jagran" ,"India" ,"Hindi"),
                Country_Capital_Currency("The Mainichi Newspapers" ,"Japan" ,"Japanese"),
                Country_Capital_Currency("Cankao Xiaoxi" ,"China" ,"Chinese"),
                Country_Capital_Currency("Amar Ujala" ,"India" ,"Hindi"),
                Country_Capital_Currency("The Times of India" ,"India" ,"English"),
                Country_Capital_Currency("The Nikkei" ,"Japan" ,"Japanese"),
                Country_Capital_Currency("People's Daily" ,"China" ,"Chinese"),
                Country_Capital_Currency("Chunichi Shimbun" ,"Japan" ,"Japanese"),
                Country_Capital_Currency("Hindustan Dainik" ,"India" ,"Hindi"),
                Country_Capital_Currency("Malayala Manorama" ,"India" ,"Malayalam"),
                Country_Capital_Currency("The Wall Street Journal" ,"USA" ,"English"),
                Country_Capital_Currency("Bild" ,"Germany" ,"German"),
                Country_Capital_Currency("The New York Times" ,"USA" ,"English"),
                Country_Capital_Currency("Guangzhou Daily" ,"China" ,"Chinese"),
                Country_Capital_Currency("Nanfang Daily" ,"China" ,"Chinese"),
                Country_Capital_Currency("Rajasthan Patrika" ,"India" ,"Hindi"),
        Country_Capital_Currency("The Sydney Morning Herald" ,"Australia","English"),
                Country_Capital_Currency("he Age" ,"Australia",""),
                Country_Capital_Currency("Globe and Mail"  ,"Canada","English"),
        Country_Capital_Currency("The Gazette" ,"Canada","English"),
                Country_Capital_Currency("Le Monde Dawn" ,"Paris (France)","French"),
                Country_Capital_Currency("Dawn" ,"Pakistan","English"),
                Country_Capital_Currency("Die Welt" ,"Germany","German"),
                Country_Capital_Currency("The Times" ,"Britain","English"),
                Country_Capital_Currency("The Sun" ,"Britain","English"),
                Country_Capital_Currency("The New Zealand Herald" ,"New Zealand",""),
                Country_Capital_Currency("The Press" ,"New Zealand",""),
                Country_Capital_Currency("The Hindu" ,"India","English"),
        Country_Capital_Currency("The Scotsman" ,"UK","English"),
        Country_Capital_Currency("The Guardian" ,"UK","English"),
        Country_Capital_Currency("The Herald"  ,"UK","English"),
        Country_Capital_Currency("The Courier" ,"UK","English"),
        Country_Capital_Currency("Rakyat Merdeka" ,"Indonesia","Indonesian"),
        Country_Capital_Currency("Pravada","Russia","Russian"),
        Country_Capital_Currency("Zaman" ,"Turkey","Turkish")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_three_row)
        title="Famous News Papers"

        var state : TextView = findViewById(R.id.txt3rowElt1)
        var lang : TextView = findViewById(R.id.txt3rowElt2)
        var lang2 : TextView = findViewById(R.id.txt3rowElt3)
        state.text = "Newspaper"
        lang.text = "Country"
        lang2.text ="Language"

        recyclerHpeak =findViewById(R.id.recyclercountrycurrencylist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CountryCapitalCurrencyAdaptor(listofstate)
        recyclerHpeak.adapter = recyclerAdapter
        recyclerHpeak.layoutManager =  layoutManager

    }
}
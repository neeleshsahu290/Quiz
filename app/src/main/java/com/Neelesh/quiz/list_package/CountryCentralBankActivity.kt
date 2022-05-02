package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class CountryCentralBankActivity : AppCompatActivity() {

    lateinit var recyclerCentralBank : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StateCapitalAdaptor
    val listofcountry = arrayListOf<State_Capital>(
        State_Capital("Afghanistan" ,"Bank of Afghanistan"),
        State_Capital("Albania" ,"Bank of Albania"),
        State_Capital("Algeria" ,"Bank of Algeria"),
        State_Capital("Argentina" ,"Central Bank of Argentina"),
        State_Capital("Armenia" ,"Central Bank of Armenia"),
        State_Capital("Aruba" ,"Central Bank of Aruba"),
        State_Capital("Australia" ,"Reserve Bank of Australia"),
        State_Capital("Austria" ,"Austrian National Bank"),
        State_Capital("Azerbaijan" ,"National Bank of Azerbaijan"),
        State_Capital("Bahamas" ,"Central Bank of The Bahamas"),
        State_Capital("Bahrain" ,"Central Bank of Bahrain"),
        State_Capital("Bangladesh" ,"Bangladesh Bank"),
        State_Capital("Barbados" ,"Central Bank of Barbados"),
        State_Capital("Belarus" ,"National Bank of the Republic of Belarus"),
        State_Capital("Belgium" ,"National Bank of Belgium"),
        State_Capital("Belize" ,"Central Bank of Belize"),
        State_Capital("Benin" ,"Central Bank of West African States (BCEAO)"),
        State_Capital("Bermuda" ,"Bermuda Monetary Authority"),
        State_Capital("Bhutan" ,"Royal Monetary Authority of Bhutan"),
        State_Capital("Bolivia" ,"Central Bank of Bolivia"),
        State_Capital("Bosnia" ,"Central Bank of Bosnia and Herzegovina"),
        State_Capital("Botswana" ,"Bank of Botswana"),
        State_Capital("Brazil" ,"Central Bank of Brazil"),
        State_Capital("Bulgaria" ,"Bulgarian National Bank"),
        State_Capital("Burkina Faso" ,"Central Bank of West African States (BCEAO)"),
        State_Capital("Cambodia" ,"National Bank of Cambodia"),
        State_Capital("Cameroon" ,"Bank of Central African States"),
        State_Capital("Canada" ,"Bank of Canada – Banque du Canada"),
        State_Capital("Cayman Islands" ,"Cayman Islands Monetary Authority"),
        State_Capital("Central African Republic" ,"Bank of Central African States"),
        State_Capital("Chad" ,"Bank of Central African States"),
        State_Capital("Chile" ,"Central Bank of Chile"),
        State_Capital("China" ,"The People’s Bank of China"),
    State_Capital("Colombia" ,"Bank of the Republic"),
    State_Capital("Comoros" ,"Central Bank of Comoros"),
    State_Capital("Congo" ,"Bank of Central African States"),
    State_Capital("Costa Rica" ,"Central Bank of Costa Rica"),
    State_Capital("Côte d’Ivoire" ,"Central Bank of West African States (BCEAO)"),
    State_Capital("Croatia" ,"Croatian National Bank"),
    State_Capital("Cuba" ,"Central Bank of Cuba"),
    State_Capital("Cyprus" ,"Central Bank of Cyprus"),
    State_Capital("Czech Republic" ,"Czech National Bank"),
    State_Capital("Denmark" ,"National Bank of Denmark"),
    State_Capital("Dominican Republic" ,"Central Bank of the Dominican Republic"),
    State_Capital("East Caribbean area" ,"Eastern Caribbean Central Bank"),
    State_Capital("Ecuador" ,"Central Bank of Ecuador"),
    State_Capital("Egypt" ,"Central Bank of Egypt"),
    State_Capital("El Salvador" ,"Central Reserve Bank of El Salvador"),
    State_Capital("Equatorial Guinea" ,"Bank of Central African States"),
    State_Capital("Estonia" ,"Bank of Estonia"),
    State_Capital("Ethiopia" ,"National Bank of Ethiopia"),
    State_Capital("European Union" ,"European Central Bank"),
    State_Capital("Fiji" ,"Reserve Bank of Fiji"),
    State_Capital("Finland" ,"Bank of Finland"),
    State_Capital("France" ,"Bank of France"),
    State_Capital("Gabon" ,"Bank of Central African States"),
    State_Capital("The Gambia" ,"Central Bank of The Gambia"),
    State_Capital("Georgia" ,"National Bank of Georgia"),
    State_Capital("Germany" ,"Deutsche Bundesbank"),
    State_Capital("Ghana" ,"Bank of Ghana"),
    State_Capital("Greece" ,"Bank of Greece"),
    State_Capital("Guatemala" ,"Bank of Guatemala"),
    State_Capital("Guinea Bissau" ,"Central Bank of West African States (BCEAO)"),
    State_Capital("Guyana" ,"Bank of Guyana"),
    State_Capital("Haiti" ,"Central Bank of Haiti"),
    State_Capital("Honduras" ,"Central Bank of Honduras"),
    State_Capital("Hong Kong" ,"Hong Kong Monetary Authority"),
    State_Capital("Hungary" ,"Magyar Nemzeti Bank"),
    State_Capital("Iceland" ,"Central Bank of Iceland"),
    State_Capital("India" ,"Reserve Bank of India"),
    State_Capital("Indonesia" ,"Bank Indonesia"),
    State_Capital("Iran" ,"The Central Bank of the Islamic Republic of Iran"),
    State_Capital("Iraq" ,"Central Bank of Iraq"),
    State_Capital("Ireland" ,"Central Bank and Financial Services Authority of Ireland"),
    State_Capital("Israel" ,"Bank of Israel"),
    State_Capital("Italy" ,"Bank of Italy"),
    State_Capital("Jamaica" ,"Bank of Jamaica"),
    State_Capital("Japan"," Bank of Japan"),
    State_Capital("Jordan" ,"Central Bank of Jordan"),
    State_Capital("Kazakhstan" ,"National Bank of Kazakhstan"),
    State_Capital("Kenya" ,"Central Bank of Kenya"),
    State_Capital("Korea" ,"Bank of Korea"),
    State_Capital("Kuwait" ,"Central Bank of Kuwait"),
    State_Capital("Kyrgyzstan" ,"National Bank of the Kyrgyz Republic"),
    State_Capital("Latvia" ,"Bank of Latvia"),
    State_Capital("Lebanon" ,"Central Bank of Lebanon"),
    State_Capital("Lesotho" ,"Central Bank of Lesotho"),
    State_Capital("Libya" ,"Central Bank of Libya"),
    State_Capital("Lithuania" ,"Bank of Lithuania"),
    State_Capital("Luxembourg" ,"Central Bank of Luxembourg"),
    State_Capital("Macao" ,"Monetary Authority of Macao"),
        State_Capital("Macedonia" ,"National Bank of the Republic of Macedonia"),
                State_Capital("Madagascar" ,"Central Bank of Madagascar"),
                State_Capital("Malaysia" ,"Central Bank of Malaysia"),
                State_Capital("Malawi" ,"Reserve Bank of Malawi"),
                State_Capital("Mali" ,"Central Bank of West African States (BCEAO)"),
                State_Capital("Malta" ,"Central Bank of Malta"),
                State_Capital("Mauritius" ,"Bank of Mauritius"),
                State_Capital("Mexico" ,"Bank of Mexico"),
                State_Capital("Moldova" ,"National Bank of Moldova"),
                State_Capital("Mongolia" ,"Bank of Mongolia"),
                State_Capital("Morocco" ,"Bank of Morocco"),
                State_Capital("Mozambique" ,"Bank of Mozambique"),
                State_Capital("Namibia" ,"Bank of Namibia"),
                State_Capital("Nepal" ,"Central Bank of Nepal"),
                State_Capital("Netherlands" ,"Netherlands Bank"),
                State_Capital("Netherlands" ,"Antilles Bank of the Netherlands Antilles"),
                State_Capital("New Zealand" ,"Reserve Bank of New Zealand"),
                State_Capital("Nicaragua" ,"Central Bank of Nicaragua"),
                State_Capital("Niger" ,"Central Bank of West African States (BCEAO)"),
                State_Capital("Nigeria" ,"Central Bank of Nigeria"),
                State_Capital("Norway" ,"Central Bank of Norway"),
                State_Capital("Oman" ,"Central Bank of Oman"),
                State_Capital("Pakistan" ,"State Bank of Pakistan"),
                State_Capital("Papua New Guinea" ,"Bank of Papua New Guinea"),
                State_Capital("Paraguay" ,"Central Bank of Paraguay"),
                State_Capital("Peru" ,"Central Reserve Bank of Peru"),
                State_Capital("Philippines" ,"Bangko Sentral ng Pilipinas"),
                State_Capital("Poland" ,"National Bank of Poland"),
                State_Capital("Portugal" ,"Bank of Portugal"),
                State_Capital("Qatar" ,"Qatar Central Bank"),
                State_Capital("Romania" ,"National Bank of Romania"),
                State_Capital("Russia" ,"Central Bank of Russia"),
                State_Capital("Rwanda" ,"National Bank of Rwanda"),
                State_Capital("San Marino" ,"Central Bank of the Republic of San Marino"),
                State_Capital("Samoa" ,"Central Bank of Samoa"),
                State_Capital("Saudi Arabia" ,"Saudi Arabian Monetary Agency"),
                State_Capital("Senegal" ,"Central Bank of West African States (BCEAO)"),
                State_Capital("Serbia" ,"National Bank of Serbia"),
                State_Capital("Seychelles" ,"Central Bank of Seychelles"),
                State_Capital("Sierra" ,"Leone Bank of Sierra Leone"),
                State_Capital("Singapore" ,"Monetary Authority of Singapore"),
                State_Capital("Slovakia" ,"National Bank of Slovakia"),
                State_Capital("Slovenia" ,"Bank of Slovenia"),
                State_Capital("Solomon Islands" ,"Central Bank of Solomon Islands"),
                State_Capital("South Africa" ,"South African Reserve Bank"),
                State_Capital("Spain" ,"Bank of Spain"),
                State_Capital("Sri Lanka" ,"Central Bank of Sri Lanka"),
                State_Capital("Sudan" ,"Bank of Sudan"),
                State_Capital("Surinam" ,"Central Bank of Suriname"),
                State_Capital("Swaziland" ,"The Central Bank of Swaziland"),
                State_Capital("Sweden" ,"Sveriges Riksbank"),
                State_Capital("Switzerland" ,"Swiss National Bank"),
                State_Capital("Tajikistan" ,"National Bank of the Republic of Tajikistan"),
                State_Capital("Tanzania" ,"Bank of Tanzania"),
                State_Capital("Thailand" ,"Bank of Thailand"),
                State_Capital("Togo" ,"Central Bank of West African States (BCEAO)"),
                State_Capital("Tonga" ,"National Reserve Bank of Tonga"),
                State_Capital("Trinidad and Tobago" ,"Central Bank of Trinidad and Tobago"),
                State_Capital("Tunisia" ,"Central Bank of Tunisia"),
                State_Capital("Turkey" ,"Central Bank of the Republic of Turkey"),
                State_Capital("Uganda" ,"Bank of Uganda"),
               State_Capital( "Ukraine" ,"National Bank of Ukraine"),
                State_Capital("United Arab Emirates" ,"Central Bank of United Arab Emirates"),
                State_Capital("United Kingdom" ,"Bank of England"),
                State_Capital("United States", "Board of Governors of the Federal Reserve System (Washington) Federal Reserve Bank of New York"),
                State_Capital("Uruguay" ,"Central Bank of Uruguay"),
                State_Capital("Vanuatu" ,"Reserve Bank of Vanuatu"),
                State_Capital("Venezuela" ,"Central Bank of Venezuela"),
                State_Capital("Yemen" ,"Central Bank of Yemen"),
                State_Capital("Zambia" ,"Bank of Zambia"),
                State_Capital("Zimbabwe" ,"Reserve Bank of Zimbabwe")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="Countries Central Bank"

        var country : TextView = findViewById(R.id.txt2rowElt1)
        var bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Country Name"
        bank.text = "Central Bank"

        recyclerCentralBank=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofcountry)
        recyclerCentralBank.adapter = recyclerAdapter
        recyclerCentralBank.layoutManager =  layoutManager


    }
}
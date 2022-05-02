package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.CityFounderAdaptor
import com.Neelesh.quiz.data_class.City_Founders4

class InternationalOrganizationsActivity : AppCompatActivity() {

    lateinit var recyclernickname : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: CityFounderAdaptor
    val listofcity = arrayListOf<City_Founders4>(
        City_Founders4("Amnesty international", "London, UK" ,"Mr.Salil Shetty","1961"),

                City_Founders4("APEC (Asia Pacific Economic Forum)" ,"Singapore" ,"Mr. Tran Dai Quang","1989"),

                City_Founders4("ASEAN (Association of South East Asian Nations)" ,"Jakarta, Indonesia" ,"Mr. Lee Hsien Loong","1967"),

                City_Founders4("Commonwealth of Nations" ,"London, UK" ,"Mrs. Elizabeth II","1931"),

                City_Founders4("EU (European Union)" ,"Brussels, Belgium","3 members","1993"),

                City_Founders4("FAO (Food and Agricultural Organization)" ,"Rome, Italy" ,"Mr. Jose Graziano da silva","1945"),

                City_Founders4("IAEA (International Atomic Energy Agency)" ,"Vienna, Austria" ,"Mr. Yukiya Amano","1957"),

                City_Founders4("ICAO (International Civil Aviation Organization)" ,"Montreal, Canada" ,"Ms. Fang Liu","1947"),

                City_Founders4("ICJ (International Court of Justice) (World Court)" ,"The Hague, Netherlands" ,"Mr. Abdulqawi Yusuf","1945"),

                City_Founders4("ILO (International Labor Organization)" ,"Geneva, Switzerland" ,"Mr. Guy Ryder","1919"),

                City_Founders4("IM (International Maritime Organization)" ,"London, UK" ,"Mr. Kitack Lim","1948"),

                City_Founders4("IMF (International Monetary Fund)" ,"Washington, USA" ,"Mrs. Christine Lagarde","1945"),

                City_Founders4("International Standards Organizations" ,"Geneva, Switzerland" ,"Mr. John Walter","1947"),

                City_Founders4("NAM (Non Aligned Movement)" ,"Jakarta, Indonesia" ,"Mr.Nicolas Maduro","1961"),

                City_Founders4("NATO (North Atlantic Treaty Organization)" ,"Brussels, Belgium" ,"Mr. Jens Stoltenberg","1949"),

                City_Founders4("OECD (Organization for Economic Cooperation and Development)" ,"Paris, France" ,"Mr. Jose Angel Gurria","1961"),
        City_Founders4("OPEC (Organization of Petroleum Exporting Countries)" ,"Vienna, Austria" ,"Mr. Mohammed Barkindo","1960"),

               City_Founders4( "SAARC (South Asian Association for Regional Cooperation)" ,"Kathmandu, Nepal" ,"Mr. Amjad Hussain B. Sial","1985"),

    City_Founders4("Transparency International" ,"Berlin, Germany" ,"Mrs. Delia Ferreira Rubio","1993"),

    City_Founders4("UNAIDS (Joint United Nations Programme on HIV/ AIDS)" ,"Geneva, Switzerland" ,"Mr. Michel Sidibe","1996"),

    City_Founders4("UNCDF (United Nations Capital Development Fund)" ,"New York, USA" ,"Mrs. Judith Karl","1966"),

    City_Founders4("UNCTAD (United Nations Conference on Trade and Development)" ,"Geneva, Switzerland" ,"Mr. Mukhisa Kituyi","1964"),

    City_Founders4("UNODC (United Nations Office on Drugs and Crimes)" ,"Vienna, Austria" ,"Mr. Yuri Fedotov","1997"),

    City_Founders4("UNDP (United Nations Development Programme)" ,"New York, USA" ,"Mr. Achim Steiner","1966"),

    City_Founders4("UNEP (United Nations Environment Programme)" ,"Nairobi, Kenya" ,"Mr. Erik Solheim","1972"),

    City_Founders4("UNESCO (United Nations Educational scientific and cultural Organization)" ,"Paris, France" ,"Mrs. Irina Bokova and Mrs. Audrey Azoulay","1945"),

    City_Founders4("UNFCCC (United Nations Frame Convention on Climate Change)" ,"New York, USA" ,"Mr. Ovais Sarmad","1992"),

    City_Founders4("UNFPA (United Nations Population Fund)" ,"New York, USA" ,"Mrs. Natalia Kanem","1969"),

    City_Founders4("UNHCR (United Nations High Commissioner for Refugees)" ,"Geneva, Switzerland" ,"Mr. Filippo Grandi","1950"),

    City_Founders4("UNICEF (United Nations Children’s Education Fund)" ,"New York, USA" ,"Mr. Tore Hattrem","1946"),

    City_Founders4("UNO (United Nations Organization)" ,"New York, USA" ,"Mr. Antonio Guterres","1945"),
    City_Founders4("WHO (World Health Organization)" ,"Geneva, Switzerland" ,"Mr. Tedros Adhanom","1948"),
    City_Founders4("WMO (World Metrological Organization)" ,"Geneva, Switzerland", "Mr. Petteri Taalas and Mr. David Grimes","1950"),

    City_Founders4("World Bank" ,"Washington, USA" ,"Mr. Jim Yong Kim","1944"),

    City_Founders4("World Intellectual Property Org." ,"Geneva, Switzerland" ,"Mr. Francis Gurry","1967"),

    City_Founders4("WTO (World Tourism Organization)" ,"Madrid, Spain" ,"Mr. Zurab Pololikashvili","1975")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_four_row)
        title="International Organizations"


        val damname: TextView =findViewById(R.id.txt4rowElt1)
        val stale : TextView = findViewById(R.id.txt4rowElt2)
        val river : TextView = findViewById(R.id.txt4rowElt3)
        val year : TextView = findViewById(R.id.txt4rowElt4)
        damname.text = "International Organizations"
        stale.text = "Head Quarters"
        river.text="Secretary General / President"
        year.text="Started Year"

        recyclernickname=findViewById(R.id.recyclercityfounderlist)
        recyclernickname.setHasFixedSize(true)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = CityFounderAdaptor(listofcity)
        recyclernickname.adapter = recyclerAdapter
        recyclernickname.layoutManager =  layoutManager
    }
}
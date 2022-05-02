package com.Neelesh.quiz.generalscience

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.SNOAdaptor
import com.Neelesh.quiz.adaptor.Sno3Adaptor
import com.Neelesh.quiz.data_class.City_Founders4
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class ElementOresActivity : AppCompatActivity() {
    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: Sno3Adaptor
    val listofpark = arrayListOf<City_Founders4>(
        City_Founders4("1","Aluminum (Al)"	,"Bauxite"	,"Al₂O₃.2H₂O"),
        City_Founders4("","","Corundum"	,"Al₂O₃"),
        City_Founders4("","","cryolite"	,"Na₃AlF₆"),
        City_Founders4("","","Feldspar","KAlSi₃O₈"),
        City_Founders4("","","Diaspore","Al₂O₃.H₂O"),
        City_Founders4("2","Antimony(Sb)","Stibnite","Sb₂S₃"),
        City_Founders4("3","Arsenic(As)","Arsenopyrite","FeAsS"),
        City_Founders4("4","Barium(Ba)","Baryte / Barite","BaSO₄"),
        City_Founders4("5","Cadmium(Cd)","Greenockite","CdS"),
        City_Founders4("6" ,"Calcium (Ca)"	,"Dolomite"	,"MgCO₃CaCO₃"),
        City_Founders4("","","LimeStone"	,"CaCO₃"),
        City_Founders4("","","fluorapatite","Ca₅(PO₄)₃F"),
        City_Founders4("","","Gypsusm","CaSO₄.2H₂0"),
        City_Founders4("","","Fluorspar","CaF₂"),
        City_Founders4("","","Plaster of Paris","CaSO₄.½H₂0"),
        City_Founders4("7","Chromium(Cr)","Chromite","FeCr₂O₄"),
        City_Founders4("8" ,"Copper (Cu)"	,"Copper Glance"	,"Cu₂S"),
        City_Founders4("","","Malachite","Cu₂CO₃(OH)₂"),
        City_Founders4("","","Cuprite","Cu₂O"),
        City_Founders4("","","Azurite","Cu₃(CO₃)₂(OH)₂"),
        City_Founders4("","","Chalciite","Cu₂S"),
        City_Founders4("","","ChalcoPyrite"	,"CuFeS₂"),
        City_Founders4("9" ,"Gold (Au)"	,"Calverite"	,"AuTe₂"),
        City_Founders4("","","Sylvanite"	,"(AgAu)Te₂"),
        City_Founders4("10" ,"Iron (Fe)"	,"Hematite"	,"Fe₂O₃"),
        City_Founders4("","","IronPyrite",	"FeS₂"),
        City_Founders4("","","Magnetite",	"Fe₃O₄"),
        City_Founders4("","","Siderite","FeCO₃"),
        City_Founders4("","","Limonite","2Fe₂O₃.3H₂0"),
        City_Founders4("11","Nickel(Ni)","Nickel Glance","NiAsS"),
        City_Founders4("","","Siderite"	,"FeCO₃"),
        City_Founders4("12" ,"Lead (Pb)"	,"Anglesite"	,"PbSO₄"),
        City_Founders4("","","Galena",	"PbS"),
        City_Founders4("","","Cerussite","PbCO₃"),
        City_Founders4("13" ,"Phosphorous (P)" ,"Phosphorite"	,"Ca₃(PO₄)₂.CaCO₃.CaFe₂"),
        City_Founders4("14" ,"Potassium (K)","Carnallite"	,"KCl.MgCl₂6(H₂O)"),
        City_Founders4("","","Salt Petre"	,"KNO₃"),
        City_Founders4("","","Potassium Chloride","KCl"),
        City_Founders4("","","Potassium Carbonate","K₂CO₃"),
        City_Founders4("15","Manganese(Mn)","Pyrolusite","MnO₂"),
        City_Founders4("","","Manganite","Mn₂O₃.H₂O"), City_Founders4("16" ,"Magnesium (Mg)"	,"Dolomite"	,"MgCO₃CaCO₃"),
        City_Founders4("","","Magnesite","MgCO₃"),
        City_Founders4("","","Epsom Salt or Epsomite","MgSO₄.7h₂0"),
        City_Founders4("17", "Mercury (Hg)"	,"Calomel"	,"Hg₂Cl₂"),
        City_Founders4("","","Cinnabar"	,"HgS"),
        City_Founders4("18" ,"Silver (Ag)"	,"Silver Glance / Argentite"	,"Ag₂S"),
        City_Founders4("","","Native Silver","Ag"),
        City_Founders4("","","Horn Silver","AgCl"),
        City_Founders4("","","Ruby Silver","3Ag₂S.Sb₂S₃"),
        City_Founders4("19"	,"Sodium (Na)"	,"Common Salt or Brine"	,"NaCl"),
        City_Founders4("","","Sodium Carbonate"	,"Na₂CO₃. 10H₂O"),
        City_Founders4("","","Sodium Nitrate","NaNO₃"),
        City_Founders4("","","Borax","Na₂B₄O₇.10H₂0"),
        City_Founders4("20" ,"Tin (Sn)"	,"Cassiterite"	,"SnO₂"),
        City_Founders4("21","Uranium(U)","Carnotite","K₂(UO₂)₂(VO₄)₂·3H₂O"),
        City_Founders4("","","Pitch Blende","U₃O₈"),
        City_Founders4("22", "Zinc (Zn)"	,"Calamine"	,"ZnCo₃"),
        City_Founders4("","","Zinc Blende"	,"ZnS"),
        City_Founders4("","","Zincite","ZnO"),
        City_Founders4("","","Willemite","Zn₂SiO₄")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_three_row)
        title="Element and their Ores"
        val text1: TextView = findViewById(R.id.txt3snorowElt2)
        val text2: TextView = findViewById(R.id.txt3snorowElt3)
        val text3: TextView = findViewById(R.id.txt3snorowElt4)
        text1.text="Element"
        text2.text="Ore"
        text3.text="Formulae"

        recyclerNationalpark=findViewById(R.id.recyclersnothree)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = Sno3Adaptor(listofpark)
        recyclerNationalpark.adapter = recyclerAdapter
        recyclerNationalpark.layoutManager =  layoutManager
    }
}
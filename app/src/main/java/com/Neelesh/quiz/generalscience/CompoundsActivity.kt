package com.Neelesh.quiz.generalscience

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.SNOAdaptor
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class CompoundsActivity : AppCompatActivity() {

    lateinit var recyclerNationalpark : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SNOAdaptor
    val listofpark = arrayListOf<Country_Capital_Currency>(
        Country_Capital_Currency("1","Ferrous Oxide (FeO)","In green glass, Ferrous Salt"),
        Country_Capital_Currency("2","Ferric Oxide (Fe₂O₃)","In electroplating of ornaments and formation of ferric salt"),
        Country_Capital_Currency("3","Ferrous Sulphate (FeSO₄.7H₂O)","In dye industry and Mohr's Salt"),
        Country_Capital_Currency("4","Ferric Hydroxide (Fe(OH)₃)","As a laboratory reagent, " +
                "In making Medicines "),
        Country_Capital_Currency("5","Iodine (I₂)","As antiseptic," +
                "In making tincture of iodine"),
        Country_Capital_Currency("6","Chlorine (Cl₂)","In the formation of Mustard gas and Bleaching powder"),
        Country_Capital_Currency("7","Bromine (Br₂)","In Dye industry," +
                "As a laboratory reagent"),
        Country_Capital_Currency("8","Hydrochloric Acid (HCl)","Formation of aqua regia (HNO₃.3HCl) and Dyes"),
        Country_Capital_Currency("9","Sulphuric Acid (H₂SO₄)","As a laboratory reagent," +
                "Purification of Petroleum, " +
                "In Lead Storage battery"),
        Country_Capital_Currency("10","Sulphur di oxide (SO₂)","As Oxidants and Reactants," +
                "As a bleaching Agent"),
        Country_Capital_Currency("11","Hydrogen Sulphide (H₂S)","In Qualitative analysis of Basic group Separation"),
        Country_Capital_Currency("12","Sulphur","Antiseptic,"+"Vulcanization of rubber,"+"Gun Powder,"+"Medicine"),
        Country_Capital_Currency("13","Ammonia (NH₃)","As a refrigerant in Ice industry"),
        Country_Capital_Currency("14","Red Phosphorus (P₄)","Refigerant,"+"In match industry"),
        Country_Capital_Currency("","White Phosphorus (P₄)","Rat killing Medicine"),
        Country_Capital_Currency("15","Producer gas (CO+N₂)","In Heating furnace,"+"Cheap fuel,"+"In extraction of Metal"),
        Country_Capital_Currency("16","Water gas (CO+H₂)","To remove Carbon Monoxide from Fuel Cell Applications"),
        Country_Capital_Currency("17","Coal gas","As Feul"),
        Country_Capital_Currency("18","Nitrous Oxide","")

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
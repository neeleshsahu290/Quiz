package com.Neelesh.quiz.generalscience

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.Sno3Adaptor
import com.Neelesh.quiz.data_class.City_Founders4

class AlloysActivity : AppCompatActivity() {
    lateinit var recyclerAlloys : RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter: Sno3Adaptor
    val listofalloys = arrayListOf<City_Founders4>(
        City_Founders4("1","Bronze","Copper(90%) + Tin(10%)","Utensils, bells, Idols, coins, etc"),
        City_Founders4("2","Brass","Copper(70%) + Zinc(30%)","Household Utensils, idols, etc"),
        City_Founders4("3","Rolled Gold","Copper(90%) + Aluminium(10%)","For making Gold looking Ornaments"),
        City_Founders4("4","Currency Metal","Copper(95%) + Tin(4%) + Phosphorus(1%)","For making Currency Coins"),
        City_Founders4("5","Gun Metal","Copper(88%) + Tin(10%) + Zinc(2%)","To make parts of Gun"),
        City_Founders4("6","Bell Metal","Copper/Cu(80%) + Tin/Sn(20%)","Utensils, bells, Idols, coins, etc"),
        City_Founders4("7","Constantan","Copper(60%) + Nickel(40%)","Electrical tools and apparatus"),
        City_Founders4("8","Monel Metal","Copper(70%) + Nickel(30%)","Alkali resistant Container"),
        City_Founders4("9","Delta Metal ","Copper(60%) + Zinc(38%) + Iron(2%)","Propellers of Ships (as it is resistant to Sea Water)"),
        City_Founders4("10","MuntZ metal","Copper(60%) + Zinc(40%)","Tubes, Coins and Castings"),
        City_Founders4("11","Rose metal","Bismuth/Bi(50%) + Lead/Pb(28%) + Tin/Sn(22%)","For Automatic Fuse"),
        City_Founders4("12","German Silver","Copper(50-61.6)% + Zinc(17.2-19)% + Niclel(21.1-30)%","For Utensiles and statues"),
        City_Founders4("13","Magnalium","Aluminium(95-96%) + CuFe(2-3)% + Magnesium/Mg(2%)","For Aeroplane Parts"),
        City_Founders4("14","Duralumin","Aluminium(95%) + Magnesium/Mg(0.5%) + Copper/Cu(4%) + Mangnese/Mn(0.5%)","For Pressure Cookers , Aeroplane Parts"),
        City_Founders4("15","Nichrome","Ni(58-62)% + Fe(22-25)% + C(0.2-1)% + Mn,Zn,SiO₂(1-2)%","Used as wire in electic Heating Elements"),
        City_Founders4("16","Solder","Lead/Pb(68%) + Tin/Sn(32%)","For Electronic Soldering"),
        City_Founders4("17","Alnico","Steel(50%) + Aluminium(20%) + Nickel(20%) + Cobalt(10%)","For Magnet"),
        City_Founders4("18","Aluminium bronze","Al(10%)+Cu(90%)","In making Coin,Utensils"),
        City_Founders4("19","Nickel Alloy","Al(90%) + Ni(6%) + Cu(4%)","In aerospace manufacturing")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_sno_three_row)
        title="Alloys and their Uses"
        val text1:TextView = findViewById(R.id.txt3snorowElt2)
        val text2:TextView = findViewById(R.id.txt3snorowElt3)
        val text3:TextView = findViewById(R.id.txt3snorowElt4)
        text1.text="Name"
        text2.text="Composition"
        text3.text="Uses"

        recyclerAlloys=findViewById(R.id.recyclersnothree)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = Sno3Adaptor(listofalloys)
        recyclerAlloys.adapter = recyclerAdapter
        recyclerAlloys.layoutManager =  layoutManager
    }
}
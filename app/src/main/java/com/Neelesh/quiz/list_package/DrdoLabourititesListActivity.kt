package com.Neelesh.quiz.list_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.adaptor.StateCapitalAdaptor
import com.Neelesh.quiz.data_class.State_Capital

class DrdoLabourititesListActivity : AppCompatActivity() {

        lateinit var recyclerDrdolab : RecyclerView
        lateinit var layoutManager: RecyclerView.LayoutManager
        lateinit var recyclerAdapter: StateCapitalAdaptor
        val listofDrdo = arrayListOf<State_Capital>(
            State_Capital("Advanced Numerical Research & Analysis Group (ANURAG)" ,"Hyderabad"),
            State_Capital("Aerial Delivery Research & Development Establishment (ADRDE)" ,"Agra"),
            State_Capital("Vehicles Research & Development Establishment (VRDE)" ,"Ahmednagar"),
            State_Capital("Naval Materials Research Laboratory (NMRL)" ,"Ambernath"),
            State_Capital("Integrated Test Range (ITR)" ,"Balasore"),
            State_Capital("Proof and Experimental Establishment (PXE)" ,"Balasore"),
            State_Capital("Aeronautical Development Establishment (ADE)" ,"Bangalore"),
                State_Capital("Centre for Airborne Systems (CABS)" ,"Bangalore"),
            State_Capital("Centre for Artificial Intelligence & Robotics (CAIR)" ,"Bangalore"),

            State_Capital("Defence Avionics Research Establishment (DARE)" ,"Bangalore"),
            State_Capital("Defence Bio-engineering & Electro-medical Laboratory (DEBEL)" ,"Bangalore"),
                    State_Capital("Gas Turbine Research Establishment (GTRE)" ,"Bangalore"),
            State_Capital("Electronics & Radar Development Establishment (LRDE)" ,"Bangalore"),
            State_Capital("Microwave Tube Research & Development Centre (MTRDC)" ,"Bangalore"),
            State_Capital("Snow and Avalanche Study Establishment (SASE)" ,"Chandigarh"),
            State_Capital("Terminal Ballistics Research Laboratory (TBRL)" ,"Chandigarh"),
            State_Capital("Combat Vehicles Research & Development Establishment (CVRDE)" ,"Chennai"),
            State_Capital("Defence Electronics Applications Laboratory (DEAL)" ,"Dehradun"),
            State_Capital("Instruments Research & Development Establishment (IRDE)" ,"Dehradun"),
            State_Capital("Centre for Fire, Explosives & Environment Safety (CFEES)" ,"Delhi"),
            State_Capital("Defence Institute of Physiology & Allied Sciences (DIPAS)" ,"Delhi"),
            State_Capital("Defence Institute of Psychological Research (DIPR)" ,"Delhi"),
    State_Capital("Defence Terrain Research Laboratory (DTRL)" ,"Delhi"),
    State_Capital("Institute of Nuclear Medicines & Allied Sciences (INMAS)" ,"Delhi"),
            State_Capital("Joint Cipher Bureau (JCB)" ,"Delhi"),
            State_Capital("Laser Science & Technology Centre (LASTEC)" ,"Delhi"),
            State_Capital("Scientific Analysis Group (SAG)" ,"Delhi"),
            State_Capital("Solid State Physics Laboratory (SSPL)" ,"Delhi"),
    State_Capital("Defence Research & Development Establishment (DRDE)" ,"Gwalior"),
            State_Capital("Defence Institute of Bio-Energy Research (DIBER)" ,"Haldwani"),
            State_Capital("Advanced Systems Laboratory (ASL)" ,"Hyderabad"),
            State_Capital("Centre for High Energy Systems and Sciences (CHESS)" ,"Hyderabad"),
    State_Capital("Defence Electronics Research Laboratory (DLRL)" ,"Hyderabad"),
    State_Capital("Defence Metallurgical Research Laboratory (DMRL)" ,"Hyderabad"),
    State_Capital("Defence Research & Development Laboratory (DRDL)" ,"Hyderabad"),
    State_Capital("Research Centre Imarat (RCI)" ,"Hyderabad"),
    State_Capital("Defence Laboratory (DL)" ,"Jodhpur"),
    State_Capital("Defence Materials & Stores Research & Development Establishment (DMSRDE)" ,"Kanpur"),
    State_Capital("Naval Physical & Oceanographic Laboratory (NPOL)" ,"Kochi"),
    State_Capital("Defence Institute of High Altitude Research (DIHAR)", "Leh"),
    State_Capital("Defence Food Research Laboratory (DFRL)" ,"Mysore"),
    State_Capital("Armaments Research & Development Establishment (ARDE)" ,"Pune"),

    State_Capital("High Energy Materials Research Laboratory (HEMRL)" ,"Pune "),
            State_Capital("Research & Development Establishment (Engrs) (R&DE[E])" ,"Pune"),
    State_Capital("Defence Research Laboratory (DRL)" ,"Tezpur"),
    State_Capital("Naval Science & Technological Laboratory (NSTL)" ,"Visakhapatnam")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_two_row)
        title="DRDO LABORATORIES"


        val country : TextView = findViewById(R.id.txt2rowElt1)
        val bank : TextView = findViewById(R.id.txt2rowElt2)
        country.text="Name"
        bank.text = "Location"

        recyclerDrdolab=findViewById(R.id.recyclerstatecapitallist)
        layoutManager = LinearLayoutManager (this)
        recyclerAdapter = StateCapitalAdaptor(listofDrdo)
        recyclerDrdolab.adapter = recyclerAdapter
        recyclerDrdolab.layoutManager =  layoutManager
    }
}
package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.Country_Capital_Currency
import com.Neelesh.quiz.data_class.State_Capital

class StateCapitalAdaptor(val itemlist:ArrayList<State_Capital>) :  RecyclerView.Adapter<StateCapitalAdaptor.statecapitalviewholder> (){
    class statecapitalviewholder (view: View):RecyclerView.ViewHolder(view){
        val txtstate : TextView = view.findViewById(R.id.txtstate)
        val txtcapital : TextView = view.findViewById(R.id.txtcapital1)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): statecapitalviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_two_row,parent,false)
        return statecapitalviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: statecapitalviewholder, position: Int) {
        val capital = itemlist [position]
        holder.txtstate.text= capital.STATE
        holder.txtcapital.text=capital.CAPITAL

    }
}
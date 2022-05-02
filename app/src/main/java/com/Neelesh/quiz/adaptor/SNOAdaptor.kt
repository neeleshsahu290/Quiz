package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class SNOAdaptor (val itemlist:ArrayList<Country_Capital_Currency>) :  RecyclerView.Adapter<SNOAdaptor.Snoviewholder> (){
    class Snoviewholder (view: View): RecyclerView.ViewHolder(view){
        val txtcountry : TextView = view.findViewById(R.id.txtsno)
        val txtcapital : TextView = view.findViewById(R.id.txtsnoc1)
        val txtcurrency : TextView = view.findViewById(R.id.txtsnic2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Snoviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_two_sno_row,parent,false)
        return Snoviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: Snoviewholder, position: Int) {
        val country = itemlist [position]
        holder.txtcountry.text= country.COUNTRY
        holder.txtcapital.text=country.CAPITAL
        holder.txtcurrency.text=country.CURRENCY
    }

}
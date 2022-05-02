package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class CountryCapitalCurrencyAdaptor(val itemlist:ArrayList<Country_Capital_Currency>) :  RecyclerView.Adapter<CountryCapitalCurrencyAdaptor.countrycapitalcurrencyviewholder> (){
    class countrycapitalcurrencyviewholder (view: View):RecyclerView.ViewHolder(view){
        val txtcountry : TextView = view.findViewById(R.id.txtCountry)
        val txtcapital : TextView = view.findViewById(R.id.txtcapital)
        val txtcurrency : TextView = view.findViewById(R.id.txtcurrency)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): countrycapitalcurrencyviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_three_row,parent,false)
        return countrycapitalcurrencyviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: countrycapitalcurrencyviewholder, position: Int) {
        val country = itemlist [position]
        holder.txtcountry.text= country.COUNTRY
        holder.txtcapital.text=country.CAPITAL
        holder.txtcurrency.text=country.CURRENCY
    }
}
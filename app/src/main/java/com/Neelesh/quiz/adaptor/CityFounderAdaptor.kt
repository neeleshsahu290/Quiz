package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.City_Founders4
import com.Neelesh.quiz.data_class.Country_Capital_Currency

class CityFounderAdaptor (val itemlist:ArrayList<City_Founders4>) :  RecyclerView.Adapter<CityFounderAdaptor.cityfounderviewholder> () {
    class cityfounderviewholder (view: View):RecyclerView.ViewHolder(view){
        val txtcity:TextView=view.findViewById(R.id.txtCity)
        val txtfounder:TextView=view.findViewById(R.id.txtfounder)
        val txtloction:TextView=view.findViewById(R.id.txtlocation)
        val txtwhen:TextView=view.findViewById(R.id.txtwhen)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cityfounderviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler,parent,false)
        return cityfounderviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: cityfounderviewholder, position: Int) {
        val founder = itemlist [position]
        holder.txtcity.text= founder.CITY
        holder.txtfounder.text=founder.FOUNDER
        holder.txtloction.text=founder.LOCATION
        holder.txtwhen.text=founder.WHEN
    }
}
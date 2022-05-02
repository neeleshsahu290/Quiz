package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.City_Founders4

class Sno3Adaptor (val itemlist:ArrayList<City_Founders4>) :  RecyclerView.Adapter<Sno3Adaptor.sno3Adaptorviewholder> () {
    class sno3Adaptorviewholder (view: View): RecyclerView.ViewHolder(view){
        val txtcity: TextView =view.findViewById(R.id.txt3sno1)
        val txtfounder: TextView =view.findViewById(R.id.txt3sno2)
        val txtloction: TextView =view.findViewById(R.id.txt3sno3)
        val txtwhen: TextView =view.findViewById(R.id.txt3sno4)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sno3Adaptorviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_three_sno_row,parent,false)
        return sno3Adaptorviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: sno3Adaptorviewholder, position: Int) {
        val founder = itemlist [position]
        holder.txtcity.text= founder.CITY
        holder.txtfounder.text=founder.FOUNDER
        holder.txtloction.text=founder.LOCATION
        holder.txtwhen.text=founder.WHEN
    }
}
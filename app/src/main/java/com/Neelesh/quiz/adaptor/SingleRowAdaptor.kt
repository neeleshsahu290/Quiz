package com.Neelesh.quiz.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Neelesh.quiz.R
import com.Neelesh.quiz.data_class.Single_Row
import com.Neelesh.quiz.data_class.State_Capital

class SingleRowAdaptor(val itemlist:ArrayList<Single_Row>) :  RecyclerView.Adapter<SingleRowAdaptor.SingleRowviewholder> () {
    class SingleRowviewholder (view: View): RecyclerView.ViewHolder(view){
        val txtcountry : TextView = view.findViewById(R.id.txtsinglerow)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleRowviewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_single_row,parent,false)
        return SingleRowviewholder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: SingleRowviewholder, position: Int) {
        val capital = itemlist [position]
        holder.txtcountry.text= capital.SINGLE



    }
}

package com.Neelesh.quiz.fragment_home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.Neelesh.quiz.R


class ContactusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_contactus, container, false)

        val blogaddress:TextView = view.findViewById(R.id.blog_address)
        blogaddress.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://neeleshsahu2900.blogspot.com/2020/08/static-gk-and-gs-learner.html"))
            startActivity(intent)
        }



    return  view
    }


}
package com.Neelesh.quiz.fragment_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.Neelesh.quiz.R



class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val world=view.findViewById(R.id.txtworld) as TextView
        val india=view.findViewById(R.id.txtIndia) as TextView
        val enviournment=view.findViewById(R.id.txtEnviournment) as TextView
        val artandcukture=view.findViewById(R.id.txtartandculture) as TextView
        val history=view.findViewById(R.id.txthistory) as TextView
        val generalscience=view.findViewById(R.id.txtgeneralscience) as TextView
        val defence=view.findViewById(R.id.txtdefence) as TextView
        val space=view.findViewById(R.id.txtspace) as TextView
        val physics=view.findViewById(R.id.txtphysics) as TextView
        val chemistry=view.findViewById(R.id.txtchemistry) as TextView
        val biology=view.findViewById(R.id.txtbiology) as TextView

        world.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_worldFragment)
        }
        india.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_indiaFragment)
        }
        enviournment.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_enviourmentFragment)
        }
        artandcukture.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_artandcultureFragment)
        }
        history.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_HIstoryFragment)
        }
        defence.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_defenceFragment)
        }

        space.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_spaceFragment)
        }

        generalscience.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_generalScienceFragment)
        }

        physics.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_physicsFragment)
        }
        chemistry.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_chemistryFragment
            )
        }
        biology.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_biologyFragment)
        }
        return view
    }
}
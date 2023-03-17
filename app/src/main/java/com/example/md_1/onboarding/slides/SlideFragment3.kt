package com.example.md_1.onboarding.slides

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.md_1.R


class SlideFragment3 : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

       val view = inflater.inflate(R.layout.fragment_slide3, container, false)



        view.findViewById<Button>(R.id.buttonf).setOnClickListener {

findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)

        }
        view.findViewById<TextView>(R.id.txtskip).setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)

        }

        return view
    }

}
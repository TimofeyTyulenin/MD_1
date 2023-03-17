package com.example.md_1.onboarding.slides

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.md_1.R


class SlideFragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_slide1, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.findViewById<Button>(R.id.button).setOnClickListener {
                        viewPager?.currentItem = 1
        }
        view.findViewById<TextView>(R.id.txtskip).setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)
        }



        return view
    }


}
package com.example.md_1.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.md_1.R
import com.example.md_1.onboarding.slides.SlideFragment1
import com.example.md_1.onboarding.slides.SlideFragment2
import com.example.md_1.onboarding.slides.SlideFragment3
import androidx.appcompat.app.AppCompatActivity



class ViewPagerFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            SlideFragment1(),
            SlideFragment2(),
            SlideFragment3()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.findViewById<ViewPager2>(R.id.viewPager).adapter=adapter

       return view
    }

}


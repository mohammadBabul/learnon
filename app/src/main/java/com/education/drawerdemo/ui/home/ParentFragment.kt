package com.education.drawerdemo.ui.home

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.TabHomeLayoutBinding
import com.education.drawerdemo.ui.tab_fragment.*
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import java.util.*

class ParentFragment : Fragment() {

    private lateinit var homeViewModel: ParentViewModel
    private var binding: TabHomeLayoutBinding? = null
    private val tabIcons = intArrayOf(
        R.drawable.home,
        R.drawable.exam,
        R.drawable.study,
        R.drawable.library,
        R.drawable.more
    )
   /* private val tabInactive = intArrayOf(
        R.drawable.rounded_corner,
        R.drawable.rounded_corner,
        R.drawable.rounded_corner,
        R.drawable.rounded_corner,
        R.drawable.rounded_corner
    )*/
    private val tabLavels = intArrayOf(
        R.string.home,
        R.string.exam,
        R.string.group_study,
        R.string.library,
         R.string.more
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(ParentViewModel::class.java)

        binding = TabHomeLayoutBinding.inflate(inflater, container, false)
        val view = binding!!.root

       /* homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

         setupViewPager(binding!!.viewpager)
        binding!!.tabLayout.setupWithViewPager(binding!!.viewpager)
        setupTabIcons()
        binding!!.tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            @SuppressLint("ResourceType")
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> {
                        tab.setIcon(R.drawable.home)
                     //   binding!!.tabLayout.getTabAt(1)?.setIcon(R.drawable.rounded_corner)

                    }
                    1 -> {
                        tab.setIcon(R.drawable.exam)
                       // binding!!.tabLayout.getTabAt(2)?.setIcon(R.drawable.rounded_corner)

                    }
                    2 -> {
                        tab.setIcon(R.drawable.study)
                      //  binding!!.tabLayout.getTabAt(0)?.setIcon(R.drawable.rounded_corner)

                    }
                    3 -> {
                        tab.setIcon(R.drawable.library)
                     //  binding!!.tabLayout.getTabAt(0)?.setIcon(R.drawable.rounded_corner)

                    }
                    4 -> {
                        tab.setIcon(R.drawable.more)
                     //   binding!!.tabLayout.getTabAt(0)?.setIcon(R.drawable.rounded_corner)

                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        return view
    }

    private fun setupTabIcons() {
        binding!!.tabLayout.getTabAt(0)!!.setIcon(tabIcons[0])
        binding!!.tabLayout.getTabAt(1)!!.setIcon(tabIcons[1])
        binding!!.tabLayout.getTabAt(2)!!.setIcon(tabIcons[2])
        binding!!.tabLayout.getTabAt(3)!!.setIcon(tabIcons[3])
        binding!!.tabLayout.getTabAt(4)!!.setIcon(tabIcons[4])
        /*binding!!.tabLayout.getTabAt(1)!!.setIcon(tabInactive[1])
        binding!!.tabLayout.getTabAt(2)!!.setIcon(tabInactive[2])
        binding!!.tabLayout.getTabAt(3)!!.setIcon(tabInactive[3])
        binding!!.tabLayout.getTabAt(4)!!.setIcon(tabInactive[4])*/
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = viewPagerAdapter(childFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(ExamFragment(), "Exam")
        adapter.addFragment(StudyFragment(), "Study")
        adapter.addFragment(LibraryFragment(), "Library")
        adapter.addFragment(MoreFragment(), "More")
        viewPager.adapter = adapter
    }

    internal class viewPagerAdapter(fm: FragmentManager) :
        FragmentPagerAdapter(fm) {
        private val mFragmentList: MutableList<Fragment> = ArrayList()
        private val mFragmentTittleList: MutableList<String> = ArrayList()
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, tittle: String) {
            mFragmentList.add(fragment)
            mFragmentTittleList.add(tittle)
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
package com.education.drawerdemo.ui.announcement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.education.drawerdemo.R

class AnnouncementFragment : Fragment() {

    private lateinit var homeViewModel: AnnounceViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(AnnounceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_announcement_layout, container, false)
        val textView: TextView = root.findViewById(R.id.txt_announce)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
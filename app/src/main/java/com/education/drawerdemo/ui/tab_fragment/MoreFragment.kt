package com.education.drawerdemo.ui.tab_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.MoreLayoutBinding
import com.education.drawerdemo.databinding.TabHomeLayoutBinding
import com.education.drawerdemo.ui.vision.VisionViewModel

class MoreFragment : Fragment() {

    //private lateinit var galleryViewModel: VisionViewModel
    private var binding: MoreLayoutBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MoreLayoutBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }
}
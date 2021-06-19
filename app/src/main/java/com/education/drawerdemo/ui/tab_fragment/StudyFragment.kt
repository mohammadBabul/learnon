package com.education.drawerdemo.ui.tab_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.education.drawerdemo.databinding.FragmentGroupStudyLayoutBinding
import com.education.drawerdemo.ui.vision.VisionViewModel

class StudyFragment : Fragment() {

    private lateinit var galleryViewModel: VisionViewModel
    private var binding: FragmentGroupStudyLayoutBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProvider(this).get(VisionViewModel::class.java)
        /* val root = inflater.inflate(R.layout.fragment_vision, container, false)
         val textView: TextView = root.findViewById(R.id.text_gallery)
         galleryViewModel.text.observe(viewLifecycleOwner, Observer {
             textView.text = it
         })*/
        binding = FragmentGroupStudyLayoutBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }
}
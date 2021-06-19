package com.education.drawerdemo.ui.profile_ui

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.ProfileLayoutActivityBinding

class NotificationActivity: AppCompatActivity() {
    private var binding: ProfileLayoutActivityBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //chnage status bar color
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.status_bar_color)

        //view binding
        binding = ProfileLayoutActivityBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)
    }
}
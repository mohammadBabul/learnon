package com.education.drawerdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.ProfileContentMainBinding
import com.education.drawerdemo.databinding.ProfileItemLayoutBinding
import com.education.drawerdemo.databinding.SelectOccupationLayoutBinding
import com.education.drawerdemo.ui.profile_ui.NotificationActivity
import com.education.drawerdemo.ui.profile_ui.ProfileActivity
import com.education.drawerdemo.ui.profile_ui.ProgressActivity

class ProfileHomeActivity: AppCompatActivity() {
    private var binding: ProfileItemLayoutBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //chnage status bar color
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.teal_200)

        //view binding
        binding = ProfileItemLayoutBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)

        binding!!.profileLayout.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        })
        binding!!.shareLayout.setOnClickListener(View.OnClickListener {
        })
        binding!!.progressLayout.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        })
        binding!!.notificationLayout.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        })
        binding!!.logLayout.setOnClickListener(View.OnClickListener {

        })
        binding!!.ivBack.setOnClickListener(View.OnClickListener {
                finish()
        })
    }
}

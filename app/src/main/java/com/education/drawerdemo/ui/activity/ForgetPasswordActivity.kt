package com.education.drawerdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.ForgetPasswordLayoutBinding
import com.education.drawerdemo.databinding.VerificationPageLayoutBinding

class ForgetPasswordActivity : AppCompatActivity() {
    private var binding: ForgetPasswordLayoutBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //chnage status bar color
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.status_bar_color)

        //view binding
        binding = ForgetPasswordLayoutBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)

    }
}
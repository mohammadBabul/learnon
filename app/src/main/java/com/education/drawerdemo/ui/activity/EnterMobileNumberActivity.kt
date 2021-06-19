package com.education.drawerdemo.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.EnterYourMobileNumberLayoutBinding

@SuppressLint("StaticFieldLeak")
 var mobileBinding: EnterYourMobileNumberLayoutBinding? = null

public class EnterMobileNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.status_bar_color)

        mobileBinding = EnterYourMobileNumberLayoutBinding.inflate(layoutInflater)
        val view: View = mobileBinding!!.getRoot()
        setContentView(view)

        mobileBinding!!.ivNext.setOnClickListener {
            val intent = Intent(this, VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}
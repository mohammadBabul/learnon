package com.education.drawerdemo.ui.activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.MainActivity
import com.education.drawerdemo.R
import com.education.drawerdemo.SplashActivity
import com.education.drawerdemo.databinding.GiveTeacherInformationLayoutBinding

class InfoTeacherActivity : AppCompatActivity() {
    private var binding: GiveTeacherInformationLayoutBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //chnage status bar color
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.white)

        //view binding
        binding = GiveTeacherInformationLayoutBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)

        binding!!.ivNext.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}
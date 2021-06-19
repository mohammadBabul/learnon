package com.education.drawerdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.education.drawerdemo.R
import com.education.drawerdemo.databinding.SelectOccupationLayoutBinding

class SelectTSActivity : AppCompatActivity() {
    private var binding: SelectOccupationLayoutBinding? = null
    private var selectItem: Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //chnage status bar color
        val window = window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(applicationContext, R.color.white)

        //view binding
        binding = SelectOccupationLayoutBinding.inflate(layoutInflater)
        val view: View = binding!!.getRoot()
        setContentView(view)
        binding!!.rdgroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            selectItem = i
            Log.e("irtem", i.toString());
        })

        binding!!.ivNext.setOnClickListener {
            if(selectItem==R.id.rdstudent){
                val intent = Intent(this, InfoStudentActivity::class.java)
                startActivity(intent)
            }else if(selectItem==R.id.rdTeacher){
                val intent = Intent(this, InfoTeacherActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Please select your occupation!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
package com.example.week04day01hw

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var editTextName:EditText? = null
    private var editTextAge:EditText? = null
    private var editTextHeight:EditText? = null
    private var editTextWorkingStatus:EditText? = null
    private var buttonOpenSecondActivity: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        openSecondActivity()
//        openDial()

    }

    private fun connectViews() {
        buttonOpenSecondActivity = findViewById(R.id.btn_open_second_activity)
        editTextName = findViewById(R.id.et_name_activity_main)
        editTextAge = findViewById(R.id.et_age_activity_main)
        editTextHeight = findViewById(R.id.et_height_activity_main)
        editTextWorkingStatus = findViewById(R.id.et_working_status_activity_main)
    }

    private fun openSecondActivity() {
        buttonOpenSecondActivity?.setOnClickListener {
            val intent:Intent = Intent(this, SecondActivity::class.java)
            val name = editTextName?.text.toString()
            val age = editTextAge?.text.toString()
            val height = editTextHeight?.text.toString()
            val workingStatus = editTextWorkingStatus?.text.toString()
            intent.putExtra("name",name)
            intent.putExtra("age",age)
            intent.putExtra("height",height)
            intent.putExtra("working_status",workingStatus)
            startActivity(intent)
        }

    }

//    private fun openDial() {
//        buttonOpenDial?.setOnClickListener {
//            val intent:Intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:0123456789")
//            startActivity(intent)
//        }
//
//    }

}
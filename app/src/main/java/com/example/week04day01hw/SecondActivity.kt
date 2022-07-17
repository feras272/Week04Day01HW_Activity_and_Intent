package com.example.week04day01hw

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var textViewName:TextView? = null
    private var textViewAge:TextView? = null
    private var textViewHeight:TextView? = null
    private var textViewWorkingStatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        connectViews()
        getValues()
    }

    private fun connectViews() {
        textViewName = findViewById(R.id.tv_name_activity_second)
        textViewAge = findViewById(R.id.tv_age_activity_second)
        textViewHeight = findViewById(R.id.tv_height_activity_second)
        textViewWorkingStatus = findViewById(R.id.tv_working_status_activity_second)
    }

    private fun getValues() {
        val i = intent
        val name = i.getStringExtra("name")
        val age = i.getStringExtra("age")
        val height = i.getStringExtra("height")
        val workingStatus = i.getStringExtra("working_status")

        textViewName?.setText(name)
        textViewAge?.setText(age)
        textViewHeight?.setText(height)
        textViewWorkingStatus?.setText(workingStatus)

    }

}
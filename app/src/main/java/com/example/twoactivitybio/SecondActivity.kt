package com.example.twoactivitybio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val school = intent.getStringExtra("school")
        val year = intent.getStringExtra("year")
        val degree = intent.getStringExtra("degree")
        val major = intent.getStringExtra("major")
        val activities = intent.getStringExtra("activities")


        val output="$firstName $lastName graduated from $school in the year $year with a $degree in $major. Their favorite activites are $activities."
        val textId = findViewById<TextView>(R.id.nameTextView)
        textId.text= output
    }
}
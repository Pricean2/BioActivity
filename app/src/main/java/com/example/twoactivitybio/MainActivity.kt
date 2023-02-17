package com.example.twoactivitybio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var schoolEditText: EditText
    private lateinit var yearEditText: EditText
    private lateinit var degreeEditText: EditText
    private lateinit var activitiesEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameEditText = findViewById(R.id.firstNameEditText)
        lastNameEditText = findViewById(R.id.lastNameEditText)
        schoolEditText = findViewById(R.id.schoolEditText)
        yearEditText = findViewById(R.id.yearEditText)
        degreeEditText = findViewById(R.id.degreeEditText)
        val majorSpinner = findViewById<Spinner>(R.id.majorSpinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.major,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        majorSpinner.adapter = adapter

        activitiesEditText = findViewById(R.id.activitiesEditText)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val school = schoolEditText.text.toString()
            val year = yearEditText.text.toString()
            val degree = degreeEditText.text.toString()
            val major = majorSpinner.selectedItem.toString()
            val activities = activitiesEditText.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("firstName", firstName)
            intent.putExtra("lastName", lastName)
            intent.putExtra("school", school)
            intent.putExtra("year", year)
            intent.putExtra("degree", degree)
            intent.putExtra("major", major)
            intent.putExtra("activities", activities)
            startActivity(intent)
        }

    }
}
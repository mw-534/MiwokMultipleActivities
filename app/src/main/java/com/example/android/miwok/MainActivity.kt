package com.example.android.miwok

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find view that shows the numbers category and set a click listener
        val numbers = findViewById<TextView>(R.id.numbers)
        numbers.setOnClickListener {
            // Create a new intent to open the {@link NumbersActivity}
            val i = Intent(this, NumbersActivity::class.java)
            startActivity(i)
        }

        // Find view that shows the family category and set a click listener
        val family = findViewById<TextView>(R.id.family)
        family.setOnClickListener {
            // Create a new intent to open the {@link FamilyActivity}
            val i = Intent(this, FamilyActivity::class.java)
            startActivity(i)
        }

        // Find view that shows the colors activity and set a click listener
        val colors = findViewById<TextView>(R.id.colors)
        colors.setOnClickListener {
            // Create a new intent to open the {@link ColorsActivity}
            val i = Intent(this, ColorsActivity::class.java)
            startActivity(i)
        }

        // Find view that shows the phrases category and set a click listener
        val phrases = findViewById<TextView>(R.id.phrases)
        phrases.setOnClickListener {
            // Create a new intent to open the {@link PhrasesActivity}
            val i = Intent(this, PhrasesActivity::class.java)
            startActivity(i)
        }


    }

}
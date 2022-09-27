package com.example.numberpicker1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.sephiroth.android.library.numberpicker.NumberPicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberPicker = findViewById<NumberPicker>(R.id.numberPicker)
        numberPicker.maxValue = 200
    }
}
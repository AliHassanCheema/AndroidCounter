package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterText : TextView
    private lateinit var plusClick : Button
    private lateinit var minusClick : Button
    private lateinit var resetClick : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterText = findViewById(R.id.counterTxt )
        plusClick = findViewById(R.id.plusBtn)
        minusClick= findViewById(R.id.minusBtn)
        resetClick = findViewById(R.id.resetBtn)
        var counter  = 0
        plusClick.setOnClickListener{
            counter++
            counterText.text = counter.toString()
        }
        minusClick.setOnClickListener{
            counter--
            counterText.text = counter.toString()
        }
        resetClick.setOnClickListener{
            counter = 0
            counterText.text = counter.toString()
        }
}
}
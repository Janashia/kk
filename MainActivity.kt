package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var resultTextView: TextView
    private var operand: Double = 0.0
    private var operation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

    }

    fun numberClick(clickedView: TextView){

        if (clickedView is TextView){
            var result =resultTextView.text.toString()
            val number = clickedView.text.toString()
            if (result == "0"){
                result = ""
            }

            resultTextView.text = result + number


        }


    }

    fun numberClick(view: android.view.View) {}
    fun operationClick(clickedView: TextView){
        val result = resultTextView.text.toString()
        if (result.isNotEmpty()) {
             operand = result.toDouble()
        }

        operation = clickedView.text.toString()
        resultTextView.text=""


    }

    fun operationClick(view: android.view.View) {}
    fun equalsClick(ClickedView: View){
        var secOpreand: Double = 0.0
        val secOperandText: String = resultTextView.text.toString()
        if (secOperandText.isNotEmpty()){


        }

    }

}
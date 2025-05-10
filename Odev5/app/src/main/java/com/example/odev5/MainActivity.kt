package com.example.odev5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private var total: Double = 0.0
    private var isNewNumber: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display)

        findViewById<Button>(R.id.button0).setOnClickListener { appendDigit("0") }
        findViewById<Button>(R.id.button1).setOnClickListener { appendDigit("1") }
        findViewById<Button>(R.id.button2).setOnClickListener { appendDigit("2") }
        findViewById<Button>(R.id.button3).setOnClickListener { appendDigit("3") }
        findViewById<Button>(R.id.button4).setOnClickListener { appendDigit("4") }
        findViewById<Button>(R.id.button5).setOnClickListener { appendDigit("5") }
        findViewById<Button>(R.id.button6).setOnClickListener { appendDigit("6") }
        findViewById<Button>(R.id.button7).setOnClickListener { appendDigit("7") }
        findViewById<Button>(R.id.button8).setOnClickListener { appendDigit("8") }
        findViewById<Button>(R.id.button9).setOnClickListener { appendDigit("9") }
        findViewById<Button>(R.id.buttonDot).setOnClickListener { appendDot() }
        findViewById<Button>(R.id.buttonAdd).setOnClickListener { add() }
        findViewById<Button>(R.id.buttonReset).setOnClickListener { reset() }
    }

    private fun appendDigit(digit: String) {
        if (isNewNumber) {
            display.text = digit
            isNewNumber = false
        } else {
            if (display.text == "0") {
                if (digit != "0") {
                    display.text = digit
                }
            } else {
                display.text = display.text.toString() + digit
            }
        }
    }

    private fun appendDot() {
        if (isNewNumber) {
            display.text = "0."
            isNewNumber = false
        } else if (!display.text.contains(".")) {
            display.text = display.text.toString() + "."
        }
    }

    private fun add() {
        val number = display.text.toString().toDouble()
        total += number
        if (total == total.toInt().toDouble()) {
            display.text = total.toInt().toString() // Display as integer if no decimal part
        } else {
            display.text = total.toString() // Display with decimals if needed
        }
        isNewNumber = true
    }

    private fun reset() {
        total = 0.0
        display.text = "0"
        isNewNumber = true
    }
}
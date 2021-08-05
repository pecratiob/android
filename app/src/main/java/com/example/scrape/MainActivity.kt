package com.example.scrape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            var resultTextView: TextView = findViewById((R.id.textView1))
            rollDice(resultTextView)
            resultTextView = findViewById((R.id.textView2))
            rollDice(resultTextView)
        }
    }

    private fun rollDice(resultTextView: TextView) {
        val dice = Dice(8)
        val diceRoll = dice.roll()
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
package com.nbrna.ninebuttonrandomnumberassemble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val los = mutableListOf(2,9,5,1,4,6,3,7,8)
    val btlLst = mutableListOf<Button>()
    var currentElOfSeq = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewWinEnd = findViewById<TextView>(R.id.textViewWinEnd)
        btlLst.add(findViewById<Button>(R.id.buttonSetNumber1))
        btlLst.add(findViewById<Button>(R.id.buttonSetNumber2))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber3))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber4))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber5))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber6))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber7))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber8))
                btlLst.add(findViewById<Button>(R.id.buttonSetNumber9))
        for (i in 0..8)
        {
            btlLst[i].text = los[i].toString()
        }
        for (i in 0..8)
        {
            btlLst[i].setOnClickListener {
                if (currentElOfSeq+1 == los[i]) {
                    currentElOfSeq++
                    btlLst[i].text ="+"
                    if (los[i]==1) textViewWinEnd.text = "Good"
                    textViewWinEnd.text = textViewWinEnd.text.toString() + " !"
                }
                if (currentElOfSeq ==9) textViewWinEnd.text = "Win !!!!!!!"
            }
        }




    }
}
package com.example.dinnerpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val Foodlist= arrayListOf("Ham","McDon","Prata","Pizza","Kue")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {
            val random= Random()
            val randomFood= random.nextInt(Foodlist.count())
            selectedFoodtxt.text=Foodlist[randomFood]

        }
        addFoodbtn.setOnClickListener {
            val newFood=addFoodTxt.text.toString()
            Foodlist.add(newFood)
            addFoodTxt.text.clear()
        }
    }
}

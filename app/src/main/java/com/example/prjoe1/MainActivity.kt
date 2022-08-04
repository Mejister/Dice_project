package com.example.prjoe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arkaplan: ImageView=findViewById(R.id.arkap)
        var tuş: Button = findViewById(R.id.bas)
        var yazı: TextView = findViewById(R.id.yazı)
        var diceimage: ImageView =findViewById(R.id.diceimage)

        arkaplan.setImageResource(R.drawable.alex_cdnn2ra0ld8_unsplash)
        tuş.setOnClickListener() {
            var a1: Int = (1..12).random()
            when (a1){
              1->  diceimage.setImageResource(R.drawable.dice_g8198605ea_1280) }


            tuş.text = a1.toString()


            Toast.makeText(this, "12'lik zar atıldı", Toast.LENGTH_SHORT).show()
        }
        }
    }




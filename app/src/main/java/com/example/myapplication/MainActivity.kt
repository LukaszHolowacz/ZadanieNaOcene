package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczbaPierwsza=0
        var liczbaDruga=0
        var wynik=0

        findViewById<Button>(R.id.textbutton).setOnClickListener {
            findViewById<TextView>(R.id.zastapionytext).text =
                findViewById<EditText>(R.id.PoleTekstowe).text
        }
        findViewById<Button>(R.id.dopisztekstbutton).setOnClickListener {
            findViewById<TextView>(R.id.dopisanytext).text =
                findViewById<TextView>(R.id.dopisanytext).text.toString() +
                    findViewById<EditText>(R.id.PoleTekstowe).text.toString()


        }
        findViewById<Button>(R.id.sumabtn).setOnClickListener {
            liczbaPierwsza = findViewById<EditText>(R.id.liczba1pole).text.toString().toInt()
            liczbaDruga = findViewById<EditText>(R.id.liczba2pole).text.toString().toInt()

            wynik = liczbaPierwsza + liczbaDruga

            findViewById<TextView>(R.id.wynikDodawania).text =
                liczbaPierwsza.toString() + " + " + liczbaDruga.toString() + " = " + wynik.toString()
        }
    }
}
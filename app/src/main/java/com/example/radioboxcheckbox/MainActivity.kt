package com.example.radioboxcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var w = ""
        val rb1 = findViewById<RadioButton>(R.id.rb1)
        val rb2 = findViewById<RadioButton>(R.id.rb2)
        val t = findViewById<TextInputEditText>(R.id.TIET)
        val b = findViewById<Button>(R.id.btn)
        val b1 = findViewById<Button>(R.id.btn2)
        val cb1 = findViewById<CheckBox>(R.id.cb1)
        val cb2 = findViewById<CheckBox>(R.id.cb2)
        val cb3 = findViewById<CheckBox>(R.id.cb3)
        val cb4 = findViewById<CheckBox>(R.id.cb4)
        b.setOnClickListener {

            rb1.isEnabled = false
            rb2.isEnabled = false

            cb1.isEnabled = false
            cb2.isEnabled = false
            cb3.isEnabled = false
            cb4.isEnabled = false

            t.isEnabled = false;

            if (rb1.isChecked) {

                w = w + "Płeć: Mężczyzna\n"

            }

            if (rb2.isChecked) {

                w = w + "Płeć: Kobieta\n"

            }

            w = w + t.text + "\n"

            if (cb1.isChecked) {

                w = w + "Zainteresowanie: Sport\n"

            }

            if (cb2.isChecked) {

                w = w + "Zainteresowanie: Muzyka\n"

            }

            if (cb3.isChecked) {

                w = w + "Zainteresowanie: Turystyka\n"

            }

            if (cb4.isChecked) {

                w = w + "Zainteresowanie: Gry\n"

            }

            findViewById<TextView>(R.id.WynikView).text = w
        }

        b1.setOnClickListener {

            rb1.isEnabled = true
            rb2.isEnabled = true

            cb1.isEnabled = true
            cb2.isEnabled = true
            cb3.isEnabled = true
            cb4.isEnabled = true

            t.isEnabled = true;

            findViewById<TextView>(R.id.WynikView).text = " "
            w = " "

        }

    }
}
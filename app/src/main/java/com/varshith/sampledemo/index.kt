package com.varshith.sampledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class index : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var b1: String="https://drive.google.com/uc?export=download&id=1QOfFqqDai1QkB832K-tn1yKLEWStILW6"
        var b : String="https://drive.google.com/uc?export=download&id=15oISqz_WDp6bteffyG4wa48q-R10-yRM"
        var b2 : String="https://drive.google.com/uc?export=download&id=1M_OHWYPiW_ryyH10NkY8m_7BYkhr_kYP"
        var b3 : String="https://drive.google.com/uc?export=download&id=1oeOYN0XXG0CDpIheSjeT6UYmRIMgHkcQ"
        var b4 : String="https://drive.google.com/uc?export=download&id=1B2pWXmQxCaAJ8IySP63EilQZ7Z1k_Tke"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        this.supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

        // Displaying the custom layout in the ActionBar
        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setCustomView(R.layout.my_layout)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_key", b)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_key", b1)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_key", b2)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_key", b3)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message_key", b4)
            startActivity(intent)
        }
    }
}
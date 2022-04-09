package com.varshith.sampledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class index : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        var b1: String="https://drive.google.com/uc?export=download&id=1QOfFqqDai1QkB832K-tn1yKLEWStILW6"
        var b : String="https://drive.google.com/uc?export=download&id=15oISqz_WDp6bteffyG4wa48q-R10-yRM"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
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
    }
}
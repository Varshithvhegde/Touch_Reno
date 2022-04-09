package com.varshith.sampledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.ar.sceneform.ux.ArFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var message: String? = intent.getStringExtra("message_key")
        (supportFragmentManager.findFragmentById(R.id.arFragment) as ArFragment)
            .setOnTapPlaneGlbModel(message)
        val bu: Button = findViewById(R.id.back)
        bu.setOnClickListener {
            val intent = Intent(this, index::class.java)

            startActivity(intent)
        }
    }
}
//https://drive.google.com/uc?export=download&id=15oISqz_WDp6bteffyG4wa48q-R10-yRM
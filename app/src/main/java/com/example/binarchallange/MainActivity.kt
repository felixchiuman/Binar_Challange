package com.example.binarchallange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tokopediaActivityBtn = findViewById<Button>(R.id.tokopedia_activity_btn)
        val gojekActivityBtn = findViewById<Button>(R.id.gojek_activity_btn)

        tokopediaActivityBtn.setOnClickListener {
            val intent = Intent (this,TokopediaActivity::class.java)
            startActivity(intent)
        }

        gojekActivityBtn.setOnClickListener {
            val intent = Intent (this,GojekActivity::class.java)
            startActivity(intent)
        }
    }
}
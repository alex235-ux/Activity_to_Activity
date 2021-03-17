package com.koroche.activity_to_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val button = findViewById<Button>(R.id.button_A1)
        button.setOnClickListener {
            val intent = Intent (this,main_activity::class.java)
            startActivity(intent)
        }
    }
}
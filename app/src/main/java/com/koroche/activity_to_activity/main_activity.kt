package com.koroche.activity_to_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class main_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button = findViewById<Button>(R.id.button_A2)
        button.setOnClickListener {
            val intent = Intent (this,MainMenu::class.java)
            startActivity(intent)
    }
}}
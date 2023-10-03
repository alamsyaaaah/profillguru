package com.example.profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 =  findViewById<Button>(R.id.button)
        button1.setOnClickListener{
            val intent1 = Intent (this, MainActivity3::class.java)
            startActivity(intent1)
        }
        var button4 =  findViewById<Button>(R.id.button2)
        button4.setOnClickListener{
            val intent1 = Intent (this, MainActivity2::class.java)
            startActivity(intent1)}
    }
}
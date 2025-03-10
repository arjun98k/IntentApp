package com.example.inntentapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       val fromact = getIntent()
       val title = fromact.getStringExtra("title")
       val studentname = fromact.getStringExtra("StudentName")
       val rollno = fromact.getIntExtra("Roll No", 0)

        val studinfo = findViewById<TextView>(R.id.studinfo)
        studinfo.setText("Roll No: $rollno + $studentname")

        getSupportActionBar()?.setTitle(title)

    }
}
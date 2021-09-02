package com.example.taskbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageClick = findViewById<ImageView>(R.id.imageView2)
        var textClick = findViewById<TextView>(R.id.textView2)

        textClick.setOnClickListener {
            imageClick.visibility = View.VISIBLE
            textClick.setText("I am passionate, driven and committed to finish KodeCamp as one of the best")
        }


    }
}
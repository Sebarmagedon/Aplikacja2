package com.example.a1apka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 1
        findViewById<Button>(R.id.button).setOnClickListener {
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.merc)
                x = 2
            } else if (x == 0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.fer1)
                x = 1
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.lambo)
                x = 0

            }
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.lambo)
                x = 0
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.fer1)
                x = 1
            } else if (x == 0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.merc)
                x = 2
            }
        }

    }


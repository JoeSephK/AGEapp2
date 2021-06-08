package com.joseph.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.btnDOB)
        button.setOnClickListener {

            val a = findViewById<EditText>(R.id.etDOB)
            val b = a.text.toString().toInt()

            val DOB: Int = 2021 - b

            val ans = findViewById<TextView>(R.id.tvDOB)
            ans.text = " Your age is $DOB"

            val image = findViewById<ImageView>(R.id.imageView)
            val img = R.drawable.stanlendlogo3
            var newImg = img

            image.setImageResource(newImg)
            newImg = if (newImg == R.drawable.age) R.mipmap.ic_launcher
            else R.drawable.stanlendlogo3
            image.setImageResource(newImg)


        }
    }
}
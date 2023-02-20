package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgIntent1= findViewById<ImageView>(R.id.imageView1)
        val imgIntent2=findViewById<ImageView>(R.id.imageView2)
        val imgIntent3=findViewById<ImageView>(R.id.imageView3)
        val imgIntent4=findViewById<ImageView>(R.id.imageView4)

        imgIntent1.setOnClickListener {
            //open an empty activity

            intent = Intent(applicationContext, Activity1::class.java)
            startActivity(intent)
        }

        imgIntent2.setOnClickListener {
            //open an empty activity

            intent = Intent(applicationContext, Activity2::class.java)
            startActivity(intent)
        }
        imgIntent3.setOnClickListener {
            //open an empty activity

            intent = Intent(applicationContext, Activity3::class.java)
            startActivity(intent)
        }
        imgIntent4.setOnClickListener {
            //open an empty activity

            intent = Intent(applicationContext, Activity4::class.java)
            startActivity(intent)
        }

    }
}

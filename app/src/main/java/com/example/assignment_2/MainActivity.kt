package com.example.assignment_2

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*


  class MainActivity() : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
         val Button =findViewById(R.id.button) as Button
         val View = findViewById(android.R.id.content) as View
         Button.setOnClickListener(new View.OnClickListner) {
            @Override
            void onClick(View v)
         }
 }


}
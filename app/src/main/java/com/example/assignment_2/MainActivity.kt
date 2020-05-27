package com.example.assignment_2

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


  class MainActivity() : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
         setSupportActionBar(toolbar)
         val edit1 = findViewById<EditText>(R.id.Edittext1)
         val edit2 = findViewById<EditText>(R.id.Edittext2)
         val Button =findViewById(R.id.button) as Button
        Button.setOnClickListener({
            val uname = edit1.text.toString()
            val pwd = edit2.text.toString()
            if (uname == "testusername" && pwd == "testpassword") {
                val snack = Snackbar.make(it, "Login Success", Snackbar.LENGTH_LONG)
                snack.setAction("OK") {
                    println("Login ")
                }
                snack.show()
            }
            else {
                val snackbar = Snackbar.make(it, "Username/Password is incorrect",Snackbar.LENGTH_LONG)
                snackbar.show()

            }

        })
         }
 }



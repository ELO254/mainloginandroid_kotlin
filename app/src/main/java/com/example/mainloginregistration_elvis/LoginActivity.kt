package com.example.mainloginregistration_elvis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var gotoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        gotoregister=findViewById(R.id.txt_gotoregister)
        gotoregister.setOnClickListener {
            var intenet=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
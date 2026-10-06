package com.MuhammadSaudNaseer.i210819

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Returns to Log in via standard back stack[cite: 24]
        findViewById<TextView>(R.id.tvAlreadyHaveAccount).setOnClickListener {
            finish()
        }
    }
}
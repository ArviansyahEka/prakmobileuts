package com.example.prakmobileuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        Handler().postDelayed({
                val intent = Intent(this@splashscreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
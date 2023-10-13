package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityDetailsavengerBinding


class Detailsavenger : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsavengerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsavengerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detailsavenger)

        with(binding) {
            back.setOnClickListener {
                val intent = Intent(this@Detailsavenger, Dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}
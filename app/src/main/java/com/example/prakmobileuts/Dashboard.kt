package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val uname = intent.getStringExtra(MainActivity.uname)
            getusername.text = uname
            endgame.setOnClickListener {
                val intent = Intent(this@Dashboard, Detailsavenger::class.java)
                startActivity(intent)
            }
        }
    }
}

package com.example.prakmobileuts

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        const val uname = "uname"
        const val pass = "pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            login.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, Dashboard::class.java)
                intentToSecondActivity.putExtra(uname, username.text.toString())
                intentToSecondActivity.putExtra(pass, password.text.toString())
                startActivity(intentToSecondActivity)
            }
        }


    }
}
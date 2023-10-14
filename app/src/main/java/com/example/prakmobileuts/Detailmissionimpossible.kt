// Detailsavenger.kt
package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityDetailmissionimpossibleBinding

class Detailmissionimpossible : AppCompatActivity() {
    private lateinit var binding: ActivityDetailmissionimpossibleBinding

    companion object {
        const val judulkur = "judulkur"
        const val genrekur = "genrekur"
        const val gambarkur = "gambarkur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailmissionimpossibleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            backbutton.setOnClickListener {
                val intent = Intent(this@Detailmissionimpossible, Dashboard::class.java)
                startActivity(intent)
            }

            beli.setOnClickListener {
                val juduldetail = judul.text.toString()
                val genredetail = genre.text.toString()
                val intent = Intent(this@Detailmissionimpossible, Checkoutavenger::class.java)
                intent.putExtra(judulkur, juduldetail)
                intent.putExtra(genrekur, genredetail)
                intent.putExtra(gambarkur, R.drawable.missionimpossible)
                startActivity(intent)
            }
        }
    }
}

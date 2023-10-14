// Detailsavenger.kt
package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityDetailspectreBinding

class Detailspectre : AppCompatActivity() {
    private lateinit var binding: ActivityDetailspectreBinding

    companion object {
        const val judulkur = "judulkur"
        const val genrekur = "genrekur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailspectreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            backbutton.setOnClickListener {
                val intent = Intent(this@Detailspectre, Dashboard::class.java)
                startActivity(intent)
            }

            beli.setOnClickListener {
                val juduldetail = judul.text.toString()
                val genredetail = genre.text.toString()
                val intent = Intent(this@Detailspectre, Checkoutavenger::class.java)
                intent.putExtra(judulkur, juduldetail)
                intent.putExtra(genrekur, genredetail)
                startActivity(intent)
            }
        }
    }
}

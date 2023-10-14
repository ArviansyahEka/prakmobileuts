// Detailsavenger.kt
package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityDetailsgranturismoBinding

class Detailsgranturismo : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsgranturismoBinding

    companion object {
        const val judulkur = "judulkur"
        const val genrekur = "genrekur"
        const val gambarkur = "gambarkur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsgranturismoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            backbutton.setOnClickListener {
                val intent = Intent(this@Detailsgranturismo, Dashboard::class.java)
                startActivity(intent)
            }

            beli.setOnClickListener {
                val juduldetail = judul.text.toString()
                val genredetail = genre.text.toString()

                val intent = Intent(this@Detailsgranturismo, Checkoutavenger::class.java)
                intent.putExtra(judulkur, juduldetail)
                intent.putExtra(genrekur, genredetail)
                intent.putExtra(gambarkur, R.drawable.granturismo)
                startActivity(intent)
            }
        }
    }
}

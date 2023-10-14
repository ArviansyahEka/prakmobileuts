// Receipt.kt
package com.example.prakmobileuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prakmobileuts.databinding.ActivityReceiptBinding

class Receipt : AppCompatActivity() {
    private lateinit var binding: ActivityReceiptBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReceiptBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            backbutton.setOnClickListener {
                val intent = Intent(this@Receipt, Dashboard::class.java)
                startActivity(intent)
            }
            val receivedJudul = intent.getStringExtra("JUDUL_EXTRA")
            ambiljudul.text = receivedJudul

            val receivedGenre = intent.getStringExtra("GENRE_EXTRA")
            ambilgenre.text = receivedGenre

            val receivedbioskop = intent.getStringExtra("BIOSKOP_EXTRA")
            ambilbioskop.text = receivedbioskop


            val receivedJenisseat = intent.getStringExtra("JENISSEAT_EXTRA")
            ambilduduk.text = receivedJenisseat

            val receivedJenispembayaran = intent.getStringExtra("JENISPEMBAYARAN_EXTRA")
            ambilpembayaran.text = receivedJenispembayaran

            val recievedTanggal = intent.getStringExtra("TANGGAL_EXTRA")
            ambilwaktu.text = recievedTanggal

            val recievedHarga = intent.getIntExtra("HARGA_EXTRA",0 )
            val harga = recievedHarga

            ambilharga.text="Rp"+harga.toString()

            val recieveSumfee = intent.getIntExtra("FEE_EXTRA",0 )
            val sumfee = recieveSumfee

            ambilsumfee.text = "Rp"+sumfee.toString()

            val total = harga+recieveSumfee
            ambiltotal.text="Rp"+total.toString()

        }
    }
}

package kz.lesa.medicalcalculator.tabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kz.lesa.medicalcalculator.databinding.ActivityDonorBinding

class DonorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDonorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToAcceptor.setOnClickListener() {
            onClickGoToAcceptor()
        }
    }

    private fun onClickGoToAcceptor (){
        val sendIntent = Intent (this, AcceptorActivity ::class.java)
        sendIntent.putExtra("key", "alohomora")
        startActivity(sendIntent)
    }
}
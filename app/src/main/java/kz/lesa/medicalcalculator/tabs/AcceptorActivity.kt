package kz.lesa.medicalcalculator.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.lesa.medicalcalculator.databinding.ActivityAcceptorBinding

class AcceptorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAcceptorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcceptorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("key")
        binding.tvMessage.text = message
    }
}
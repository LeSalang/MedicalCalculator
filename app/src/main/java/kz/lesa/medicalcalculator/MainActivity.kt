package kz.lesa.medicalcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.lesa.medicalcalculator.databinding.ActivityMainBinding
import kz.lesa.medicalcalculator.tabs.BMI_Activity
import kz.lesa.medicalcalculator.tabs.DonorActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.btnBMI.setOnClickListener() {
            supportFragmentManager.beginTransaction().replace(R.id.lt_calculator,BMI_Fragment()).commitNow()
        }
        */

        initBtnBMI()
        initDonor()
    }

    private fun initBtnBMI (){
        binding.btnBMI.setOnClickListener {
            val sendIntent = Intent(this, BMI_Activity::class.java)
            startActivity(sendIntent)
        }
    }

    private fun initDonor (){
        binding.btnDonor.setOnClickListener {
            val sendIntent = Intent(this, DonorActivity::class.java)
            startActivity(sendIntent)
        }
    }
}
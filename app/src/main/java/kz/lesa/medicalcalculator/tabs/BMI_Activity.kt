package kz.lesa.medicalcalculator.tabs

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kz.lesa.medicalcalculator.databinding.ActivityBmiBinding

class BMI_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBmiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initCalculate()
    }

    private fun initCalculate(){
        binding.btnBmiCalculate.setOnClickListener{
            binding.txtBmiResult.visibility = View.VISIBLE

            val h : String = binding.etHeight.text.toString()
            val w : String = binding.etWeight.text.toString()
            val height : Double = h.toDouble()
            val weight : Double = w.toDouble()

            val bmi : Double = weight / ((height*height)/10000)
            when  {
                bmi < 16.0 -> {
                    binding.txtBmiResult.text = "выраженный дефицит массы тела"
                }
                bmi >= 16.0 && bmi < 18.5 -> {
                    binding.txtBmiResult.text = "недостаточная масса тела"
                }
                bmi >= 18.5 && bmi < 25.0 -> {
                    binding.txtBmiResult.text = "нормальная масса тела"
                }
                bmi >= 25.0 && bmi < 30.0 -> {
                    binding.txtBmiResult.text = "избыточная масса тела"
                }
                bmi >= 30.0 && bmi < 35.0 -> {
                    binding.txtBmiResult.text = "ожирение 1 степени"
                }
                bmi >= 35.0 && bmi < 40.0 -> {
                    binding.txtBmiResult.text = "ожирение 2 степени"
                }
                bmi >= 40.0 -> {
                    binding.txtBmiResult.text = "ожирение 3 степени"
                }
                else -> {
                    binding.txtBmiResult.text = "ошибка в подсчётах"
                }
            }
    }
    }
}
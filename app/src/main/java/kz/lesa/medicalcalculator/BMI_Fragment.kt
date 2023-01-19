package kz.lesa.medicalcalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.View.inflate
import android.view.ViewGroup
import kz.lesa.medicalcalculator.databinding.FragmentBmiBinding

class BMI_Fragment : Fragment() {
    lateinit var binding : FragmentBmiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBmiBinding.inflate(inflater)
        return binding.root


        binding.btnBmiCalculate.setOnClickListener(){
            val height : Double = binding.etHeight.text.toString().toDouble()
            val weight : Double = binding.etWeight.text.toString().toDouble()
            val bmi : Double = weight / ((height*height)/10000)
            when  {
                bmi < 16.0 -> {
                    binding.txtBmiResult.visibility = View.VISIBLE
                    binding.txtBmiResult.text = "выраженный дефицит массы тела"
                }
                bmi >= 16.0 && bmi < 18.5 -> {
                    binding.txtBmiResult.visibility = View.VISIBLE
                    binding.txtBmiResult.text = "недостаточная масса тела"
                }
                bmi >= 18.5 && bmi < 25.0 -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "нормальная масса тела"
                    }
                bmi >= 25.0 && bmi < 30.0 -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "избыточная масса тела"
                    }
                bmi >= 30.0 && bmi < 35.0 -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "ожирение 1 степени"
                    }
                bmi >= 35.0 && bmi < 40.0 -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "ожирение 2 степени"
                    }
                bmi >= 40.0 -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "ожирение 3 степени"
                }
                else -> {
                        binding.txtBmiResult.visibility = View.VISIBLE
                        binding.txtBmiResult.text = "ошибка в подсчётах"
                }
            }
        }
    }



}
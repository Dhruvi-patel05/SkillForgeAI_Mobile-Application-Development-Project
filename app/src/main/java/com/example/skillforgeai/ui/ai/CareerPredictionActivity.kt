package com.example.skillforgeai.ui.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityCareerPredictionBinding

class CareerPredictionActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityCareerPredictionBinding

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityCareerPredictionBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.btnPredict.setOnClickListener {

            binding.txtCareer.text =
                "Android Developer"
        }
    }
}
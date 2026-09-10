package com.example.skillforgeai.ui.placement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityCodingPracticeBinding

class CodingPracticeActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityCodingPracticeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityCodingPracticeBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.txtProblem.text =
            "Reverse a String using Kotlin"
    }
}
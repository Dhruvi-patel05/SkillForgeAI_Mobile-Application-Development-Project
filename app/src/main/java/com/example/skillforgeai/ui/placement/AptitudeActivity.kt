package com.example.skillforgeai.ui.placement


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityAptitudeBinding

class AptitudeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAptitudeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityAptitudeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.txtQuestion.text =
            "What is 25% of 400 ?"

        binding.txtAnswer.text =
            "Answer : 100"
    }
}
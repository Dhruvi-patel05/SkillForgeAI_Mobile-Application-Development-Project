package com.example.skillforgeai.ui.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityRoadmapGeneratorBinding

class RoadmapGeneratorActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityRoadmapGeneratorBinding

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityRoadmapGeneratorBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.btnGenerate.setOnClickListener {

            binding.txtRoadmap.text =
                """
                Month 1 → Kotlin
                
                Month 2 → Android
                
                Month 3 → Firebase
                
                Month 4 → Projects
                
                Month 5 → Placement Preparation
                """.trimIndent()
        }
    }
}
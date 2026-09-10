package com.example.skillforgeai.ui.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivitySkillGapBinding

class SkillGapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySkillGapBinding

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding = ActivitySkillGapBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.txtResult.text =
            """
            Missing Skills:
            
            • DSA
            
            • System Design
            
            • AWS
            
            • DevOps
            """.trimIndent()
    }
}
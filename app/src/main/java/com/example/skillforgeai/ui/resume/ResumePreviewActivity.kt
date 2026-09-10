package com.example.skillforgeai.ui.resume

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityResumePreviewBinding

class ResumePreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResumePreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResumePreviewBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.txtPreview.text =
            """
            Dhruvi Patel
            
            Android Developer
            
            Kotlin
            Firebase
            MVVM
            UI/UX
            
            Projects:
            SkillForgeAI
            Smart Home Automation
            """.trimIndent()
    }
}
package com.example.skillforgeai.ui.resume

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityResumeTemplatesBinding

class ResumeTemplatesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResumeTemplatesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResumeTemplatesBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.txtTemplate.text =
            "Professional Resume Templates"
    }
}
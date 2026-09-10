package com.example.skillforgeai.ui.resume

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityResumeBuilderBinding

class ResumeBuilderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResumeBuilderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResumeBuilderBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnAnalyzeResume.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ResumeAnalyzerActivity::class.java
                )
            )
        }

        binding.btnTemplates.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ResumeTemplatesActivity::class.java
                )
            )
        }

        binding.btnPreviewResume.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ResumePreviewActivity::class.java
                )
            )
        }
    }
}
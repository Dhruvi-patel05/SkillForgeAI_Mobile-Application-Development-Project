package com.example.skillforgeai.ui.resume

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityResumeAnalyzerBinding

class ResumeAnalyzerActivity :
    AppCompatActivity() {

    private lateinit var binding: ActivityResumeAnalyzerBinding

    private val viewModel: ResumeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResumeAnalyzerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        observeData()
    }

    private fun observeData() {

        viewModel.resumeScore.observe(this) {

            binding.txtScore.text =
                "Resume Score : $it%"
        }

        viewModel.suggestions.observe(this) {

            binding.txtSuggestions.text =
                it.joinToString("\n")
        }
    }
}
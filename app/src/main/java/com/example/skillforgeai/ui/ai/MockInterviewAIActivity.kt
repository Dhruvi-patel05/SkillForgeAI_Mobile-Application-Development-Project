package com.example.skillforgeai.ui.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityMockInterviewAiBinding

class MockInterviewAIActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityMockInterviewAiBinding

    private val questions = listOf(
        "What is OOP?",
        "What is MVVM?",
        "What is Firebase?",
        "What is RecyclerView?"
    )

    private var currentIndex = 0

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityMockInterviewAiBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.txtQuestion.text =
            questions[currentIndex]

        binding.btnNextQuestion.setOnClickListener {

            currentIndex++

            if (currentIndex < questions.size) {

                binding.txtQuestion.text =
                    questions[currentIndex]

            } else {

                binding.txtQuestion.text =
                    "Interview Completed 🎉"
            }
        }
    }
}
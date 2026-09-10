package com.example.skillforgeai.ui.placement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityMockInterviewBinding

class MockInterviewActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityMockInterviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityMockInterviewBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.txtInterviewQuestion.text =
            "Explain MVVM Architecture."
    }
}
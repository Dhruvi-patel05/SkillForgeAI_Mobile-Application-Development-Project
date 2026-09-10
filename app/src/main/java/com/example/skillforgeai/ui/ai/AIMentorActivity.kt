package com.example.skillforgeai.ui.ai

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skillforgeai.databinding.ActivityAiMentorBinding

class AIMentorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAiMentorBinding

    private val viewModel:
            AIViewModel by viewModels()

    private lateinit var adapter:
            ChatAdapter

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityAiMentorBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        adapter =
            ChatAdapter(mutableListOf())

        binding.rvChat.layoutManager =
            LinearLayoutManager(this)

        binding.rvChat.adapter =
            adapter

        observeMessages()

        binding.btnSend.setOnClickListener {

            val message = binding.etMessage.text.toString()

            if (message.isNotEmpty()) {

                viewModel.sendMessage(message)

                binding.etMessage.text?.clear()
            }
        }
    }

    private fun observeMessages() {

        viewModel.messages.observe(this) {

            adapter =
                ChatAdapter(it)

            binding.rvChat.adapter = adapter

            binding.rvChat.scrollToPosition(
                it.size - 1
            )
        }
    }
}
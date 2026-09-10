package com.example.skillforgeai.ui.ai

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.data.model.ChatMessage

class AIViewModel : ViewModel() {

    private val _messages =
        MutableLiveData<MutableList<ChatMessage>>()

    val messages: LiveData<MutableList<ChatMessage>>
        get() = _messages

    init {
        _messages.value = mutableListOf()
    }

    fun sendMessage(question: String) {

        val currentMessages =
            _messages.value ?: mutableListOf()

        currentMessages.add(
            ChatMessage(
                message = question,
                isUser = true
            )
        )

        currentMessages.add(
            ChatMessage(
                message = generateResponse(question),
                isUser = false
            )
        )

        _messages.value = currentMessages
    }

    private fun generateResponse(
        question: String
    ): String {

        return when {

            question.contains(
                "android",
                true
            ) ->
                "Start with Kotlin, XML, Firebase and MVVM."

            question.contains(
                "placement",
                true
            ) ->
                "Practice DSA, Aptitude, SQL and Mock Interviews."

            else ->
                "AI Mentor is analyzing your query."
        }
    }
}
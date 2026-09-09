package com.example.skillforgeai.data.model

data class ChatMessage(
    val messageId: String = "",
    val message: String = "",
    val sender: String = "",
    val timestamp: Long = System.currentTimeMillis(),
    val isUser: Boolean = true
)
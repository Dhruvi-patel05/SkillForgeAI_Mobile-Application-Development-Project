package com.example.skillforgeai.data.model

data class AptitudeQuestion(
    val questionId: String = "",
    val question: String = "",
    val optionA: String = "",
    val optionB: String = "",
    val optionC: String = "",
    val optionD: String = "",
    val correctAnswer: String = "",
    val explanation: String = "",
    val category: String = "",
    val difficulty: String = ""
)
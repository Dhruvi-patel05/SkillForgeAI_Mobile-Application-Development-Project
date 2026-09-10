package com.example.skillforgeai.data.model

data class StudyPlan(
    val planId: String = "",
    val userId: String = "",
    val date: String = "",
    val topics: List<String> = emptyList(),
    val estimatedHours: Double = 0.0,
    val completed: Boolean = false
)
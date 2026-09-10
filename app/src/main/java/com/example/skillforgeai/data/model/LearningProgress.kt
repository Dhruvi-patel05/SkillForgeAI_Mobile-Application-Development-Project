package com.example.skillforgeai.data.model

data class LearningProgress(
    val userId: String = "",
    val courseId: String = "",
    val completedLessons: Int = 0,
    val totalLessons: Int = 0,
    val progressPercentage: Int = 0,
    val lastAccessed: Long = 0L,
    val learningHours: Double = 0.0
)
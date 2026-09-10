package com.example.skillforgeai.data.model

data class WeeklyReport(
    val reportId: String = "",
    val userId: String = "",
    val weekStart: String = "",
    val weekEnd: String = "",
    val completedCourses: Int = 0,
    val skillsLearned: Int = 0,
    val learningHours: Double = 0.0,
    val placementScore: Int = 0
)
package com.example.skillforgeai.data.model

data class Achievement(
    val achievementId: String = "",
    val title: String = "",
    val description: String = "",
    val icon: String = "",
    val earnedDate: Long = 0L,
    val points: Int = 0
)
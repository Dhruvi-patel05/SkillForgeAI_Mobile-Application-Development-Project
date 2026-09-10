package com.example.skillforgeai.data.model

data class Certificate(
    val certificateId: String = "",
    val userId: String = "",
    val courseId: String = "",
    val courseName: String = "",
    val issueDate: Long = 0L,
    val certificateUrl: String = "",
    val certificateNumber: String = "",
    val organization: String = "SkillForgeAI"
)
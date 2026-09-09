package com.example.skillforgeai.data.model

data class Resume(
    val resumeId: String = "",
    val summary: String = "",
    val education: String = "",
    val skills: List<String> = emptyList(),
    val projects: List<String> = emptyList(),
    val experience: List<String> = emptyList(),
    val certifications: List<String> = emptyList(),
    val atsScore: Int = 0
)
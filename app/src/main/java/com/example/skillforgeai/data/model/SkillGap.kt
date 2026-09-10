package com.example.skillforgeai.data.model

data class SkillGap(
    val companyName: String = "",
    val currentSkills: List<String> = emptyList(),
    val requiredSkills: List<String> = emptyList(),
    val missingSkills: List<String> = emptyList(),
    val score: Int = 0
)
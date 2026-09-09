package com.example.skillforgeai.data.model

data class PlacementScore(
    val overallScore: Int = 0,
    val resumeScore: Int = 0,
    val codingScore: Int = 0,
    val aptitudeScore: Int = 0,
    val communicationScore: Int = 0,
    val learningConsistency: Int = 0,
    val certificationScore: Int = 0,
    val suggestions: List<String> = emptyList()
)
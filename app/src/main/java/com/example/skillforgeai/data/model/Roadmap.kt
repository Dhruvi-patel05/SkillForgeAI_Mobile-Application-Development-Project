package com.example.skillforgeai.data.model

data class Roadmap(
    val roadmapId: String = "",
    val title: String = "",
    val duration: String = "",
    val tasks: List<String> = emptyList()
)
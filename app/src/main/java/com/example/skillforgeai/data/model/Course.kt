package com.example.skillforgeai.data.model

data class Course(
    val courseId: String = "",
    val title: String = "",
    val description: String = "",
    val instructor: String = "",
    val duration: String = "",
    val imageUrl: String = "",
    val progress: Int = 0,
    val rating: Double = 0.0,
    val category: String = ""
)
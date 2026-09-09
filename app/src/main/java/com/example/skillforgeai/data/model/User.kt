package com.example.skillforgeai.data.model

data class User(
    val userId: String = "",
    val name: String = "",
    val email: String = "",
    val mobile: String = "",
    val profileImage: String = "",
    val education: String = "",
    val skills: List<String> = emptyList(),
    val interests: List<String> = emptyList(),
    val createdAt: Long = System.currentTimeMillis()
)
package com.example.skillforgeai.domain.usecase.courses

import com.example.skillforgeai.domain.repository.ICourseRepository

class GetCourseDetailsUseCase(
    private val repository: ICourseRepository
) {
    suspend operator fun invoke(
        courseId: String
    ) = repository.getCourseById(courseId)
}
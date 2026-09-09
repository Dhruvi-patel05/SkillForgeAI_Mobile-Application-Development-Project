package com.example.skillforgeai.domain.usecase.courses

import com.example.skillforgeai.domain.repository.ICourseRepository

class GetCoursesUseCase(
    private val repository: ICourseRepository
) {
    suspend operator fun invoke() =
        repository.getCourses()
}
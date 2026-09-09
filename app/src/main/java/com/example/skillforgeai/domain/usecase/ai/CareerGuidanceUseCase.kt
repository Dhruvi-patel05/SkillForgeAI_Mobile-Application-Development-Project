package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class CareerGuidanceUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        prompt: String
    ) = repository.generateCareerGuidance(prompt)
}
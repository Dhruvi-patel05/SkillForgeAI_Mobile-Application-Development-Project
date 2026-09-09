package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class GenerateInterviewQuestionsUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        role: String,
        company: String
    ) = repository.generateInterviewQuestions(
        role,
        company
    )
}
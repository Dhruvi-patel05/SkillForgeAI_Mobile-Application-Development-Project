package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class ResumeAnalysisUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        resumeText: String
    ) = repository.analyzeResume(resumeText)
}
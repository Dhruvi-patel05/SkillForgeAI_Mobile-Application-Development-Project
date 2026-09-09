package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class SkillGapUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        skills: String,
        company: String
    ) = repository.detectSkillGap(
        skills,
        company
    )
}
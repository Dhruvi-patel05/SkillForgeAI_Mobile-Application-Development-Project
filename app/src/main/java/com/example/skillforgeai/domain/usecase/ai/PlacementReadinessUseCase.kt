package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class PlacementReadinessUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        resumeScore: Int,
        codingScore: Int,
        aptitudeScore: Int
    ) = repository.calculatePlacementReadiness(
        resumeScore,
        codingScore,
        aptitudeScore
    )
}
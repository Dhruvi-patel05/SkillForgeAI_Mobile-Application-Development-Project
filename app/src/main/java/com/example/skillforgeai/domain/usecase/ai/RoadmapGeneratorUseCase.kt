package com.example.skillforgeai.domain.usecase.ai

import com.example.skillforgeai.domain.repository.IAIRepository

class RoadmapGeneratorUseCase(
    private val repository: IAIRepository
) {
    suspend operator fun invoke(
        goal: String
    ) = repository.generateRoadmap(goal)
}
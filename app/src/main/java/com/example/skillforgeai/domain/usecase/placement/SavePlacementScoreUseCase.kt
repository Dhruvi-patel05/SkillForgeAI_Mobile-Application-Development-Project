package com.example.skillforgeai.domain.usecase.placement

import com.example.skillforgeai.data.model.PlacementScore
import com.example.skillforgeai.domain.repository.IPlacementRepository

class SavePlacementScoreUseCase(
    private val repository: IPlacementRepository
) {
    suspend operator fun invoke(
        userId: String,
        score: PlacementScore
    ) = repository.savePlacementScore(userId, score)
}
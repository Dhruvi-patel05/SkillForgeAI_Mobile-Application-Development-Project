package com.example.skillforgeai.domain.usecase.placement

import com.example.skillforgeai.domain.repository.IPlacementRepository

class GetPlacementScoreUseCase(
    private val repository: IPlacementRepository
) {
    suspend operator fun invoke(
        userId: String
    ) = repository.getPlacementScore(userId)
}
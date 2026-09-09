package com.example.skillforgeai.domain.usecase.dashboard

import com.example.skillforgeai.domain.repository.IUserRepository

class GetDashboardDataUseCase(
    private val repository: IUserRepository
) {
    suspend operator fun invoke(
        userId: String
    ) = repository.getUser(userId)
}
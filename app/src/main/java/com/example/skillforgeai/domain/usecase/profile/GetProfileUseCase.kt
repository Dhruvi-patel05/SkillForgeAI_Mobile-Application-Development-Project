package com.example.skillforgeai.domain.usecase.profile

import com.example.skillforgeai.domain.repository.IUserRepository

class GetProfileUseCase(
    private val repository: IUserRepository
) {
    suspend operator fun invoke(
        userId: String
    ) = repository.getUser(userId)
}
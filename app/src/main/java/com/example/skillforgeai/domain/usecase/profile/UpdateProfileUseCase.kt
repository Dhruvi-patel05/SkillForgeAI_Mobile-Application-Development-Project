package com.example.skillforgeai.domain.usecase.profile

import com.example.skillforgeai.data.model.User
import com.example.skillforgeai.domain.repository.IUserRepository

class UpdateProfileUseCase(
    private val repository: IUserRepository
) {
    suspend operator fun invoke(
        user: User
    ) = repository.updateUser(user)
}
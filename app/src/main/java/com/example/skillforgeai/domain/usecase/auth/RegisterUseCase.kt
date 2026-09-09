package com.example.skillforgeai.domain.usecase.auth

import com.example.skillforgeai.domain.repository.IAuthRepository

class RegisterUseCase(
    private val repository: IAuthRepository
) {
    suspend operator fun invoke(
        email: String,
        password: String
    ) = repository.register(email, password)
}
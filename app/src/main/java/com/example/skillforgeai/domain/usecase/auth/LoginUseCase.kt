package com.example.skillforgeai.domain.usecase.auth

import com.example.skillforgeai.domain.repository.IAuthRepository

class LoginUseCase(
    private val repository: IAuthRepository
) {
    suspend operator fun invoke(
        email: String,
        password: String
    ) = repository.login(email, password)
}
package com.example.skillforgeai.domain.usecase.auth

import com.example.skillforgeai.domain.repository.IAuthRepository

class LogoutUseCase(
    private val repository: IAuthRepository
) {
    operator fun invoke() {
        repository.logout()
    }
}
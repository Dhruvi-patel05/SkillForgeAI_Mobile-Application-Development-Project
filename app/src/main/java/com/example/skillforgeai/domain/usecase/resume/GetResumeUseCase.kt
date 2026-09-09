package com.example.skillforgeai.domain.usecase.resume

import com.example.skillforgeai.domain.repository.IResumeRepository

class GetResumeUseCase(
    private val repository: IResumeRepository
) {
    suspend operator fun invoke(
        resumeId: String
    ) = repository.getResume(resumeId)
}
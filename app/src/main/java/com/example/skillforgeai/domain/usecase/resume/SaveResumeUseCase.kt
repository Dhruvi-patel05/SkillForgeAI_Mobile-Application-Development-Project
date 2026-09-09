package com.example.skillforgeai.domain.usecase.resume

import com.example.skillforgeai.data.model.Resume
import com.example.skillforgeai.domain.repository.IResumeRepository

class SaveResumeUseCase(
    private val repository: IResumeRepository
) {
    suspend operator fun invoke(
        resume: Resume
    ) = repository.saveResume(resume)
}
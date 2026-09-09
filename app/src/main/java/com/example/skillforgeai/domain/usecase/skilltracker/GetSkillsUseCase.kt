package com.example.skillforgeai.domain.usecase.skilltracker

import com.example.skillforgeai.domain.repository.ISkillRepository

class GetSkillsUseCase(
    private val repository: ISkillRepository
) {
    suspend operator fun invoke() =
        repository.getSkills()
}
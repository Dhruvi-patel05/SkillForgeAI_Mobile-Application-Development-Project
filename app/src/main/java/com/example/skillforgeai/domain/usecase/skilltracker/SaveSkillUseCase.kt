package com.example.skillforgeai.domain.usecase.skilltracker

import com.example.skillforgeai.data.model.Skill
import com.example.skillforgeai.domain.repository.ISkillRepository

class SaveSkillUseCase(
    private val repository: ISkillRepository
) {
    suspend operator fun invoke(
        skill: Skill
    ) = repository.saveSkill(skill)
}
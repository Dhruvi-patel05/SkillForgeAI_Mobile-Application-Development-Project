package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.model.StudyPlan
import com.example.skillforgeai.data.repository.AutomationRepository
import javax.inject.Inject

class GenerateStudyPlanUseCase @Inject constructor(
    private val repository: AutomationRepository
) {

    suspend operator fun invoke(
        userId: String,
        studyPlan: StudyPlan
    ): Result<Unit> {

        return repository.saveStudyPlan(
            userId,
            studyPlan
        )
    }
}
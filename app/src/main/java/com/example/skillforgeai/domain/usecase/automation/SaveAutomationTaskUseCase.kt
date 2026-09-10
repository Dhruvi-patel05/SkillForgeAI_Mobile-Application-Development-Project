package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.model.AutomationTask
import com.example.skillforgeai.data.repository.AutomationRepository
import javax.inject.Inject

class SaveAutomationTaskUseCase @Inject constructor(
    private val repository: AutomationRepository
) {

    suspend operator fun invoke(
        userId: String,
        task: AutomationTask
    ) = repository.saveAutomationTask(
        userId,
        task
    )
}
package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.repository.AutomationRepository
import javax.inject.Inject

class DeleteAutomationTaskUseCase @Inject constructor(
    private val repository: AutomationRepository
) {

    suspend operator fun invoke(
        userId: String,
        taskId: String
    ) = repository.deleteAutomationTask(
        userId,
        taskId
    )
}
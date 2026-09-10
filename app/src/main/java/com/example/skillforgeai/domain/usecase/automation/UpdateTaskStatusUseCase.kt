package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.repository.AutomationRepository
import javax.inject.Inject

class UpdateTaskStatusUseCase @Inject constructor(
    private val repository: AutomationRepository
) {

    suspend operator fun invoke(
        userId: String,
        taskId: String,
        enabled: Boolean
    ) = repository.updateTaskStatus(
        userId,
        taskId,
        enabled
    )
}
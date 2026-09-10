package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.model.WeeklyReport
import com.example.skillforgeai.data.repository.AutomationRepository
import javax.inject.Inject

class GenerateWeeklyReportUseCase @Inject constructor(
    private val repository: AutomationRepository
) {

    suspend operator fun invoke(
        userId: String,
        report: WeeklyReport
    ): Result<Unit> {

        return repository.saveWeeklyReport(
            userId,
            report
        )
    }
}
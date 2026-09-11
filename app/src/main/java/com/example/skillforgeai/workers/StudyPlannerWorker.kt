package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class StudyPlannerWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        generateStudyPlan()

        return Result.success()
    }

    private fun generateStudyPlan() {

        val plan = """
            1. DSA - 1 Hour
            2. Android - 1 Hour
            3. AI/ML - 1 Hour
            4. Placement Prep - 1 Hour
        """.trimIndent()

        println(plan)
    }
}
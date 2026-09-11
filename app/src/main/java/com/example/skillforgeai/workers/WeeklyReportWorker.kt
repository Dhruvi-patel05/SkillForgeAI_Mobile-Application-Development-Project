package com.example.skillforgeai.workers


import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class WeeklyReportWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        createWeeklyReport()

        return Result.success()
    }

    private fun createWeeklyReport() {

        println("Weekly Progress Report Generated")
    }
}
package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ResumeWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        analyzeResume()

        return Result.success()
    }

    private fun analyzeResume() {

        println("Resume Analysis Started")
    }
}
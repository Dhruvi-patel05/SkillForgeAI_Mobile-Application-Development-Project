package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class AIMentorWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        generateTip()

        return Result.success()
    }

    private fun generateTip() {

        println("AI Mentor Tip Generated")
    }
}
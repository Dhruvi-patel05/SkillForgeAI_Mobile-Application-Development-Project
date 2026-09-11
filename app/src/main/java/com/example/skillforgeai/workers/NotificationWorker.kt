package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.skillforgeai.utils.NotificationHelper

class NotificationWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {

    override fun doWork(): Result {

        NotificationHelper.showNotification(
            applicationContext,
            "SkillForgeAI",
            "You have new updates waiting for you."
        )

        return Result.success()
    }
}
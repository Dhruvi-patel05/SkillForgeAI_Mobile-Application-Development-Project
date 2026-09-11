package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.skillforgeai.notification.NotificationHelper

class NotificationWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        NotificationHelper(applicationContext)
            .showNotification(
                "SkillForgeAI",
                "You have new notifications."
            )

        return Result.success()
    }
}
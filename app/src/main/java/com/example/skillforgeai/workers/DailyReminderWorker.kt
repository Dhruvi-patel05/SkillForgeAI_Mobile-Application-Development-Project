package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.skillforgeai.notification.NotificationHelper

class DailyReminderWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        NotificationHelper(applicationContext)
            .showNotification(
                "Daily Learning Reminder",
                "Complete today's learning goal."
            )

        return Result.success()
    }
}
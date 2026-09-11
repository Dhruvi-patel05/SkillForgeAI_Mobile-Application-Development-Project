package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.skillforgeai.utils.NotificationHelper

class DailyReminderWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {

    override fun doWork(): Result {

        NotificationHelper.showNotification(
            applicationContext,
            "Daily Learning Reminder",
            "Continue your SkillForgeAI learning journey today!"
        )

        return Result.success()
    }
}
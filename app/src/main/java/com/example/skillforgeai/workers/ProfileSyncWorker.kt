package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ProfileSyncWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        syncProfile()

        return Result.success()
    }

    private fun syncProfile() {

        println("Profile Synced Successfully")
    }
}
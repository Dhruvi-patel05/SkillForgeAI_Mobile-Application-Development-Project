package com.example.skillforgeai.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class PlacementWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    override fun doWork(): Result {

        sendPlacementQuestion()

        return Result.success()
    }

    private fun sendPlacementQuestion() {

        println("Today's Aptitude Question Delivered")
    }
}
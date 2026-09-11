package com.example.skillforgeai.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.skillforgeai.data.remote.AI.AIEngine

class GeminiBackgroundService : Service() {

    private lateinit var aiEngine: AIEngine

    override fun onCreate() {
        super.onCreate()

        aiEngine = AIEngine()
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {

        generateRoadmap()

        return START_STICKY
    }

    private fun generateRoadmap() {

        // Gemini AI Processing

    }

    override fun onBind(
        intent: Intent?
    ): IBinder? {
        return null
    }
}
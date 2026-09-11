package com.example.skillforgeai.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.skillforgeai.data.remote.AI.AIEngine
import com.example.skillforgeai.data.remote.AI.GeminiApiService

class GeminiBackgroundService : Service() {

    private lateinit var aiEngine: AIEngine

    override fun onCreate() {
        super.onCreate()

        val geminiApiService = GeminiApiService()

        aiEngine = AIEngine(
            geminiApiService
        )
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

        // TODO Gemini AI Logic

    }

    override fun onBind(
        intent: Intent?
    ): IBinder? {
        return null
    }
}
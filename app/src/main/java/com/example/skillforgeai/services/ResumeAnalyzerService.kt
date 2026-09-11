package com.example.skillforgeai.services

import android.app.IntentService
import android.content.Intent
import android.util.Log

@Suppress("DEPRECATION")
class ResumeAnalyzerService :
    IntentService("ResumeAnalyzerService") {

    override fun onHandleIntent(
        intent: Intent?
    ) {

        val resumeText =
            intent?.getStringExtra(
                "resume_text"
            ) ?: ""

        analyzeResume(resumeText)
    }

    private fun analyzeResume(
        resumeText: String
    ) {

        Log.d(
            "ResumeAnalyzer",
            "Analyzing Resume..."
        )

        val score = calculateScore(
            resumeText
        )

        Log.d(
            "ResumeAnalyzer",
            "Score = $score"
        )
    }

    private fun calculateScore(
        text: String
    ): Int {

        var score = 50

        if (text.contains("Kotlin"))
            score += 10

        if (text.contains("Firebase"))
            score += 10

        if (text.contains("GitHub"))
            score += 10

        if (text.contains("Project"))
            score += 10

        return score
    }
}
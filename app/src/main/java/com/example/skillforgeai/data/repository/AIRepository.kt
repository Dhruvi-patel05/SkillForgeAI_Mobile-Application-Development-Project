package com.example.skillforgeai.data.repository

import com.example.skillforgeai.data.remote.AI.GeminiApiService

class AIRepository(
    private val geminiApiService: GeminiApiService
) {

    suspend fun generateCareerGuidance(
        prompt: String
    ): Result<String> {

        return try {

            val response =
                geminiApiService.generateContent(prompt)

            Result.success(response)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun analyzeResume(
        resumeText: String
    ): Result<String> {

        return try {

            val prompt =
                "Analyze this resume and provide ATS score:\n$resumeText"

            val response =
                geminiApiService.generateContent(prompt)

            Result.success(response)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun generateRoadmap(
        goal: String
    ): Result<String> {

        return try {

            val prompt =
                "Generate a 180-day roadmap for $goal"

            val response =
                geminiApiService.generateContent(prompt)

            Result.success(response)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
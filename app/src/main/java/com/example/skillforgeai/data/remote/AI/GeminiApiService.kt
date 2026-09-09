package com.example.skillforgeai.data.remote.AI

import com.google.ai.client.generativeai.GenerativeModel
import com.example.skillforgeai.BuildConfig

class GeminiApiService {

    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = BuildConfig.GEMINI_API_KEY
    )

    suspend fun generateContent(
        prompt: String
    ): String {

        return try {

            val response =
                generativeModel.generateContent(prompt)

            response.text ?: "No response generated"

        } catch (e: Exception) {

            "Error: ${e.message}"
        }
    }
}
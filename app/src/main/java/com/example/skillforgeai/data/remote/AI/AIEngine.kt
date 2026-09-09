package com.example.skillforgeai.data.remote.AI

class AIEngine(
    private val geminiApiService: GeminiApiService
) {

    suspend fun getCareerGuidance(
        skills: String,
        goal: String
    ): String {

        val prompt =
            PromptTemplates.careerGuidancePrompt(
                skills,
                goal
            )

        return geminiApiService.generateContent(prompt)
    }

    suspend fun analyzeResume(
        resumeText: String
    ): String {

        val prompt =
            PromptTemplates.resumeAnalysisPrompt(
                resumeText
            )

        return geminiApiService.generateContent(prompt)
    }

    suspend fun detectSkillGap(
        currentSkills: String,
        targetCompany: String
    ): String {

        val prompt =
            PromptTemplates.skillGapPrompt(
                currentSkills,
                targetCompany
            )

        return geminiApiService.generateContent(prompt)
    }

    suspend fun generateRoadmap(
        goal: String,
        days: Int
    ): String {

        val prompt =
            PromptTemplates.roadmapPrompt(
                goal,
                days
            )

        return geminiApiService.generateContent(prompt)
    }

    suspend fun generateInterviewQuestions(
        role: String,
        company: String
    ): String {

        val prompt =
            PromptTemplates.interviewPrompt(
                role,
                company
            )

        return geminiApiService.generateContent(prompt)
    }

    suspend fun calculatePlacementReadiness(
        resumeScore: Int,
        codingScore: Int,
        aptitudeScore: Int
    ): String {

        val prompt =
            PromptTemplates.placementReadinessPrompt(
                resumeScore,
                codingScore,
                aptitudeScore
            )

        return geminiApiService.generateContent(prompt)
    }
}
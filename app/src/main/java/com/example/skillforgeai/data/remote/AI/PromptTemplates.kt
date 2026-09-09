package com.example.skillforgeai.data.remote.AI

object PromptTemplates {

    fun careerGuidancePrompt(
        skills: String,
        goal: String
    ): String {

        return """
        You are an expert AI Career Mentor.

        Student Skills:
        $skills

        Career Goal:
        $goal

        Provide:
        1. Career Path
        2. Required Skills
        3. Learning Resources
        4. Placement Preparation Tips
        5. Salary Expectations
        """.trimIndent()
    }

    fun resumeAnalysisPrompt(
        resumeText: String
    ): String {

        return """
        Analyze the following resume.

        Resume:
        $resumeText

        Provide:
        1. ATS Score (0-100)
        2. Missing Keywords
        3. Grammar Suggestions
        4. Resume Improvements
        5. Overall Feedback
        """.trimIndent()
    }

    fun skillGapPrompt(
        currentSkills: String,
        targetCompany: String
    ): String {

        return """
        Compare student skills with requirements.

        Current Skills:
        $currentSkills

        Target Company:
        $targetCompany

        Provide:
        1. Missing Skills
        2. Skill Gap %
        3. Learning Plan
        4. Estimated Learning Time
        """.trimIndent()
    }

    fun roadmapPrompt(
        goal: String,
        days: Int
    ): String {

        return """
        Create a detailed learning roadmap.

        Goal:
        $goal

        Duration:
        $days Days

        Generate:
        Daily Tasks
        Weekly Milestones
        Final Outcome
        """.trimIndent()
    }

    fun interviewPrompt(
        role: String,
        company: String
    ): String {

        return """
        Generate interview questions.

        Role:
        $role

        Company:
        $company

        Generate:
        Technical Questions
        HR Questions
        Coding Questions
        Expected Answers
        """.trimIndent()
    }

    fun placementReadinessPrompt(
        resumeScore: Int,
        codingScore: Int,
        aptitudeScore: Int
    ): String {

        return """
        Calculate placement readiness.

        Resume Score:
        $resumeScore

        Coding Score:
        $codingScore

        Aptitude Score:
        $aptitudeScore

        Provide:
        1. Placement Readiness %
        2. Weak Areas
        3. Improvement Plan
        """.trimIndent()
    }
}
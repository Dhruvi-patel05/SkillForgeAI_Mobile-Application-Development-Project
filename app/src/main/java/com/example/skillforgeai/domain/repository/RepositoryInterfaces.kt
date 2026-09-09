package com.example.skillforgeai.domain.repository

import com.example.skillforgeai.data.model.ChatMessage
import com.example.skillforgeai.data.model.Course
import com.example.skillforgeai.data.model.Notification
import com.example.skillforgeai.data.model.PlacementScore
import com.example.skillforgeai.data.model.Resume
import com.example.skillforgeai.data.model.Roadmap
import com.example.skillforgeai.data.model.Skill
import com.example.skillforgeai.data.model.User


interface IAuthRepository {

    suspend fun login(
        email: String,
        password: String
    ): Result<String>

    suspend fun register(
        email: String,
        password: String
    ): Result<String>

    suspend fun googleLogin(
        idToken: String
    ): Result<String>

    fun logout()

    fun getCurrentUserId(): String?
}

interface IUserRepository {

    suspend fun saveUser(
        user: User
    ): Result<Unit>

    suspend fun getUser(
        userId: String
    ): Result<User?>

    suspend fun updateUser(
        user: User
    ): Result<Unit>

    suspend fun deleteUser(
        userId: String
    ): Result<Unit>
}


interface ICourseRepository {

    suspend fun addCourse(
        course: Course
    ): Result<Unit>

    suspend fun getCourses():
            Result<List<Course>>

    suspend fun getCourseById(
        courseId: String
    ): Result<Course?>

    suspend fun deleteCourse(
        courseId: String
    ): Result<Unit>
}

interface ISkillRepository {

    suspend fun saveSkill(
        skill: Skill
    ): Result<Unit>

    suspend fun getSkills():
            Result<List<Skill>>

    suspend fun updateSkill(
        skill: Skill
    ): Result<Unit>

    suspend fun deleteSkill(
        skillId: String
    ): Result<Unit>
}

interface IResumeRepository {

    suspend fun saveResume(
        resume: Resume
    ): Result<Unit>

    suspend fun getResume(
        resumeId: String
    ): Result<Resume?>

    suspend fun updateResume(
        resume: Resume
    ): Result<Unit>

    suspend fun deleteResume(
        resumeId: String
    ): Result<Unit>
}

interface IPlacementRepository {

    suspend fun savePlacementScore(
        userId: String,
        score: PlacementScore
    ): Result<Unit>

    suspend fun getPlacementScore(
        userId: String
    ): Result<PlacementScore?>

    suspend fun updatePlacementScore(
        userId: String,
        score: PlacementScore
    ): Result<Unit>
}

interface INotificationRepository {

    suspend fun saveNotification(
        notification: Notification
    ): Result<Unit>

    suspend fun getNotifications():
            Result<List<Notification>>

    suspend fun deleteNotification(
        notificationId: String
    ): Result<Unit>
}

interface IAIRepository {

    suspend fun generateCareerGuidance(
        prompt: String
    ): Result<String>

    suspend fun analyzeResume(
        resumeText: String
    ): Result<String>

    suspend fun generateRoadmap(
        goal: String
    ): Result<String>

    suspend fun detectSkillGap(
        currentSkills: String,
        targetCompany: String
    ): Result<String>

    suspend fun generateInterviewQuestions(
        role: String,
        company: String
    ): Result<String>

    suspend fun calculatePlacementReadiness(
        resumeScore: Int,
        codingScore: Int,
        aptitudeScore: Int
    ): Result<String>
}

interface IRoadmapRepository {

    suspend fun saveRoadmap(
        roadmap: Roadmap
    ): Result<Unit>

    suspend fun getRoadmap(
        roadmapId: String
    ): Result<Roadmap?>

    suspend fun getRoadmaps():
            Result<List<Roadmap>>
}

interface IChatRepository {

    suspend fun sendMessage(
        message: ChatMessage
    ): Result<Unit>

    suspend fun getMessages():
            Result<List<ChatMessage>>
}
package com.example.skillforgeai.data.remote.firebase

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseAnalyticsManager @Inject constructor(
    private val firebaseAnalytics: FirebaseAnalytics
) {

    fun logScreenView(screenName: String) {

        val bundle = Bundle().apply {
            putString(
                FirebaseAnalytics.Param.SCREEN_NAME,
                screenName
            )
        }

        firebaseAnalytics.logEvent(
            FirebaseAnalytics.Event.SCREEN_VIEW,
            bundle
        )
    }

    fun logLogin(method: String) {

        val bundle = Bundle().apply {
            putString(
                FirebaseAnalytics.Param.METHOD,
                method
            )
        }

        firebaseAnalytics.logEvent(
            FirebaseAnalytics.Event.LOGIN,
            bundle
        )
    }

    fun logSignUp(method: String) {

        val bundle = Bundle().apply {
            putString(
                FirebaseAnalytics.Param.METHOD,
                method
            )
        }

        firebaseAnalytics.logEvent(
            FirebaseAnalytics.Event.SIGN_UP,
            bundle
        )
    }

    fun logCourseOpened(courseName: String) {

        val bundle = Bundle().apply {
            putString("course_name", courseName)
        }

        firebaseAnalytics.logEvent(
            "course_opened",
            bundle
        )
    }

    fun logSkillCompleted(skillName: String) {

        val bundle = Bundle().apply {
            putString("skill_name", skillName)
        }

        firebaseAnalytics.logEvent(
            "skill_completed",
            bundle
        )
    }

    fun logResumeGenerated() {

        firebaseAnalytics.logEvent(
            "resume_generated",
            null
        )
    }

    fun logInterviewStarted() {

        firebaseAnalytics.logEvent(
            "mock_interview_started",
            null
        )
    }

    fun logAIChatUsed() {

        firebaseAnalytics.logEvent(
            "ai_chat_used",
            null
        )
    }

    fun logPlacementScore(score: Int) {

        val bundle = Bundle().apply {
            putInt("placement_score", score)
        }

        firebaseAnalytics.logEvent(
            "placement_score_updated",
            bundle
        )
    }

    fun logCustomEvent(
        eventName: String,
        params: Bundle? = null
    ) {

        firebaseAnalytics.logEvent(
            eventName,
            params
        )
    }
}
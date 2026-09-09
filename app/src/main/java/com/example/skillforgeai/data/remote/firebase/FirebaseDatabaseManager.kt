package com.example.skillforgeai.data.remote.firebase

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FirebaseDatabaseManager {

    private val database: FirebaseDatabase =
        FirebaseDatabase.getInstance()

    fun getUsersReference(): DatabaseReference {
        return database.getReference("Users")
    }

    fun getCoursesReference(): DatabaseReference {
        return database.getReference("Courses")
    }

    fun getSkillsReference(): DatabaseReference {
        return database.getReference("Skills")
    }

    fun getRoadmapsReference(): DatabaseReference {
        return database.getReference("Roadmaps")
    }

    fun getResumeReference(): DatabaseReference {
        return database.getReference("Resume")
    }

    fun getNotificationsReference(): DatabaseReference {
        return database.getReference("Notifications")
    }

    fun getPlacementReference(): DatabaseReference {
        return database.getReference("PlacementScores")
    }
}
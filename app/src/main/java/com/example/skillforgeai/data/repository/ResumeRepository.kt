package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.Resume
import kotlinx.coroutines.tasks.await

class ResumeRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("Resume")

    suspend fun saveResume(
        resume: Resume
    ): Result<Unit> {

        return try {

            database.child(resume.resumeId)
                .setValue(resume)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getResume(
        resumeId: String
    ): Result<Resume?> {

        return try {

            val snapshot =
                database.child(resumeId)
                    .get()
                    .await()

            Result.success(
                snapshot.getValue(Resume::class.java)
            )

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
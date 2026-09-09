package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.PlacementScore
import kotlinx.coroutines.tasks.await

class PlacementRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("PlacementScores")

    suspend fun saveScore(
        userId: String,
        score: PlacementScore
    ): Result<Unit> {

        return try {

            database.child(userId)
                .setValue(score)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getScore(
        userId: String
    ): Result<PlacementScore?> {

        return try {

            val snapshot =
                database.child(userId)
                    .get()
                    .await()

            Result.success(
                snapshot.getValue(
                    PlacementScore::class.java
                )
            )

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
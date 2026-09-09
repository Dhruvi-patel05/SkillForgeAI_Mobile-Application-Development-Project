package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.User
import kotlinx.coroutines.tasks.await

class UserRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("Users")

    suspend fun saveUser(user: User): Result<Unit> {
        return try {
            database.child(user.userId)
                .setValue(user)
                .await()

            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getUser(
        userId: String
    ): Result<User?> {
        return try {

            val snapshot =
                database.child(userId)
                    .get()
                    .await()

            val user =
                snapshot.getValue(User::class.java)

            Result.success(user)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
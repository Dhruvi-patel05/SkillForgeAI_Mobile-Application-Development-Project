package com.example.skillforgeai.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.tasks.await

class AuthRepository {

    private val auth = FirebaseAuth.getInstance()

    suspend fun login(
        email: String,
        password: String
    ): Result<String> {
        return try {
            val result = auth.signInWithEmailAndPassword(
                email,
                password
            ).await()

            Result.success(result.user?.uid ?: "")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun register(
        email: String,
        password: String
    ): Result<String> {
        return try {
            val result = auth.createUserWithEmailAndPassword(
                email,
                password
            ).await()

            Result.success(result.user?.uid ?: "")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun firebaseAuthWithGoogle(
        idToken: String
    ): Result<String> {
        return try {
            val credential =
                GoogleAuthProvider.getCredential(idToken, null)

            val result =
                auth.signInWithCredential(credential).await()

            Result.success(result.user?.uid ?: "")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun logout() {
        auth.signOut()
    }

    fun getCurrentUserId(): String? {
        return auth.currentUser?.uid
    }
}
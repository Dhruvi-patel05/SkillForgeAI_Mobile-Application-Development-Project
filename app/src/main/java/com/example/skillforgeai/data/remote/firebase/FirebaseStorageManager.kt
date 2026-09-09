package com.example.skillforgeai.data.remote.firebase

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.tasks.await


class FirebaseStorageManager {

    private val storage = FirebaseStorage.getInstance()

    suspend fun uploadProfileImage(
        userId: String,
        imageUri: Uri
    ): Result<String> {

        return try {

            val ref = storage.reference
                .child("profile_images/$userId.jpg")

            ref.putFile(imageUri).await()

            val downloadUrl =
                ref.downloadUrl.await().toString()

            Result.success(downloadUrl)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun uploadResumePdf(
        userId: String,
        fileUri: Uri
    ): Result<String> {

        return try {

            val ref = storage.reference
                .child("resumes/$userId.pdf")

            ref.putFile(fileUri).await()

            val downloadUrl =
                ref.downloadUrl.await().toString()

            Result.success(downloadUrl)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun deleteProfileImage(
        userId: String
    ): Result<Unit> {

        return try {

            storage.reference
                .child("profile_images/$userId.jpg")
                .delete()
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
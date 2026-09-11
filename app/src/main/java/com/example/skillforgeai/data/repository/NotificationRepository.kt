package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.Notification
import kotlinx.coroutines.tasks.await

class NotificationRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("Notifications")

    suspend fun saveNotification(
        notification: Notification
    ): Result<Unit> {

        return try {

            database.child(notification.id)
                .setValue(notification)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getNotifications():
            Result<List<Notification>> {

        return try {

            val snapshot =
                database.get().await()

            val notifications =
                snapshot.children.mapNotNull {
                    it.getValue(Notification::class.java)
                }

            Result.success(notifications)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
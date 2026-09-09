package com.example.skillforgeai.data.remote.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.tasks.await

class FCMManager {

    suspend fun getFCMToken(): String {

        return try {

            FirebaseMessaging.getInstance()
                .token
                .await()

        } catch (e: Exception) {

            Log.e(
                "FCMManager",
                "Token Error: ${e.message}"
            )

            ""
        }
    }

    fun subscribeToTopic(
        topic: String
    ) {

        FirebaseMessaging.getInstance()
            .subscribeToTopic(topic)
            .addOnCompleteListener {

                Log.d(
                    "FCMManager",
                    "Subscribed: $topic"
                )
            }
    }

    fun unsubscribeFromTopic(
        topic: String
    ) {

        FirebaseMessaging.getInstance()
            .unsubscribeFromTopic(topic)
            .addOnCompleteListener {

                Log.d(
                    "FCMManager",
                    "Unsubscribed: $topic"
                )
            }
    }
}
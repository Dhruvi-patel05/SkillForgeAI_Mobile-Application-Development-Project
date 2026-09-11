package com.example.skillforgeai.services

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.example.skillforgeai.R

class FCMService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        // Upload token to Firebase Database
    }

    override fun onMessageReceived(
        remoteMessage: RemoteMessage
    ) {
        super.onMessageReceived(remoteMessage)

        val title =
            remoteMessage.notification?.title
                ?: "SkillForgeAI"

        val body =
            remoteMessage.notification?.body
                ?: "New Notification"

        showNotification(title, body)
    }

    private fun showNotification(
        title: String,
        message: String
    ) {

        val channelId = "skillforge_channel"

        val manager =
            getSystemService(
                NotificationManager::class.java
            )

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel =
                NotificationChannel(
                    channelId,
                    "SkillForge Notifications",
                    NotificationManager.IMPORTANCE_HIGH
                )

            manager.createNotificationChannel(
                channel
            )
        }

        val notification =
            NotificationCompat.Builder(
                this,
                channelId
            )
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .build()

        manager.notify(
            System.currentTimeMillis().toInt(),
            notification
        )
    }
}
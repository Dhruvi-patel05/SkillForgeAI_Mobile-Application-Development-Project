package com.example.skillforgeai.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.data.model.Notification

class NotificationsViewModel : ViewModel() {

    private val _notifications =
        MutableLiveData<List<Notification>>()

    val notifications: LiveData<List<Notification>>
        get() = _notifications

    init {
        loadNotifications()
    }

    private fun loadNotifications() {

        _notifications.value = listOf(

            Notification(
                id = "1",
                title = "Daily Learning Reminder",
                message = "Complete today's AI module.",
                time = "08:00 AM"
            ),

            Notification(
                id = "2",
                title = "Placement Alert",
                message = "Solve 5 aptitude questions today.",
                time = "10:00 AM"
            ),

            Notification(
                id = "3",
                title = "AI Mentor Tip",
                message = "Practice Kotlin Collections.",
                time = "02:00 PM"
            ),

            Notification(
                id = "4",
                title = "Weekly Report",
                message = "Your weekly progress report is ready.",
                time = "06:00 PM"
            )

        )
    }
}
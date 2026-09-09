package com.example.skillforgeai.data.local

import android.content.Context
import com.example.skillforgeai.data.model.User

class SessionManager(
    context: Context
) {

    private val prefManager =
        SharedPrefManager(context)

    fun createUserSession(
        user: User
    ) {

        prefManager.saveUserId(user.userId)
        prefManager.saveUserName(user.name)
        prefManager.saveEmail(user.email)
        prefManager.saveProfileImage(user.profileImage)
        prefManager.setLoggedIn(true)
    }

    fun logout() {
        prefManager.clearSession()
    }

    fun isUserLoggedIn(): Boolean {
        return prefManager.isLoggedIn()
    }

    fun getUserId(): String {
        return prefManager.getUserId()
    }

    fun getUserName(): String {
        return prefManager.getUserName()
    }

    fun getUserEmail(): String {
        return prefManager.getEmail()
    }

    fun getProfileImage(): String {
        return prefManager.getProfileImage()
    }
}
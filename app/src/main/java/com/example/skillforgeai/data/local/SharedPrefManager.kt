package com.example.skillforgeai.data.local

import android.content.Context

class SharedPrefManager(context: Context) {

    private val prefs =
        context.getSharedPreferences(
            "SkillForgeAI_Prefs",
            Context.MODE_PRIVATE
        )

    companion object {

        private const val KEY_USER_ID = "user_id"
        private const val KEY_USER_NAME = "user_name"
        private const val KEY_EMAIL = "email"
        private const val KEY_PROFILE_IMAGE = "profile_image"
        private const val KEY_IS_LOGGED_IN = "is_logged_in"
    }

    fun saveUserId(userId: String) {
        prefs.edit().putString(KEY_USER_ID, userId).apply()
    }

    fun getUserId(): String {
        return prefs.getString(KEY_USER_ID, "") ?: ""
    }

    fun saveUserName(name: String) {
        prefs.edit().putString(KEY_USER_NAME, name).apply()
    }

    fun getUserName(): String {
        return prefs.getString(KEY_USER_NAME, "") ?: ""
    }

    fun saveEmail(email: String) {
        prefs.edit().putString(KEY_EMAIL, email).apply()
    }

    fun getEmail(): String {
        return prefs.getString(KEY_EMAIL, "") ?: ""
    }

    fun saveProfileImage(url: String) {
        prefs.edit().putString(KEY_PROFILE_IMAGE, url).apply()
    }

    fun getProfileImage(): String {
        return prefs.getString(KEY_PROFILE_IMAGE, "") ?: ""
    }

    fun setLoggedIn(status: Boolean) {
        prefs.edit().putBoolean(KEY_IS_LOGGED_IN, status).apply()
    }

    fun isLoggedIn(): Boolean {
        return prefs.getBoolean(KEY_IS_LOGGED_IN, false)
    }

    fun clearSession() {
        prefs.edit().clear().apply()
    }
}
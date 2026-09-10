package com.example.skillforgeai.data.remote.firebase

import com.google.firebase.crashlytics.FirebaseCrashlytics
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class FirebaseCrashlyticsManager @Inject constructor() {

    private val crashlytics =
        FirebaseCrashlytics.getInstance()

    fun log(message: String) {

        crashlytics.log(message)
    }

    fun setUserId(userId: String) {

        crashlytics.setUserId(userId)
    }

    fun setCustomKey(
        key: String,
        value: String
    ) {

        crashlytics.setCustomKey(
            key,
            value
        )
    }

    fun recordException(
        exception: Throwable
    ) {

        crashlytics.recordException(
            exception
        )
    }

    fun recordError(
        tag: String,
        message: String
    ) {

        crashlytics.log("$tag : $message")

        crashlytics.recordException(
            Exception(message)
        )
    }

    fun enableCrashlytics(
        enabled: Boolean
    ) {

        crashlytics.setCrashlyticsCollectionEnabled(
            enabled
        )
    }
}
package com.example.skillforgeai.utils

import android.Manifest

object PermissionUtils {

    val STORAGE_PERMISSIONS =
        arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )

    val CAMERA_PERMISSION =
        Manifest.permission.CAMERA

    val NOTIFICATION_PERMISSION =
        Manifest.permission.POST_NOTIFICATIONS
}
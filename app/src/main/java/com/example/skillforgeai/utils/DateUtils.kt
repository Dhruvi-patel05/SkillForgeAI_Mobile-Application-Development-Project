package com.example.skillforgeai.utils

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    fun getCurrentDate(): String {

        val sdf =
            SimpleDateFormat(
                "dd/MM/yyyy",
                Locale.getDefault()
            )

        return sdf.format(Date())
    }

    fun getCurrentTime(): String {

        val sdf =
            SimpleDateFormat(
                "hh:mm a",
                Locale.getDefault()
            )

        return sdf.format(Date())
    }
}
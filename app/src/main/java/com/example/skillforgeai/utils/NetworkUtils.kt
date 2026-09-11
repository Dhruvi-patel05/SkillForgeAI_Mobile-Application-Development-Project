package com.example.skillforgeai.utils

import android.content.Context
import android.net.ConnectivityManager

object NetworkUtils {

    fun isInternetAvailable(
        context: Context
    ): Boolean {

        val manager =
            context.getSystemService(
                Context.CONNECTIVITY_SERVICE
            ) as ConnectivityManager

        return manager.activeNetworkInfo != null &&
                manager.activeNetworkInfo!!.isConnected
    }
}
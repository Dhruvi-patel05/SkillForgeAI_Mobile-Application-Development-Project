package com.example.skillforgeai.utils

import android.util.Patterns

object Validators {

    fun isValidEmail(
        email: String
    ): Boolean {

        return Patterns.EMAIL_ADDRESS
            .matcher(email)
            .matches()
    }

    fun isValidPassword(
        password: String
    ): Boolean {

        return password.length >= 8
    }

    fun isValidName(
        name: String
    ): Boolean {

        return name.isNotEmpty()
    }
}
package com.example.skillforgeai.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel : ViewModel() {

    val firebaseAuth = FirebaseAuth.getInstance()

    private val _authState = MutableLiveData<String>()
    val authState: LiveData<String> = _authState

    fun login(
        email: String,
        password: String
    ) {

        if (email.isEmpty() || password.isEmpty()) {

            _authState.value = "Please fill all fields"
            return
        }

        firebaseAuth.signInWithEmailAndPassword(
            email,
            password
        )
            .addOnSuccessListener {

                _authState.value = "Login Success"
            }
            .addOnFailureListener {

                _authState.value =
                    it.message ?: "Login Failed"
            }
    }

    fun register(
        name: String,
        email: String,
        password: String
    ) {

        if (
            name.isEmpty() ||
            email.isEmpty() ||
            password.isEmpty()
        ) {

            _authState.value = "Please fill all fields"
            return
        }

        firebaseAuth.createUserWithEmailAndPassword(
            email,
            password
        )
            .addOnSuccessListener {

                _authState.value =
                    "Registration Success"
            }
            .addOnFailureListener {

                _authState.value =
                    it.message ?: "Registration Failed"
            }
    }

    fun resetPassword(
        email: String
    ) {

        firebaseAuth.sendPasswordResetEmail(
            email
        )
            .addOnSuccessListener {

                _authState.value =
                    "Reset Email Sent"
            }
            .addOnFailureListener {

                _authState.value =
                    it.message ?: "Failed"
            }
    }
}
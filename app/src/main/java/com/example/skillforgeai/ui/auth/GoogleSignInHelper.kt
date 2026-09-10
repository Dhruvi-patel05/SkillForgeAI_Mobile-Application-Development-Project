package com.example.skillforgeai.ui.auth

import android.app.Activity
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.example.skillforgeai.R

class GoogleSignInHelper(private val activity: Activity) {

    private val firebaseAuth = FirebaseAuth.getInstance()

    fun signIn(launcher: ActivityResultLauncher<Intent>) {

        val options = GoogleSignInOptions.Builder(
                GoogleSignInOptions.DEFAULT_SIGN_IN
        )
                .requestIdToken(
                    activity.getString(
                        R.string.default_web_client_id
                    )
                )
                .requestEmail()
                .build()

        val client =
            GoogleSignIn.getClient(
                activity,
                options
            )

        launcher.launch(
            client.signInIntent
        )
    }

    fun firebaseAuthWithGoogle(
        idToken: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {

        val credential =
            GoogleAuthProvider.getCredential(
                idToken,
                null
            )

        firebaseAuth
            .signInWithCredential(
                credential
            )
            .addOnSuccessListener {

                onSuccess()
            }
            .addOnFailureListener {

                onFailure(
                    it.message ?: "Failed"
                )
            }
    }
}
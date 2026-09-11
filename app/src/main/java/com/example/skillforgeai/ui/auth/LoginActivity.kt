package com.example.skillforgeai.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.R
import com.example.skillforgeai.databinding.ActivityLoginBinding
import com.example.skillforgeai.ui.dashboard.DashboardActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val viewModel: AuthViewModel by viewModels()

    private val googleLauncher =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->

            try {

                val task =
                    GoogleSignIn.getSignedInAccountFromIntent(
                        result.data
                    )

                val account: GoogleSignInAccount =
                    task.getResult(
                        ApiException::class.java
                    )

                firebaseAuthWithGoogle(
                    account.idToken!!
                )

            } catch (e: Exception) {

                Toast.makeText(
                    this,
                    e.message,
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityLoginBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        observeAuth()

        binding.btnLogin.setOnClickListener {

            val email =
                binding.etEmail.text.toString().trim()

            val password =
                binding.etPassword.text.toString().trim()

            viewModel.login(
                email,
                password
            )
        }

        binding.btnGoogleSignIn.setOnClickListener {

            googleSignIn()
        }

        binding.txtRegister.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    RegisterActivity::class.java
                )
            )
        }

        binding.txtForgotPassword.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ForgotPasswordActivity::class.java
                )
            )
        }
    }

    private fun googleSignIn() {

        val gso =
            GoogleSignInOptions.Builder(
                GoogleSignInOptions.DEFAULT_SIGN_IN
            )
                .requestIdToken(
                    getString(
                        R.string.default_web_client_id
                    )
                )
                .requestEmail()
                .build()

        val googleSignInClient =
            GoogleSignIn.getClient(
                this,
                gso
            )

        googleLauncher.launch(
            googleSignInClient.signInIntent
        )
    }

    private fun firebaseAuthWithGoogle(
        idToken: String
    ) {

        val credential =
            GoogleAuthProvider.getCredential(
                idToken,
                null
            )

        viewModel.firebaseAuth
            .signInWithCredential(
                credential
            )
            .addOnCompleteListener {

                if (it.isSuccessful) {

                    Toast.makeText(
                        this,
                        "Google Login Success",
                        Toast.LENGTH_SHORT
                    ).show()

                    startActivity(
                        Intent(
                            this,
                            DashboardActivity::class.java
                        )
                    )

                    finish()

                } else {

                    Toast.makeText(
                        this,
                        it.exception?.message,
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }

    private fun observeAuth() {

        viewModel.authState.observe(this) {

            Toast.makeText(
                this,
                it,
                Toast.LENGTH_SHORT
            ).show()

            if (it == "Login Success") {

                startActivity(
                    Intent(
                        this,
                        DashboardActivity::class.java
                    )
                )

                finish()
            }
        }
    }
    private fun updateUI(user: FirebaseUser?) {
        if (user != null) {

            Toast.makeText(
                this,
                "Login Successful",
                Toast.LENGTH_SHORT
            ).show()

            startActivity(
                Intent(
                    this,
                    DashboardActivity::class.java
                )
            )

            finish()

        } else {

            Toast.makeText(
                this,
                "Login Failed",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
package com.example.skillforgeai.ui.auth

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityForgotPasswordBinding

    private val viewModel:
            AuthViewModel by viewModels()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityForgotPasswordBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        viewModel.authState.observe(this) {

            Toast.makeText(
                this,
                it,
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.btnResetPassword.setOnClickListener {

            viewModel.resetPassword(
                binding.etEmail.text.toString()
            )
        }
    }
}
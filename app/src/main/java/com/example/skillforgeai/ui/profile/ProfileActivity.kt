package com.example.skillforgeai.ui.profile

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeUser()
    }

    private fun observeUser() {

        viewModel.user.observe(this) { user ->

            binding.txtUserName.text = user.name
            binding.txtEmail.text = user.email

            // Optional Stats
            binding.txtCourses.text = "15"
            binding.txtSkills.text = "12"
        }
    }
}
package com.example.skillforgeai.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityProfileBinding.inflate(layoutInflater)

        setContentView(binding.root)

        observeUser()

        binding.btnEditProfile.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    EditProfileActivity::class.java
                )
            )
        }

        binding.btnSettings.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    SettingsActivity::class.java
                )
            )
        }
    }

    private fun observeUser() {

        viewModel.user.observe(this) { user ->

            binding.txtName.text = user.name
            binding.txtEmail.text = user.email
            binding.txtProfession.text = user.profession
        }
    }
}
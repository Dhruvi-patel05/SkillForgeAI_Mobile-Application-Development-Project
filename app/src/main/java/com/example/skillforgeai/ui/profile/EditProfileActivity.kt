package com.example.skillforgeai.ui.profile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding:
            ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityEditProfileBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.btnSaveProfile.setOnClickListener {

            Toast.makeText(
                this,
                "Profile Updated",
                Toast.LENGTH_SHORT
            ).show()

            finish()
        }
    }
}
package com.example.skillforgeai.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {

        binding.txtSettings.text = "Settings"
        binding.rvSettings.setHasFixedSize(true)
    }
}
package com.example.skillforgeai.ui.placement

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityPlacementScoreBinding

class PlacementScoreActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityPlacementScoreBinding

    private val viewModel:
            PlacementViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityPlacementScoreBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        viewModel.placementScore.observe(this) {

            binding.txtScore.text =
                "$it%"
        }

        viewModel.targetCompany.observe(this) {

            binding.txtCompany.text =
                "Target : $it"
        }
    }
}
package com.example.skillforgeai.ui.placement

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityPlacementScoreBinding

class PlacementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlacementScoreBinding

    private val viewModel: PlacementViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlacementScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeData()
    }

    private fun observeData() {

        viewModel.placementScore.observe(this) { score ->
            binding.txtScore.text = "$score%"
        }

        viewModel.targetCompany.observe(this) { company ->
            binding.txtCompany.text = "Target : $company"
        }
    }
}
package com.example.skillforgeai.ui.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.skillforgeai.databinding.ActivityDashboardBinding
import com.example.skillforgeai.ui.ai.AIMentorActivity
import com.example.skillforgeai.ui.courses.CoursesActivity
import com.example.skillforgeai.ui.notifications.NotificationsActivity
import com.example.skillforgeai.ui.placement.PlacementActivity
import com.example.skillforgeai.ui.profile.ProfileActivity
import com.example.skillforgeai.ui.resume.ResumeBuilderActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding:
            ActivityDashboardBinding

    private val viewModel:
            DashboardViewModel by viewModels()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityDashboardBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        setupDashboard()

        setupClickListeners()
    }

    private fun setupDashboard() {

        viewModel.userName.observe(this) {

            binding.txtWelcome.text =
                "Hello, $it 👋"
        }

        viewModel.dashboardItems.observe(this) {

            binding.rvDashboard.layoutManager =
                GridLayoutManager(this, 2)

            binding.rvDashboard.adapter =
                DashboardAdapter(it)
        }
    }

    private fun setupClickListeners() {

        binding.cardCourses.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    CoursesActivity::class.java
                )
            )
        }

        binding.cardAI.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    AIMentorActivity::class.java
                )
            )
        }

        binding.cardResume.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ResumeBuilderActivity::class.java
                )
            )
        }

        binding.cardPlacement.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    PlacementActivity::class.java
                )
            )
        }

        binding.cardSkillTracker.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    SkillTrackerActivity::class.java
                )
            )
        }

        binding.imgNotification.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    NotificationsActivity::class.java
                )
            )
        }

        binding.imgProfile.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    ProfileActivity::class.java
                )
            )
        }
    }
}
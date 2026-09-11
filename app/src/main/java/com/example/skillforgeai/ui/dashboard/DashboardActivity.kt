package com.example.skillforgeai.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skillforgeai.R
import com.example.skillforgeai.databinding.ActivityDashboardBinding
import com.example.skillforgeai.ui.notifications.NotificationsActivity
import com.example.skillforgeai.ui.profile.ProfileActivity
import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    private val viewModel: DashboardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("DASHBOARD", "Dashboard Opened")

        loadUserData()

        setupRecyclerViews()

        setupClickListeners()
    }

    private fun loadUserData() {

        val currentUser = FirebaseAuth.getInstance().currentUser

        if (currentUser != null) {

            binding.txtUserName.text =
                currentUser.displayName ?: "User"

            Log.d(
                "USER_UID",
                currentUser.uid
            )

        } else {

            binding.txtUserName.text = "Guest User"
        }
    }

    private fun setupRecyclerViews() {

        val dashboardList = arrayListOf(

            DashboardItem(
                R.drawable.ic_course,
                "Courses",
                "12"
            ),

            DashboardItem(
                R.drawable.ic_learning,
                "Skills",
                "25"
            ),

            DashboardItem(
                R.drawable.ic_ai,
                "AI Score",
                "85%"
            ),

        )

        binding.rvQuickActions.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )

        binding.rvQuickActions.adapter =
            DashboardAdapter(dashboardList)

        binding.rvContinueLearning.layoutManager =
            LinearLayoutManager(this)

        binding.rvContinueLearning.adapter =
            DashboardAdapter(dashboardList)

        binding.rvRecommendedCourses.layoutManager =
            LinearLayoutManager(this)

        binding.rvRecommendedCourses.adapter =
            DashboardAdapter(dashboardList)
    }

    private fun setupClickListeners() {

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
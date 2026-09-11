package com.example.skillforgeai.ui.notifications

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skillforgeai.ui.notifications.NotificationAdapter
import com.example.skillforgeai.databinding.ActivityNotificationsBinding

class NotificationsActivity : AppCompatActivity() {

    private lateinit var binding:
            ActivityNotificationsBinding

    private val viewModel:
            NotificationsViewModel by viewModels()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityNotificationsBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {

        binding.rvNotifications.layoutManager =
            LinearLayoutManager(this)

        viewModel.notifications.observe(this) {

            binding.rvNotifications.adapter =
                NotificationAdapter(it)
        }
    }
}
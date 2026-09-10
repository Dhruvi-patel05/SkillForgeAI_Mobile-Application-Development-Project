package com.example.skillforgeai.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.R

data class DashboardItem(
    val title: String,
    val value: String,
    val icon: Int)

class DashboardViewModel : ViewModel() {

    private val _dashboardItems =
        MutableLiveData<List<DashboardItem>>()

    val dashboardItems: LiveData<List<DashboardItem>>
        get() = _dashboardItems

    private val _userName =
        MutableLiveData("Dhruvi")

    val userName: LiveData<String>
        get() = _userName

    init {
        loadDashboardData()
    }

    private fun loadDashboardData() {

        _dashboardItems.value = listOf(

            DashboardItem(
                "Learning Progress",
                "65%",
                R.drawable.ic_learning
            ),

            DashboardItem(
                "Placement Score",
                "82%",
                R.drawable.ic_skill
            ),

            DashboardItem(
                "Courses",
                "12",
                R.drawable.ic_course
            ),

            DashboardItem(
                "Certificates",
                "5",
                R.drawable.ic_certificate
            )
        )
    }
}
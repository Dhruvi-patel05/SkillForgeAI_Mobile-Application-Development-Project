package com.example.skillforgeai.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class DashboardViewModel : ViewModel() {

    private val _userName = MutableLiveData<String>()
    val userName: LiveData<String> = _userName

    init {
        loadDashboard()
    }

    private fun loadDashboard() {

        val currentUser =
            FirebaseAuth.getInstance().currentUser

        _userName.value =
            currentUser?.displayName
                ?: currentUser?.email
                        ?: "Dhruvi 👋"
    }
}
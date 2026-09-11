package com.example.skillforgeai.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.data.model.User

class ProfileViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    init {
        loadProfile()
    }

    private fun loadProfile() {

        _user.value = User(
            userId = "1",
            name = "Dhruvi Patel",
            email = "dhruvi@gmail.com",
            profession = "B.Tech IT Student",
            profileImage = ""
        )
    }
}
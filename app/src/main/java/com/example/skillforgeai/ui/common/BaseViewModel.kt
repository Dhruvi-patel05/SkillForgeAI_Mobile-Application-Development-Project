package com.example.skillforgeai.ui.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    private val _isLoading =
        MutableLiveData<Boolean>()

    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private val _errorMessage =
        MutableLiveData<String>()

    val errorMessage: LiveData<String>
        get() = _errorMessage

    fun showLoading() {
        _isLoading.value = true
    }

    fun hideLoading() {
        _isLoading.value = false
    }

    fun setError(message: String) {
        _errorMessage.value = message
    }
}
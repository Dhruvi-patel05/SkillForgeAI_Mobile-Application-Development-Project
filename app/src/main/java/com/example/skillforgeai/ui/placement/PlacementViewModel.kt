package com.example.skillforgeai.ui.placement

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlacementViewModel : ViewModel() {

    private val _placementScore = MutableLiveData<Int>()
    val placementScore: LiveData<Int>
        get() = _placementScore

    private val _targetCompany =
        MutableLiveData<String>()

    val targetCompany: LiveData<String>
        get() = _targetCompany

    init {
        _placementScore.value = 82
        _targetCompany.value = "Google"
    }
}
package com.example.skillforgeai.ui.resume

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResumeViewModel : ViewModel() {

    private val _resumeScore = MutableLiveData<Int>()
    val resumeScore: LiveData<Int> = _resumeScore

    private val _suggestions = MutableLiveData<List<String>>()
    val suggestions: LiveData<List<String>> = _suggestions

    init {
        analyzeResume()
    }

    fun analyzeResume() {

        _resumeScore.value = 85

        _suggestions.value = listOf(
            "Add GitHub Profile",
            "Add LinkedIn Profile",
            "Include Projects Section",
            "Add Certifications",
            "Improve Technical Skills"
        )
    }
}
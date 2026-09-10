package com.example.skillforgeai.ui.onboarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.R
import com.example.skillforgeai.data.model.OnboardingItem

class OnboardingViewModel : ViewModel() {

    private val _onboardingItems =
        MutableLiveData<List<OnboardingItem>>()

    val onboardingItems: LiveData<List<OnboardingItem>>
        get() = _onboardingItems

    init {
        loadOnboardingItems()
    }

    private fun loadOnboardingItems() {

        _onboardingItems.value = listOf(

            OnboardingItem(
                title = "AI Powered Learning",
                description = "Get personalized learning paths powered by AI.",
                imageRes = R.drawable.onboarding_ai
            ),

            OnboardingItem(
                title = "Track Your Skills",
                description = "Monitor progress, certificates and achievements.",
                imageRes = R.drawable.onboarding_skill
            ),

            OnboardingItem(
                title = "Placement Ready",
                description = "Prepare for interviews, aptitude tests and jobs.",
                imageRes = R.drawable.onboarding_placement
            )
        )
    }
}
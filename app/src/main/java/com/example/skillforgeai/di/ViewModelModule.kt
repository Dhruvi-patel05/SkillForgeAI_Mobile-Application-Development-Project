package com.example.skillforgeai.di

import com.example.skillforgeai.ui.ai.AIViewModel
import com.example.skillforgeai.ui.auth.AuthViewModel
import com.example.skillforgeai.ui.dashboard.DashboardViewModel
import com.example.skillforgeai.ui.placement.PlacementViewModel
import com.example.skillforgeai.ui.profile.ProfileViewModel
import com.example.skillforgeai.ui.resume.ResumeViewModel
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {

    fun provideAuthViewModel(): AuthViewModel {
        return AuthViewModel()
    }

    fun provideDashboardViewModel(): DashboardViewModel {
        return DashboardViewModel()
    }

    fun provideAIViewModel(): AIViewModel {
        return AIViewModel()
    }

    fun provideResumeViewModel(): ResumeViewModel {
        return ResumeViewModel()
    }

    fun providePlacementViewModel(): PlacementViewModel {
        return PlacementViewModel()
    }

    fun provideProfileViewModel(): ProfileViewModel {
        return ProfileViewModel()
    }
}
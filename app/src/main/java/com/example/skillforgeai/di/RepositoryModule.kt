package com.example.skillforgeai.di

import com.example.skillforgeai.data.repository.*
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(): AuthRepository {
        return AuthRepository()
    }

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }

    @Provides
    @Singleton
    fun provideCourseRepository(): CourseRepository {
        return CourseRepository()
    }

    @Provides
    @Singleton
    fun provideSkillRepository(): SkillRepository {
        return SkillRepository()
    }

    @Provides
    @Singleton
    fun provideResumeRepository(): ResumeRepository {
        return ResumeRepository()
    }

    @Provides
    @Singleton
    fun providePlacementRepository(): PlacementRepository {
        return PlacementRepository()
    }

    @Provides
    @Singleton
    fun provideNotificationRepository(): NotificationRepository {
        return NotificationRepository()
    }

    @Provides
    @Singleton
    fun provideAIRepository(): AIRepository {
        return AIRepository()
    }
}
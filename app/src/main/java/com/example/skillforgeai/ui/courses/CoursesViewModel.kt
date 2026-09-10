package com.example.skillforgeai.ui.courses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.skillforgeai.R
import com.example.skillforgeai.data.model.Course

class CoursesViewModel : ViewModel() {

    private val _courses =
        MutableLiveData<List<Course>>()

    val courses: LiveData<List<Course>>
        get() = _courses

    init {
        loadCourses()
    }

    private fun loadCourses() {

        _courses.value = listOf(

            Course(
                courseId = "1",
                title = "Android Development",
                description = "Build Android Apps using Kotlin",
                instructor = "SkillForgeAI",
                duration = "30 Hours",
                imageUrl = "",
                progress = 65,
                rating = 4.8,
                category = "Development"
            ),

            Course(
                courseId = "2",
                title = "Python Programming",
                description = "Python from Beginner to Advanced",
                instructor = "SkillForgeAI",
                duration = "25 Hours",
                imageUrl = "",
                progress = 40,
                rating = 4.7,
                category = "Programming"
            ),

            Course(
                courseId = "3",
                title = "AI & Machine Learning",
                description = "Learn AI and ML Fundamentals",
                instructor = "SkillForgeAI",
                duration = "45 Hours",
                imageUrl = "",
                progress = 20,
                rating = 4.9,
                category = "Artificial Intelligence"
            )
        )
    }
}
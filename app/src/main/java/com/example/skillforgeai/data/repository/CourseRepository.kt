package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.Course
import kotlinx.coroutines.tasks.await

class CourseRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("Courses")

    suspend fun addCourse(
        course: Course
    ): Result<Unit> {

        return try {

            database.child(course.courseId)
                .setValue(course)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getCourses(): Result<List<Course>> {

        return try {

            val snapshot =
                database.get().await()

            val courses =
                snapshot.children.mapNotNull {
                    it.getValue(Course::class.java)
                }

            Result.success(courses)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
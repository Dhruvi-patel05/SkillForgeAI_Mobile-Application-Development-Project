package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.AutomationTask
import com.example.skillforgeai.data.model.StudyPlan
import com.example.skillforgeai.data.model.WeeklyReport
import kotlinx.coroutines.tasks.await



class AutomationRepository(
    private val firebaseDatabase: FirebaseDatabase
) {

    private val automationRef =
        firebaseDatabase.getReference("automation")

    suspend fun saveAutomationTask(
        userId: String,
        task: AutomationTask
    ): Result<Unit> {

        return try {

            automationRef
                .child(userId)
                .child("tasks")
                .child(task.taskId)
                .setValue(task)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    suspend fun getAutomationTasks(
        userId: String
    ): Result<List<AutomationTask>> {

        return try {

            val snapshot =
                automationRef
                    .child(userId)
                    .child("tasks")
                    .get()
                    .await()

            val taskList = mutableListOf<AutomationTask>()

            snapshot.children.forEach {

                it.getValue(
                    AutomationTask::class.java
                )?.let { task ->

                    taskList.add(task)
                }
            }

            Result.success(taskList)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    suspend fun saveStudyPlan(
        userId: String,
        studyPlan: StudyPlan
    ): Result<Unit> {

        return try {

            automationRef
                .child(userId)
                .child("studyPlan")
                .setValue(studyPlan)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    suspend fun saveWeeklyReport(
        userId: String,
        report: WeeklyReport
    ): Result<Unit> {

        return try {

            automationRef
                .child(userId)
                .child("weeklyReports")
                .child(report.reportId)
                .setValue(report)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    suspend fun deleteAutomationTask(
        userId: String,
        taskId: String
    ): Result<Unit> {

        return try {

            automationRef
                .child(userId)
                .child("tasks")
                .child(taskId)
                .removeValue()
                .await()

            Result.success(Unit)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }

    suspend fun updateTaskStatus(
        userId: String,
        taskId: String,
        enabled: Boolean
    ): Result<Unit> {

        return try {

            automationRef
                .child(userId)
                .child("tasks")
                .child(taskId)
                .child("enabled")
                .setValue(enabled)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }
}
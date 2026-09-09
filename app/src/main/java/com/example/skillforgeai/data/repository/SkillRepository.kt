package com.example.skillforgeai.data.repository

import com.google.firebase.database.FirebaseDatabase
import com.example.skillforgeai.data.model.Skill
import kotlinx.coroutines.tasks.await

class SkillRepository {

    private val database =
        FirebaseDatabase.getInstance()
            .getReference("Skills")

    suspend fun saveSkill(
        skill: Skill
    ): Result<Unit> {

        return try {

            database.child(skill.skillId)
                .setValue(skill)
                .await()

            Result.success(Unit)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getSkills(): Result<List<Skill>> {

        return try {

            val snapshot =
                database.get().await()

            val skills =
                snapshot.children.mapNotNull {
                    it.getValue(Skill::class.java)
                }

            Result.success(skills)

        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
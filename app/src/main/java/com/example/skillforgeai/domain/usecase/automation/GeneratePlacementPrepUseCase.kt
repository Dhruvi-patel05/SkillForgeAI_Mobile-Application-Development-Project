package com.example.skillforgeai.domain.usecase.automation

import javax.inject.Inject

class GeneratePlacementPrepUseCase @Inject constructor() {

    operator fun invoke(): List<String> {

        return listOf(
            "Solve 5 Aptitude Questions",
            "Practice 1 Coding Problem",
            "Read 2 Interview Questions"
        )
    }
}
package com.example.skillforgeai.domain.usecase.automation

import javax.inject.Inject

class ResumeImprovementUseCase @Inject constructor() {

    operator fun invoke(
        resumeScore: Int
    ): String {

        return when {

            resumeScore < 50 ->
                "Add Projects and Skills"

            resumeScore < 80 ->
                "Improve Resume Formatting"

            else ->
                "Resume looks strong"
        }
    }
}
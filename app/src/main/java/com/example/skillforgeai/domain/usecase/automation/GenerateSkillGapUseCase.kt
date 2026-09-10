package com.example.skillforgeai.domain.usecase.automation

import com.example.skillforgeai.data.model.SkillGap
import javax.inject.Inject

class GenerateSkillGapUseCase @Inject constructor() {

    operator fun invoke(
        currentSkills: List<String>,
        requiredSkills: List<String>,
        companyName: String
    ): SkillGap {

        val missingSkills =
            requiredSkills.filterNot {
                currentSkills.contains(it)
            }

        val score =
            ((currentSkills.size.toFloat()
                    / requiredSkills.size.toFloat()) * 100)
                .toInt()

        return SkillGap(
            companyName = companyName,
            currentSkills = currentSkills,
            requiredSkills = requiredSkills,
            missingSkills = missingSkills,
            score = score
        )
    }
}
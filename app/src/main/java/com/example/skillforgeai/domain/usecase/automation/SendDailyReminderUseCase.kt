package com.example.skillforgeai.domain.usecase.automation

import javax.inject.Inject

class SendDailyReminderUseCase @Inject constructor() {

    operator fun invoke(): String {

        return "Time to continue your learning journey!"
    }
}
package com.example.dagger2

import dagger.Component
import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password);
        notificationService.sendEmail(email, "no-replay@gmail.com", "User Registered")

    }

}
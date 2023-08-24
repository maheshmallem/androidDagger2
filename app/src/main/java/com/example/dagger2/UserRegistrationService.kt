package com.example.dagger2

import dagger.Component
import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password);
        emailService.sendEmail(email, "no-replay@gmail.com", "User Registered")

    }

}
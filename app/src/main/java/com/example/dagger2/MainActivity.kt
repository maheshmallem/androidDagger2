package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationComponent: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component =
            (application as UserApplication).userRegistrationComponent

        component.inject(this)

        userRegistrationComponent.registerUser("mallemmahesh@gmail.com", "123456")

    }
}
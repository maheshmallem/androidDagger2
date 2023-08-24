package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    var component = DaggerUserRegistrationComponent.builder().build()
        val registrationService = component.getUserRegistrationService();
        val emailService = component.getEmailService();


        registrationService.registerUser("mallemmahesh@gmail.com","123456")

    }
}
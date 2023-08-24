package com.example.dagger2

import dagger.Component
import javax.inject.Inject

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

}
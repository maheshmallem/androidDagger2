package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton


@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int): UserRegistrationComponent

    }

}
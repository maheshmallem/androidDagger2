package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
 // Provides also we can use
    @Binds
    abstract fun getSqlRepository(sqlRepository: SqlRepository) :UserRepository
}
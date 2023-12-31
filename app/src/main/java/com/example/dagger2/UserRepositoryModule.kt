package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
 // Provides also we can use
    // Inject already used for SQL Repo so noo need to create new object
    @Binds
    abstract fun getSqlRepository(sqlRepository: SqlRepository) :UserRepository
}
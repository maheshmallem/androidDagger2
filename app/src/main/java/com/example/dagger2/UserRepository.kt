package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SqlRepository @Inject constructor() : UserRepository {


    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "user saved in DB")
    }
}

class FirebaseRepository :UserRepository{

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "user saved in Firebase")
    }

}
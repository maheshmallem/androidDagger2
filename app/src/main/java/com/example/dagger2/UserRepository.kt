package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SqlRepository @Inject constructor() : UserRepository {
    val TAG = SqlRepository::class.java.name;

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "user saved in DB")
    }
}

class FirebaseRepository :UserRepository{
    val TAG = FirebaseRepository::class.java.name;
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "user saved in Firebase")
    }

}
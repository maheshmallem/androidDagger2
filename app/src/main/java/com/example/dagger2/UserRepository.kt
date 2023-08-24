package com.example.dagger2

import android.util.Log
import javax.inject.Inject


class UserRepository @Inject constructor(){
     val TAG = UserRepository::class.java.name;

    fun saveUser(email:String,password:String){
        Log.d(TAG, "user saved in DB")
    }
}
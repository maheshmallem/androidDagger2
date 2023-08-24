package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    val TAG = UserRepository::class.java.name;

    fun sendEmail(to :String, from:String, body: String){
        Log.d(TAG, "email sent")
    }
}
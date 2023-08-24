package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun sendEmail(to :String, from:String, body: String?)
}

class EmailService @Inject constructor() :NotificationService{
    val TAG = UserRepository::class.java.name;

    override fun sendEmail(to :String, from:String, body: String?){
        Log.d(TAG, "Email sent")
    }
}

class MessageService : NotificationService{
    val TAG = MessageService::class.java.name;
    override fun sendEmail(to: String, from: String, body: String?) {
        Log.d(TAG, "Email sent")
    }

}
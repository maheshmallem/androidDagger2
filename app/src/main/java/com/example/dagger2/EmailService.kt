package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun sendEmail(to :String, from:String, body: String?)
}

class EmailService @Inject constructor() :NotificationService{
    override fun sendEmail(to :String, from:String, body: String?){
        Log.d(TAG, "Email sent")
    }
}
class MessageService(private val retreyCount :Int) : NotificationService{
    override fun sendEmail(to: String, from: String, body: String?) {
        Log.d(TAG, "Email sent -- Retry count $retreyCount")
    }

}
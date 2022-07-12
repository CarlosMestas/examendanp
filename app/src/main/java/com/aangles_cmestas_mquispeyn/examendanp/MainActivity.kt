package com.aangles_cmestas_mquispeyn.examendanp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pusher.pushnotifications.PushNotifications;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PushNotifications.start(applicationContext, "b6dd6a14-bd22-4988-9af4-0e17301cd078");
        PushNotifications.addDeviceInterest("hello");


    }
}
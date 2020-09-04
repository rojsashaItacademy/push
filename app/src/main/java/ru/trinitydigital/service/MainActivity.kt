package ru.trinitydigital.service

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.trinitydigital.service.data.NotificationUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
    }

    private fun setupListeners() {
        btnSendPush.setOnClickListener {
            NotificationUtils.createNotification(
                applicationContext,
                "234234234234",
                "11111111111"
            )
        }
    }
}
package com.example.aplicatie_calcul_mobil

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openTimerPage() {
        val intent = Intent(this, TimerActivity::class.java)
        startActivity(intent)
    }

    fun openAlarmPage() {
        val intent = Intent(this, AlarmActivity::class.java)
        startActivity(intent)
    }
}
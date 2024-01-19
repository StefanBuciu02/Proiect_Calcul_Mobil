package com.example.aplicatie_calcul_mobil

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity

class TimerActivity : AppCompatActivity() {
    private lateinit var chronometer: Chronometer
    private lateinit var btnStart: Button
    private lateinit var btnStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        chronometer = findViewById(R.id.chronometer)
        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)
    }

    fun startChronometer(view: View) {
        chronometer.start()
        btnStart.isEnabled = false
        btnStop.isEnabled = true
    }

    fun stopChronometer(view: View) {
        chronometer.stop()
        btnStart.isEnabled = true
        btnStop.isEnabled = false
    }
}
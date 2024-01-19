package com.example.aplicatie_calcul_mobil

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class AlarmActivity : AppCompatActivity() {
    private lateinit var timePicker: TimePicker
    private lateinit var btnSetare: Button
    private lateinit var btnAnulare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        timePicker = findViewById(R.id.timePicker)
        btnSetare = findViewById(R.id.btnSetare)
        btnAnulare = findViewById(R.id.btnAnulare)

        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->

            val message = "Ora setată: $hourOfDay:$minute"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        btnSetare.setOnClickListener {
            val selectedHour = timePicker.hour
            val selectedMinute = timePicker.minute

            val message = "Alarmă setată la: $selectedHour:$selectedMinute"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        }

        btnAnulare.setOnClickListener {
            Toast.makeText(this, "Alarmă anulată", Toast.LENGTH_SHORT).show()
        }
    }
}
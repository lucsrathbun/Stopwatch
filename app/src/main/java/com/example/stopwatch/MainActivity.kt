package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Chronometer

private lateinit var resetButton: Button
private lateinit var startButton: Button
private lateinit var stopwatch: Chronometer
class MainActivity : AppCompatActivity() {

    //make classwide static constant
    companion object {
        //all your static constants go here
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wireWidgets()


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }
    private fun wireWidgets() {
        stopwatch = findViewById(R.id.chronometer_main_stopwatch)
        resetButton = findViewById(R.id.button_main_reset)
        startButton = findViewById(R.id.button_main_start)
    }
}
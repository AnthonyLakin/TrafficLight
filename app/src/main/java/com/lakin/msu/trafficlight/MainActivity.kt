package com.lakin.msu.trafficlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lakin.msu.trafficlight.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val lightState = listOf("Stop", "Go", "Wait")
    private val colorChoice = listOf("@color/red", "@color/green", "@color/yellow")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var counter = 0
        binding.changeLightButton.setOnClickListener{
            if (counter < 2) {
                counter++
            } else {
                counter = 0

            }
            stateName(lightState[counter])

        }
    }

    private fun stateName(state: String) {
        binding.changeLightButton.text = state
        for (i in 0..<lightState.count()) {
            if (lightState[i] == state) {
                binding.changeLightButton.setBackgroundColor(Color.parseColor("#FF0000"))
            }
        }

    }

    /*private fun waitFunc() {

    }

    private fun goFunc() {

    }

    private fun stopFunc() {
        binding.changeLightButton.setBackgroundColor(Color.RED)
    }*/
}
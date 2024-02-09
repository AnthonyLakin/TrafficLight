package com.lakin.msu.trafficlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakin.msu.trafficlight.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val lightState = listOf("Go", "Stop", "Wait")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var counter = 1
        binding.changeLightButton.setOnClickListener{
            listIndex(counter)
            counter++
        }
    }

    private fun listIndex(index: Int) {
        val currentIndex = lightState[index]
        binding.changeLightButton.text = currentIndex
    }
}
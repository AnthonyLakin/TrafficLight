package com.lakin.msu.trafficlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//private lateinit var binding: ResultProfileBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ResultProfileBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}
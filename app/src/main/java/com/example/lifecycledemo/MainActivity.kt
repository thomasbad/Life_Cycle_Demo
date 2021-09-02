package com.example.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Main onCreate() is called -- $number")
    }

    override fun onPause() {
        super.onPause()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Main onPause() is called -- $number")
    }

    override fun onResume() {
        super.onResume()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Main onResume() is called -- $number")
    }

}
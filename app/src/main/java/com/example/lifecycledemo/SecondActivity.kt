package com.example.lifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onCreate() is called -- $number")
    }

    override fun onPause() {
        super.onPause()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onPause() is called -- $number")
    }

    override fun onResume() {
        super.onResume()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onResume() is called -- $number")
    }

    override fun onStart() {
        super.onStart()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onStart() is called -- $number")
    }

    override fun onRestart() {
        super.onRestart()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onRestart() is called -- $number")
    }

    override fun onStop() {
        super.onStop()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onStop() is called -- $number")
    }

    override fun onDestroy() {
        super.onDestroy()
        var number = Random.nextInt(100)
        Log.e("LifeCycleDemo", number.toString())
        Log.w("LifeCycleDemo", "Second onDestroy() is called -- $number")
    }

    fun goBack(v: View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}
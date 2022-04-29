package com.example.a7_ncoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TAG = "Coroutine Tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            showMyLog()
        }

        CoroutineScope(Dispatchers.IO).launch {
            showMyLog()
        }
    }

    private suspend fun showMyLog() {
        //delay(3000) جزو متدهای (suspend) است
        Log.i(TAG,Thread.currentThread().name)
    }
}
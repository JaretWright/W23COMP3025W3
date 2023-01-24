package com.constantlearningdad.w23comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TipCalculatorActivity : AppCompatActivity() {
   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_calculator)
        
        Log.i("Lifecycle","TipCalculatorActivity.onCreate() called")
    }

    override fun onStart(){
        super.onStart()
        Log.i("Lifecycle","TipCalculatorActivity.onStart() called")
    }

    override fun onResume(){
        super.onResume()
        Log.i("Lifecycle","TipCalculatorActivity.onResume() called")
    }

    override fun onPause(){
        super.onPause()
        Log.i("Lifecycle","TipCalculatorActivity.onPause() called")
    }

    override fun onStop(){
        super.onStop()
        Log.i("Lifecycle","TipCalculatorActivity.onStop() called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("Lifecycle","TipCalculatorActivity.onDestroy() called")
    }

}
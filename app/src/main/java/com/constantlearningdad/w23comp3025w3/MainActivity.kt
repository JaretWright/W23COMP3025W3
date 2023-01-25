package com.constantlearningdad.w23comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.constantlearningdad.w23comp3025w3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //in Java -> private ActivityMainBinding binding;
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tipCalculatorButton.setOnClickListener {
            startActivity(Intent(this,TipCalculatorActivity::class.java))
            Log.i("Lifecycle","TipCalculatorActivity intent created")
        }

        Log.i("Lifecycle","MainActivity.onCreate() called")
    }

    override fun onStart(){
        super.onStart()
        Log.i("Lifecycle","MainActivity.onStart() called")
    }

    override fun onResume(){
        super.onResume()
        Log.i("Lifecycle","MainActivity.onResume() called")
    }

    override fun onPause(){
        super.onPause()
        Log.i("Lifecycle","MainActivity.onPause() called")
    }

    override fun onStop(){
        super.onStop()
        Log.i("Lifecycle","MainActivity.onStop() called")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("Lifecycle","MainActivity.onDestroy() called")
    }

}
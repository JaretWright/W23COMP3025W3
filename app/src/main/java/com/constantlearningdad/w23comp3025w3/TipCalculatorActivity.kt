package com.constantlearningdad.w23comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.constantlearningdad.w23comp3025w3.databinding.ActivityTipCalculatorBinding
import java.text.NumberFormat

class TipCalculatorActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTipCalculatorBinding
    private var initialMealCost = 0.0
    private var tipPercent = 15
   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        Log.i("Lifecycle","TipCalculatorActivity.onCreate() called")

        //If the user changes the meal amount, recalculate the tip
        binding.mealPreTipEditText.addTextChangedListener {
            if (!it.isNullOrBlank())
                initialMealCost = it.toString().toDouble()
            else
                initialMealCost = 0.0

            calculateTip()
        }

        //if the user changes the tip amount, recalculate the tip
        binding.tipPercentSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, newValue: Int, p2: Boolean) {
                tipPercent = newValue
                calculateTip()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
    }

    private fun calculateTip()
    {
        var tip = initialMealCost*tipPercent / 100
        binding.tipPercentTextView.text = "${tipPercent}%"

        val currencyFormat = NumberFormat.getCurrencyInstance()
        binding.tipTotalTextView.text = currencyFormat.format(tip)
        binding.amountWithTipTextView.text = currencyFormat.format(tip+initialMealCost)

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
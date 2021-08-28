package com.islam.colormyview

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.islam.colormyview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()

    }

    fun setListeners() {
        val listOfViews = listOf<View>(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout,
            binding.btnRed,
            binding.btnYellow,
            binding.btnGreen
        )
        for (item in listOfViews) {
            item.setOnClickListener { makeColors(it) }
        }
    }

    fun makeColors(view: View) {
        when (view) {
            binding.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText -> view.setBackgroundColor(Color.GRAY)
            binding.constraintLayout -> view.setBackgroundColor(Color.LTGRAY)

            binding.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

            binding.btnRed -> binding.boxThreeText.setBackgroundColor(Color.RED)
            binding.btnYellow -> binding.boxFourText.setBackgroundColor(Color.YELLOW)
            binding.btnGreen -> binding.boxFiveText.setBackgroundColor(Color.GREEN)
        }
    }
}
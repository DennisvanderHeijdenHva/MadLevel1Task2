package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers() {
        val isFirstRowCorrect = (binding.etFirstAB.text.toString() == getString(R.string.t))
        val isSecondRowCorrect = (binding.etSecondAB.text.toString() == getString(R.string.f))
        val isThirdRowCorrect = (binding.etThirdAB.text.toString() == getString(R.string.f))
        val isFourthRowCorrect = (binding.etFourthAB.text.toString() == getString(R.string.f))

        if (isFirstRowCorrect && isSecondRowCorrect && isThirdRowCorrect && isFourthRowCorrect) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
}
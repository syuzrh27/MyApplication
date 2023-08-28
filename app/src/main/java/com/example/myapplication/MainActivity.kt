package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            btnTest1.setOnClickListener{
                val enteredText = binding.namaa.text.toString()
                Toast.makeText(this@MainActivity,enteredText,Toast.LENGTH_LONG).show()
            }
        }
    }

}
package com.example.gragment_tp5_ex1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProvider(this).get(ViewModelActivity::class.java)

        val textScore = findViewById<TextView>(R.id.txt_counter)
        val incrementButton = findViewById<MaterialButton>(R.id.btn_increment)
        val decrementButton = findViewById<MaterialButton>(R.id.btn_decrement)


        viewModel.score.observe(this) { newScore ->
            textScore.text = newScore.toString()
        }

        incrementButton.setOnClickListener {
            viewModel.plusUn()
        }

        decrementButton.setOnClickListener {
            viewModel.moinsUn()
        }

    }
}
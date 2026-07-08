package ru.valentinzadorozhniy.m1_hello_kitty

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val helloTextView: TextView = findViewById(R.id.textView)
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        val editTextView: TextView = findViewById(R.id.editTextView)
        imageButton.setOnClickListener {
            if(editTextView.text.isEmpty()){
                helloTextView.text = "Hello Kitty";
            } else {
                helloTextView.text = "Привет, " + editTextView.text
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
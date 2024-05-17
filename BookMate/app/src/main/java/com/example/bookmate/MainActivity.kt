package com.example.bookmate

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bookmate.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

        loadPreferences()

        binding.button.setOnClickListener {
            val email = binding.editTextText.text.toString()
            val password = binding.editTextTextPassword3.text.toString()
            val rememberMe = binding.checkBox.isChecked

            if (rememberMe) {
                savePreferences(email, password)
            } else {
                clearPreferences()
            }

            // Handle login logic here
        }
    }

    private fun loadPreferences() {
        val savedEmail = sharedPreferences.getString("email", "")
        val savedPassword = sharedPreferences.getString("password", "")
        val rememberMe = sharedPreferences.getBoolean("remember_me", false)

        binding.editTextText.setText(savedEmail)
        binding.editTextTextPassword3.setText(savedPassword)
        binding.checkBox.isChecked = rememberMe
    }

    private fun savePreferences(email: String, password: String) {
        with(sharedPreferences.edit()) {
            putString("email", email)
            putString("password", password)
            putBoolean("remember_me", true)
            apply()
        }
    }

    private fun clearPreferences() {
        with(sharedPreferences.edit()) {
            remove("email")
            remove("password")
            putBoolean("remember_me", false)
            apply()
        }
    }
}

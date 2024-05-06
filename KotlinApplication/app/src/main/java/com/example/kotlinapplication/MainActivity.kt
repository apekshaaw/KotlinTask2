package com.example.kotlinapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences: SharedPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
        val rememberMe: Boolean = sharedPreferences.getBoolean("rememberMe", false)
        if (rememberMe) {
            val savedPassword: String? = sharedPreferences.getString("password", "")
            binding.passwordEditText.setText(savedPassword)
            binding.rememberCheckBox.isChecked = true
        }

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (username == "apeksha" && password == "wagle") {
                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                if (binding.rememberCheckBox.isChecked) {
                    editor.putString("password", password)
                    editor.putBoolean("rememberMe", true)
                } else {
                    editor.remove("password")
                    editor.remove("rememberMe")
                }
                editor.apply()

                // Start the dashboard activity
                startActivity(Intent(this@MainActivity, DashboardActivity::class.java))
                finish()
            } else {
                Toast.makeText(this@MainActivity, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

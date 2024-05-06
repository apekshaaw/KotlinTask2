
package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var btnCalculate: Button
    lateinit var btnNavigate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new)
        textView = findViewById(R.id.lbltextView)
        btnCalculate = findViewById(R.id.btnCalculate)
        btnNavigate = findViewById(R.id.btnNavigate)

        btnCalculate.setOnClickListener {
            var counter = 1
            textView.text = "" + counter
        }

        Log.d("Message","onCreate called")
        }

    override fun onStart() {
        super.onStart()
        Log.d("Message","onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","onRestart called")
    }

    }

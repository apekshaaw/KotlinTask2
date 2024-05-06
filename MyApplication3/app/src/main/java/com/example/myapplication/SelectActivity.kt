//package com.example.myapplication
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class SelectActivity : AppCompatActivity() {
//    lateinit var button = Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_select)
//
//        button.setOnClickListener{
//            var intent = Intent(this@SelectActivity,
//            SecondActivity::class.java)
//            intent.putExtra("name",editTextName.text)
//            intent.putExtra("address",editTextAddress.text)
//            startActivity(intent)
//        }
//
//        button = findViewById(R.id.btnNavigate)
//        editTextName = findViewById(R.id.editTextText)
//        editTextAddress = findViewById(R.id.editTextText2)
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}
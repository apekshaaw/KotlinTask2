package com.example.bookmate

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bookmate.databinding.ActivityDashBoardBinding
import com.example.bookmate.databinding.ActivityMainBinding

class DashBoardActivity : AppCompatActivity() {
    lateinit var dashBinding: ActivityDashBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        dashBinding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(dashBinding.root)

//        dashBinding.buttonNavigationBar.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.home -> replaceFragment(HomeFragment())
//                R.id.favourite -> replaceFragment(FavouriteFragment())
//                R.id.profile -> replaceFragment(ProfileFragment())
//                else -> {}
//            }
//            true
//
//        }
    }
}
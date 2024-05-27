package com.example.mypart

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.mypart.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {

    lateinit var activityBinding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)

        activityBinding.navigateButton.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.favourite -> replaceFragment(FavouriteFragment())
                R.id.cart -> replaceFragment(CartFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                else -> {}
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.framee, fragment)
        fragmentTransaction.commit()
    }
}
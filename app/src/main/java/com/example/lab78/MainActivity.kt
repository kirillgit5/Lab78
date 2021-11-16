package com.example.lab78

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab78.databinding.ActivityMainBinding
import com.example.lab78.ui.eventlist.EventListFragment
import com.example.lab78.ui.holidays.HolidaysFragment
import com.example.lab78.ui.profile.ProfileFragment
import com.example.lab78.ui.common.App

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as App).mainRouter = MainRouter(supportFragmentManager)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.EventNavigation -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, EventListFragment()).commit()
                    true
                }
                R.id.HolidaysNavigation -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, HolidaysFragment()).commit()
                    true
                }
                R.id.ProfileNavigation -> {
                    supportFragmentManager.beginTransaction().replace(R.id.container, ProfileFragment()).commit()
                    true
                }
                else -> false
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.container, EventListFragment()).commit()
    }
}
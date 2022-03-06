package com.example.m5_l3_telegramui.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.m5_l3_telegramui.R
import com.example.m5_l3_telegramui.fragment.ChatFragment
import com.example.m5_l3_telegramui.fragment.ContactFragment
import com.example.m5_l3_telegramui.fragment.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var chatFragment: ChatFragment
    private lateinit var contactFragment: ContactFragment
    private lateinit var settingsFragment: SettingsFragment

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun loadFragment(fragment:Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_1, fragment)
            .commit()
    }

    private fun initViews() {
        contactFragment = ContactFragment()
        chatFragment = ChatFragment()
        settingsFragment = SettingsFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.menu.getItem(0).isCheckable = true

        loadFragment(contactFragment)

        bottomNavigation.setOnNavigationItemSelectedListener {menu ->

            when(menu.itemId){
                R.id.page_contact -> {
                    loadFragment(contactFragment)
                    true
                }
                R.id.page_chat -> {
                    loadFragment(chatFragment)
                    true
                }
                R.id.page_settings -> { loadFragment(settingsFragment)
                    true
                }
                else -> false
            }
        }

    }



    }

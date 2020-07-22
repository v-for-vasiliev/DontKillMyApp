package ru.vasiliev.dontkillmyapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.vasiliev.dontkillmyapp.R
import ru.vasiliev.dontkillmyapp.ui.vendorhack.VendorHackFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, VendorHackFragment.newInstance())
                .commitNow()
        }
    }
}
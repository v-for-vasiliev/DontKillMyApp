package ru.vasiliev.dontkillmyapp

import android.app.Application
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class App : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        // Stetho
        Stetho.initializeWithDefaults(this)
    }
}
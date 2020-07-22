package ru.vasiliev.dontkillmyapp

import android.app.Application
import com.facebook.stetho.Stetho
import ru.vasiliev.dontkillmyapp.di.component.AppComponent
import ru.vasiliev.dontkillmyapp.di.component.DaggerAppComponent
import ru.vasiliev.dontkillmyapp.di.module.AppModule
import ru.vasiliev.dontkillmyapp.di.module.NetworkModule

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        // Stetho
        Stetho.initializeWithDefaults(this)

        // Dagger application component
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this))
            .networkModule(NetworkModule(BuildConfig.API_BASE_URL)).build()
    }
}
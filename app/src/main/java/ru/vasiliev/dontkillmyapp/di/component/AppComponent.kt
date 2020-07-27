package ru.vasiliev.dontkillmyapp.di.component

import dagger.Component
import ru.vasiliev.dontkillmyapp.App
import ru.vasiliev.dontkillmyapp.di.module.ApiModule
import ru.vasiliev.dontkillmyapp.di.module.AppModule
import ru.vasiliev.dontkillmyapp.di.module.NetworkModule
import ru.vasiliev.dontkillmyapp.di.module.UtilModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, ApiModule::class, UtilModule::class])
interface AppComponent {
    val app: App

    fun plusVendorHackComponent(): VendorHacksComponent
}
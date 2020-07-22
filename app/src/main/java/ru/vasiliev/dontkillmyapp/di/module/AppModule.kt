package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import ru.vasiliev.dontkillmyapp.App
import javax.inject.Singleton

@Module
class AppModule(private val app: App) {

    @Singleton
    @Provides
    fun provideApp(): App = app
}
package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.vasiliev.dontkillmyapp.data.datasource.DontKillMyAppApi
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideApi(retrofit: Retrofit): DontKillMyAppApi =
        retrofit.create(DontKillMyAppApi::class.java)
}
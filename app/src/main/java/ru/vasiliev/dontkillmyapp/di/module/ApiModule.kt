package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import ru.vasiliev.dontkillmyapp.data.datasource.DontKillMyAppApi
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ApiModule {
    @Singleton
    @Provides
    fun provideApi(retrofit: Retrofit): DontKillMyAppApi =
        retrofit.create(DontKillMyAppApi::class.java)
}
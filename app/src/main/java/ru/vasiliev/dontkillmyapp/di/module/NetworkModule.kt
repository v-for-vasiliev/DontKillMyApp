package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import ru.vasiliev.dontkillmyapp.BuildConfig
import ru.vasiliev.dontkillmyapp.data.network.ClientFactory
import ru.vasiliev.dontkillmyapp.data.network.RetrofitFactory
import ru.vasiliev.dontkillmyapp.di.qualifier.DefaultOkHttpClient
import ru.vasiliev.dontkillmyapp.di.qualifier.DefaultOkHttpClientWithStetho
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @DefaultOkHttpClient
    @Singleton
    @Provides
    fun provideNetworkClient(): OkHttpClient = ClientFactory.defaultClient

    @DefaultOkHttpClientWithStetho
    @Singleton
    @Provides
    fun defaultClientWithStetho(): OkHttpClient = ClientFactory.defaultClientWithStetho

    @Singleton
    @Provides
    fun provideRetrofit(@DefaultOkHttpClient client: OkHttpClient): Retrofit =
        RetrofitFactory.getDefaultRetrofit(BuildConfig.API_BASE_URL, client)
}
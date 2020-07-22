package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import ru.vasiliev.dontkillmyapp.BuildConfig
import ru.vasiliev.dontkillmyapp.data.network.ClientFactory
import ru.vasiliev.dontkillmyapp.data.network.RetrofitFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule(private val baseUrl: String) {
    @Named("release")
    @Singleton
    @Provides
    fun provideNetworkClient(): OkHttpClient = ClientFactory.defaultClient

    @Provides
    @Singleton
    @Named("debug")
    fun defaultClientWithStetho(): OkHttpClient = ClientFactory.defaultClientWithStetho

    @Singleton
    @Provides
    fun provideRetrofit(@Named(BuildConfig.NETWORK_TRACE_STATE) client: OkHttpClient): Retrofit =
        RetrofitFactory.getDefaultRetrofit(baseUrl, client)
}
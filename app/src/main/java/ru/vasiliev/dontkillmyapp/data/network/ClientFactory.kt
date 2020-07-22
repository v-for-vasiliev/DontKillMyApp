package ru.vasiliev.dontkillmyapp.data.network

import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object ClientFactory {
    val defaultClient: OkHttpClient
        get() = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(40, TimeUnit.SECONDS).build()

    val defaultClientWithStetho: OkHttpClient
        get() = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(40, TimeUnit.SECONDS)
            .addNetworkInterceptor(StethoInterceptor()).build()
}
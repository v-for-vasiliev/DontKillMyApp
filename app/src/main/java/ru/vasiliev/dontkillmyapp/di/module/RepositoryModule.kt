package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import ru.vasiliev.dontkillmyapp.data.datasource.DontKillMyAppApi
import ru.vasiliev.dontkillmyapp.data.repository.VendorHackRepositoryImpl
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHackRepository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideVendorHackRepository(api: DontKillMyAppApi): VendorHackRepository =
        VendorHackRepositoryImpl(api)
}
package ru.vasiliev.dontkillmyapp.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import ru.vasiliev.dontkillmyapp.data.repository.VendorHacksRepositoryImpl
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHacksRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindVendorHackRepository(
        vendorHacksRepository: VendorHacksRepositoryImpl
    ): VendorHacksRepository
}
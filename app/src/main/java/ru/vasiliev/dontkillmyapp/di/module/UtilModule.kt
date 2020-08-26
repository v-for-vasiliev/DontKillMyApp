package ru.vasiliev.dontkillmyapp.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.vasiliev.dontkillmyapp.util.SchedulerProvider
import ru.vasiliev.dontkillmyapp.util.SchedulerProviderImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class UtilModule {
    @Singleton
    @Binds
    abstract fun bindScheduler(
        schedulerProviderImpl: SchedulerProviderImpl
    ): SchedulerProvider
}
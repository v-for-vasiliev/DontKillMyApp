package ru.vasiliev.dontkillmyapp.di.module

import dagger.Module
import dagger.Provides
import ru.vasiliev.dontkillmyapp.data.util.SchedulerProvider
import ru.vasiliev.dontkillmyapp.data.util.SchedulerProviderImpl
import javax.inject.Singleton

@Module
class UtilModule {
    @Singleton
    @Provides
    fun provideScheduler(): SchedulerProvider = SchedulerProviderImpl()
}
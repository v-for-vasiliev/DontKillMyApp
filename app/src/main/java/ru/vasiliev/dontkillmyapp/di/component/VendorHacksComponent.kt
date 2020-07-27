package ru.vasiliev.dontkillmyapp.di.component

import dagger.Subcomponent
import ru.vasiliev.dontkillmyapp.di.module.RepositoryModule
import ru.vasiliev.dontkillmyapp.di.scope.VendorHackScope

@VendorHackScope
@Subcomponent(modules = [RepositoryModule::class])
interface VendorHacksComponent {
}
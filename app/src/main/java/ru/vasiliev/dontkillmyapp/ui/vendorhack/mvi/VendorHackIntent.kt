package ru.vasiliev.dontkillmyapp.ui.vendorhack.mvi

import ru.vasiliev.dontkillmyapp.core.mvi.MviIntent

sealed class VendorHackIntent : MviIntent {
    object LoadAllVendorHacksIntent : VendorHackIntent()
    data class LoadVendorHacksIntent(val vendor: String) : VendorHackIntent()
}
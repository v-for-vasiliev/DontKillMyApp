package ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi

import ru.vasiliev.dontkillmyapp.mvi.MviIntent

sealed class VendorHacksIntent : MviIntent {
    object LoadAllVendorHacksIntent : VendorHacksIntent()
    data class LoadVendorHacksIntent(val vendor: String) : VendorHacksIntent()
}
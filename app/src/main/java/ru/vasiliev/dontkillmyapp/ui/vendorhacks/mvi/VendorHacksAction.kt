package ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi

import ru.vasiliev.dontkillmyapp.core.mvi.MviAction

sealed class VendorHacksAction : MviAction {
    object LoadHacksAction : VendorHacksAction()
}
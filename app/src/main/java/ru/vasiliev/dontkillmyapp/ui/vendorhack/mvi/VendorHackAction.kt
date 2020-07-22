package ru.vasiliev.dontkillmyapp.ui.vendorhack.mvi

import ru.vasiliev.dontkillmyapp.core.mvi.MviAction

sealed class VendorHackAction : MviAction {
    object LoadHacksAction : VendorHackAction()
}
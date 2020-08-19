package ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi

import ru.vasiliev.dontkillmyapp.core.mvi.MviViewState
import ru.vasiliev.dontkillmyapp.domain.model.VendorHacksModel

data class VendorHacksViewState(
    val isLoading: Boolean,
    val hacks: VendorHacksModel?,
    val error: Throwable?
) : MviViewState {
    companion object {
        fun initial(): VendorHacksViewState = VendorHacksViewState(false, null, null)
    }
}
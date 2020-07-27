package ru.vasiliev.dontkillmyapp.ui.vendorhacks.mvi

import ru.vasiliev.dontkillmyapp.core.mvi.MviResult
import ru.vasiliev.dontkillmyapp.domain.model.VendorHacksModel

sealed class VendorHacksResult : MviResult {
    sealed class LoadHacksResult : VendorHacksResult() {
        object Loading : LoadHacksResult()
        data class Success(val hacks: VendorHacksModel) : LoadHacksResult()
        data class Failure(val error: Throwable) : LoadHacksResult()
    }
}
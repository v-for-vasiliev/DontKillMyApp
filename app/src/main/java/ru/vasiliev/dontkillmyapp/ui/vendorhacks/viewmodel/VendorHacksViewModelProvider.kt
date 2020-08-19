package ru.vasiliev.dontkillmyapp.ui.vendorhacks.viewmodel

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import ru.vasiliev.dontkillmyapp.domain.interactor.VendorHacksInteractor

class VendorHacksViewModelProvider(
    private val vendorHacksInteractor: VendorHacksInteractor,
    savedStateRegistryOwner: SavedStateRegistryOwner,
    args: Bundle? = null
) : AbstractSavedStateViewModelFactory(savedStateRegistryOwner, args) {
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        return VendorHacksViewModel(handle, vendorHacksInteractor) as T
    }
}
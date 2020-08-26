package ru.vasiliev.dontkillmyapp.ui.vendorhacks

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.scopes.FragmentScoped
import ru.vasiliev.dontkillmyapp.domain.interactor.VendorHacksInteractor

@FragmentScoped
class VendorHacksViewModel @ViewModelInject constructor(
    private val interactor: VendorHacksInteractor,
    @Assisted private val handle: SavedStateHandle
) : ViewModel() {
    fun loadHacks() {
    }
}
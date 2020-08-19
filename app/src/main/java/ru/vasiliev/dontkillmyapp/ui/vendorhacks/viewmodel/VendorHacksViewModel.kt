package ru.vasiliev.dontkillmyapp.ui.vendorhacks.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import ru.vasiliev.dontkillmyapp.domain.interactor.VendorHacksInteractor
import javax.inject.Inject

class VendorHacksViewModel @Inject constructor(
    private val handle: SavedStateHandle,
    private val interactor: VendorHacksInteractor
) :
    ViewModel() {
}
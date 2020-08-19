package ru.vasiliev.dontkillmyapp.ui.vendorhacks

import androidx.lifecycle.ViewModel
import ru.vasiliev.dontkillmyapp.domain.interactor.VendorHacksInteractor
import javax.inject.Inject

class VendorHacksViewModel @Inject constructor(private val interactor: VendorHacksInteractor) :
    ViewModel() {

}
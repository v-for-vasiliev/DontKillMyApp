package ru.vasiliev.dontkillmyapp.domain.interactor

import io.reactivex.rxjava3.core.Single
import ru.vasiliev.dontkillmyapp.di.scope.AppScope
import ru.vasiliev.dontkillmyapp.domain.model.VendorHackModel
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHackRepository
import javax.inject.Inject

@AppScope
class VendorHackInteractor @Inject constructor(private val repository: VendorHackRepository) {
    fun loadHacks(): Single<VendorHackModel> = repository.loadHacks()
}
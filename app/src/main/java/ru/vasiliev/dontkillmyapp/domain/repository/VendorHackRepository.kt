package ru.vasiliev.dontkillmyapp.domain.repository

import io.reactivex.rxjava3.core.Single
import ru.vasiliev.dontkillmyapp.domain.model.VendorHackModel

interface VendorHackRepository {
    fun loadHacks(): Single<VendorHackModel>
}
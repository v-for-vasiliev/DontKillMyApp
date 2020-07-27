package ru.vasiliev.dontkillmyapp.domain.repository

import io.reactivex.rxjava3.core.Observable
import ru.vasiliev.dontkillmyapp.domain.model.VendorHacksModel

interface VendorHacksRepository {
    fun loadHacks(): Observable<VendorHacksModel>
}
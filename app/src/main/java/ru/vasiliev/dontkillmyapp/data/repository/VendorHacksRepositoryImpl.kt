package ru.vasiliev.dontkillmyapp.data.repository

import io.reactivex.rxjava3.core.Observable
import ru.vasiliev.dontkillmyapp.data.datasource.DontKillMyAppApi
import ru.vasiliev.dontkillmyapp.data.util.EntityMapper.toVendorHackModel
import ru.vasiliev.dontkillmyapp.domain.model.VendorHacksModel
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHacksRepository

class VendorHacksRepositoryImpl(private val api: DontKillMyAppApi) : VendorHacksRepository {
    override fun loadHacks(): Observable<VendorHacksModel> = api.loadHacks().map { it.toVendorHackModel() }
}
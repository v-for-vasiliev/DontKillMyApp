package ru.vasiliev.dontkillmyapp.data.repository

import io.reactivex.rxjava3.core.Single
import ru.vasiliev.dontkillmyapp.data.datasource.DontKillMyAppApi
import ru.vasiliev.dontkillmyapp.data.util.EntityMapper.toVendorHackModel
import ru.vasiliev.dontkillmyapp.domain.model.VendorHackModel
import ru.vasiliev.dontkillmyapp.domain.repository.VendorHackRepository

class VendorHackRepositoryImpl(private val api: DontKillMyAppApi) : VendorHackRepository {
    override fun loadHacks(): Single<VendorHackModel> = api.loadHacks().map { it.toVendorHackModel() }
}
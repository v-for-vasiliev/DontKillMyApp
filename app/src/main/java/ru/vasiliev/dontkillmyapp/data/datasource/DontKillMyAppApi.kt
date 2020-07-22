package ru.vasiliev.dontkillmyapp.data.datasource

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import ru.vasiliev.dontkillmyapp.data.entity.VendorHackEntity

interface DontKillMyAppApi {
    @GET("api/v1/output.json")
    fun loadHacks(): Single<VendorHackEntity>
}
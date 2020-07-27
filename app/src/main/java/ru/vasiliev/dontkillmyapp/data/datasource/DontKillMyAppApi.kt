package ru.vasiliev.dontkillmyapp.data.datasource

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import ru.vasiliev.dontkillmyapp.data.entity.VendorHacksEntity

interface DontKillMyAppApi {
    @GET("api/v1/output.json")
    fun loadHacks(): Observable<VendorHacksEntity>
}
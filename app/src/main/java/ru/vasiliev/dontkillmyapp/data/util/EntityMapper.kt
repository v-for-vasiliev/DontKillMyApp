package ru.vasiliev.dontkillmyapp.data.util

import ru.vasiliev.dontkillmyapp.data.entity.VendorHackEntity
import ru.vasiliev.dontkillmyapp.domain.model.VendorHackModel

object EntityMapper {
    fun VendorHackEntity.toVendorHackModel(): VendorHackModel =
        VendorHackModel(
            award,
            developer_solution,
            explanation,
            manufacturer,
            name,
            position,
            url,
            user_solution
        )
}
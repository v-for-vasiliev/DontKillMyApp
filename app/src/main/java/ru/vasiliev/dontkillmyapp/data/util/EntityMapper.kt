package ru.vasiliev.dontkillmyapp.data.util

import ru.vasiliev.dontkillmyapp.data.entity.VendorHacksEntity
import ru.vasiliev.dontkillmyapp.domain.model.VendorHacksModel

object EntityMapper {
    fun VendorHacksEntity.toVendorHackModel(): VendorHacksModel =
        VendorHacksModel(
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
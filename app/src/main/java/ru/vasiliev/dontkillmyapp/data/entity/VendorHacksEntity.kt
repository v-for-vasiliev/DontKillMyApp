package ru.vasiliev.dontkillmyapp.data.entity

data class VendorHacksEntity(
    val award: Int,
    val developer_solution: String,
    val explanation: String,
    val manufacturer: List<String>,
    val name: String,
    val position: Int,
    val url: String,
    val user_solution: String
)
package ru.vasiliev.dontkillmyapp.domain.model

data class VendorHackModel(
    val award: Int,
    val developer_solution: String,
    val explanation: String,
    val manufacturer: List<String>,
    val name: String,
    val position: Int,
    val url: String,
    val user_solution: String
)
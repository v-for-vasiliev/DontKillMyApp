package ru.vasiliev.dontkillmyapp.data.properties

interface PropertyStorage {
    fun setString(key: String, value: String)
    fun getString(key: String): String
}

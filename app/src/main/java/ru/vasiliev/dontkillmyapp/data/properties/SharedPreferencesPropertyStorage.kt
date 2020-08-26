package ru.vasiliev.dontkillmyapp.data.properties

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SharedPreferencesPropertyStorage @Inject constructor(
    @ApplicationContext context: Context
) : PropertyStorage {

    private val sharedPreferences =
        context.getSharedPreferences("app_properties", Context.MODE_PRIVATE)

    override fun setString(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    override fun getString(key: String): String {
        return sharedPreferences.getString(key, "")!!
    }
}

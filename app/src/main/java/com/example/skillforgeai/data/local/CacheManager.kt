package com.example.skillforgeai.data.local

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CacheManager(
    context: Context
) {

    private val prefs =
        context.getSharedPreferences(
            "SkillForgeAI_Cache",
            Context.MODE_PRIVATE
        )

    private val gson = Gson()

    fun saveString(
        key: String,
        value: String
    ) {

        prefs.edit()
            .putString(key, value)
            .apply()
    }

    fun getString(
        key: String
    ): String {

        return prefs.getString(
            key,
            ""
        ) ?: ""
    }

    fun saveObject(
        key: String,
        data: Any
    ) {

        val json =
            gson.toJson(data)

        prefs.edit()
            .putString(key, json)
            .apply()
    }

    private inline fun <reified T> getObject(
        key: String
    ): T? {

        val json =
            prefs.getString(key, null)

        return json?.let {

            gson.fromJson(
                it,
                object : TypeToken<T>() {}.type
            )
        }
    }

    fun remove(
        key: String
    ) {

        prefs.edit()
            .remove(key)
            .apply()
    }

    fun clearCache() {

        prefs.edit()
            .clear()
            .apply()
    }
}
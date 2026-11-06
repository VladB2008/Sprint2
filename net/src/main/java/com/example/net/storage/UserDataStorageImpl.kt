package com.example.net.storage

import android.content.Context
import androidx.core.content.edit
import com.example.net.common.ret.ContextHolder

class UserDataStorageImpl : UserDataStorage {

    val pref = ContextHolder.getContext().applicationContext.getSharedPreferences("user", Context.MODE_PRIVATE)

    override fun saveToken(token: String) {
        pref.edit {
            putString("token", token)
        }
    }

    override fun getToken(): String {
        return pref.getString("token", null) ?: ""
    }

    }


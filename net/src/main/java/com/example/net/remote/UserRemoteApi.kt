package com.example.net.remote

import android.util.Log
import com.example.net.api.UserAplInterface
import com.example.net.common.ret.userApi
import com.example.net.dto.RegDto

class UserRemoteApi (
val api: UserAplInterface = userApi

) {

    suspend fun reg(regDto: RegDto): Boolean {
        try {
            var res = api.reg(body = regDto)

            if (!res.isSuccessful) {

                val res2 = res.errorBody()?.toString()
                Log.i("reg", res2 ?: "ошибка в регистрации")
                Log.i("reg", res2.toString())
                Log.i("reg", res2 ?: "ошибка в регистрации")
                Log.i("reg", res2 ?: "ошибка в регистрации")
                return false
            }
            return true
        }catch (lin: Exception){
            throw Exception("что-то пошло не так: $lin")
        }
    }




}
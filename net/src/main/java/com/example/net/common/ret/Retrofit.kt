package com.example.net.common.ret

import com.example.net.api.UserAplInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val ret = Retrofit.Builder()      // Настройка работы ретрофит
    .baseUrl("https://otbor.api.alspio.com/api/")       // Главный базовый адрес вашего сервера.
    .addConverterFactory(GsonConverterFactory.create())
//    .client(OkHttpClient().newBuilder().addInterceptor(TokenInterceptor()).build())     // Проводник запросов на сервер

    .build()      // Собрать все вме
val userApi = ret.create<UserAplInterface>()
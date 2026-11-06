package com.example.net.common.ret

import com.example.net.storage.UserDataStorageImpl
import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
val token = UserDataStorageImpl().getToken()

        return chain.proceed(
            chain.request().newBuilder().addHeader("Authorization", "Bearer $token").build()
        )
    }
}
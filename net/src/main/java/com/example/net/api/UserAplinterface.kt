package com.example.net.api

import com.example.net.dto.RegDto
import com.example.net.dto.UserDto
import com.example.net.dto.UserLogin
import com.example.net.dto.UserToken
import retrofit2.Response

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserAplInterface{

    @POST("collections/users/records")
    suspend fun reg(@Body body: RegDto): Response<Unit>

    @POST("/collections/users/auth-with-password")
    suspend fun auth(@Body body: UserLogin): Response<UserToken>

    @GET("/collections/users/records/{id}")
    suspend fun getProf(@Path("id") id: String): Response<UserDto>

}
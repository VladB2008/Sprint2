package com.example.net.dto

data class RegDto (
    val phone: String,
    val password: String,
    val passwordConfirm: String,
    val name: String
    )

data class UserDto(
    val phone: String,
    val name: String
)

data class UserLogin(
    val identity: String,
    val password: String,
)

data class UserId(
    val id: String,
)

data class UserToken(
    val token: String,
    val record: UserId
)